package algoritmo;

import inodo.terminal.*;
import inodo.funcion.*;
import java.util.*;

import Individuo.IIndividuo;
import Individuo.Individuo;
import dominio.IDominio;
import excepciones.ArgsDistintosFuncionesException;
import excepciones.CruceNuloException;

public class Algoritmo implements IAlgoritmo{
	private List<Terminal> terminales;
	private List<Function> funciones;
	private List<IIndividuo> poblacion;
	
	private double generaciones_max = 0;
	private int nIndividuos ;
	private int generacion = 0;
	private int profundidad;
	private int K;
	private int prob;
	
	public Algoritmo(int prof_max, int nIndividuos, int prob, int generac_max, int K) {
		this.nIndividuos = nIndividuos;
		this.profundidad = prof_max;
		this.prob = prob;
		this.generaciones_max = generac_max;
		this.K = K;
	}
	
	public int getK() {
		return K;
	}

	public void setK(int k) {
		K = k;
	}

	public int getProb() {
		return prob;
	}

	public void setProb(int prob) {
		this.prob = prob;
	}

	public void setGeneraciones_max(double generaciones_max) {
		this.generaciones_max = generaciones_max;
	}

	@Override
	public void defineConjuntoTerminales(List<Terminal> terminales) {
		this.terminales = terminales;

	}
	@Override
	public void defineConjuntoFunciones(List<Function> funciones) throws ArgsDistintosFuncionesException {
		this.funciones = funciones;

	}
	@Override
	public void crearPoblacion() {
		for(int i = 0; i < nIndividuos; i++) {
			IIndividuo in = new Individuo();
			in.crearIndividuoAleatorio(profundidad, terminales, funciones);
			poblacion.add(in);
		}

	}
	@Override
	public List<IIndividuo> cruce(IIndividuo prog1, IIndividuo prog2) throws CruceNuloException {

		return cruce(prog1, prog2);
	}
	@Override
	public void crearNuevaPoblacion() {
		if(nIndividuos < 2) {
			return;
		}else if(nIndividuos == 2){
			List<IIndividuo> poblacion2 = new ArrayList<>();
			try {
				poblacion2.addAll(cruce(poblacion.get(0), poblacion.get(1)));
			} catch (CruceNuloException e) {
				e.printStackTrace();
			}
			poblacion = poblacion2;
			nIndividuos = 2;
		}else {
			//elegi mos el mejor individuo que ese pasa directo
			List<IIndividuo> poblacion2 = new ArrayList<>();
			double max = poblacion.get(0).getFitness();
			int indiv = 0;
			for(int i = 1; i < poblacion.size(); i++) {
				if(poblacion.get(i).getFitness() > max) {
					max = poblacion.get(i).getFitness();
					indiv = i;
				}
			}
			
			poblacion2.add(poblacion.get(indiv));
			
			//Porcentaje de individuos que pasan directamente a la siguiente generacion
			while(poblacion2.size() < poblacion.size() * (1 - prob)) {
				max = poblacion.get(0).getFitness();
				indiv = 0;
				for(int i = 1; i < poblacion.size(); i++) {
					//buscamos maximo de los que no pertenecen ya a la poblacion 2
					if(poblacion.get(i).getFitness() > max && poblacion2.contains(poblacion.get(i)) == false) {
						max = poblacion.get(i).getFitness();
						indiv = i;
					}
				}
				poblacion2.add(poblacion.get(indiv));
			}
			
			//Cruzamos k individuos aleatoriamente
			int[] index = new int[K];
					
			for(int i = 0; i < K; i++) {
				index[i] = (int) (Math.random()*poblacion.size());
			}
			
			for(int i  = 0; i < index.length; i+=2) {
				try {
					poblacion2.addAll(cruce(poblacion.get(index[i]), poblacion.get(index[i+1])));
				} catch (CruceNuloException e) {
					e.printStackTrace();
				}
			}
			
			nIndividuos = poblacion2.size();
			generacion += 1;
			poblacion = poblacion2;
			
		}
	}
	public List<Terminal> getTerminales() {
		return terminales;
	}
	public List<Function> getFunciones() {
		return funciones;
	}
	public List<IIndividuo> getPoblacion() {
		return poblacion;
	}
	public void setPoblacion(List<IIndividuo> poblacion) {
		this.poblacion = poblacion;
	}
	public int getnIndividuos() {
		return nIndividuos;
	}
	public void setnIndividuos(int nIndividuos) {
		this.nIndividuos = nIndividuos;
	}
	public int getGeneracion() {
		return generacion;
	}
	public void setGeneracion(int generacion) {
		this.generacion = generacion;
	}
	@Override
	public void ejecutar(IDominio dominio) {
		//Creamos la  poblacion y calculamos el fitnes de los individuos
		this.crearNuevaPoblacion();
		for(int i = 0; i < poblacion.size(); i++) {
			double fitness = dominio.calcularFitness(poblacion.get(i));
			
			poblacion.get(i).setFitness(fitness);
		}
		
		while(generacion < generaciones_max) {
			this.crearNuevaPoblacion();
			
			for(int i = 0; i < poblacion.size(); i++) {
				double fitness = dominio.calcularFitness(poblacion.get(i));
				
				poblacion.get(i).setFitness(fitness);
			}
		}
		
	}

	public double getGeneraciones_max() {
		return generaciones_max;
	}
}
