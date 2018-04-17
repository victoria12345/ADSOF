package algoritmo;

import inodo.terminal.*;
import inodo.funcion.*;
import java.util.*;

import Individuo.IIndividuo;
import Individuo.Individuo;
import dominio.IDominio;
import excepciones.ArgsDistintosFuncionesException;
import excepciones.CruceNuloException;

/**
 * Descripcion de la clase Algoritmo
 * 
 * @author Victoria Pelayo e Ignacio Rabunnal
 */
public class Algoritmo implements IAlgoritmo{
	private List<Terminal> terminales = new ArrayList<>();
	private List<Function> funciones = new ArrayList<>();
	private List<IIndividuo> poblacion = new ArrayList<>();
	
	private double generaciones_max = 0;
	private int nIndividuos ;
	private int generacion = 0;
	private int profundidad;
	private int K;
	private double prob;
	
	/**
	 * Constructor de la clase Algoritmo
	 * @param prof_max maxima profundidad que se puede tener
	 * @param nIndividuos numero de individuos de la poblacion incial
	 * @param d probabilidad sobre el cruce
	 * @param generac_max numero maximo de generaciones
	 * @param K numero de individuos que pasan directamente
	 * 
	 * @author Victoria Pelayo e Ignacio Rabunnal
	 */
	public Algoritmo(int prof_max, int nIndividuos, double d, int generac_max, int K) {
		this.nIndividuos = nIndividuos;
		this.profundidad = prof_max;
		this.prob = d;
		this.generaciones_max = generac_max;
		this.K = K;
	}
	
	/**
	 * @return K numero de individuos que pasan directos 
	 * 
	 * @author Victoria Pelayo e Ignacio Rabunnal
	 */
	public int getK() {
		return K;
	}

	/**
	 * Cambia la K del individuo
	 * @param k nueva K
	 * 
	 * @author Victoria Pelayo e Ignacio Rabunnal
	 */
	public void setK(int k) {
		K = k;
	}

	/**
	 * @return probabilidad del cruce del algortimo
	 * 
	 * @author Victoria Pelayo e Ignacio Rabunnal
	 */
	public double getProb() {
		return prob;
	}

	/**
	 * Cambia la probabilidad del cruce
	 * @param prob nueva probabilidad
	 * 
	 * @author Victoria Pelayo e Ignacio Rabunnal
	 */
	public void setProb(double prob) {
		this.prob = prob;
	}

	/**
	 * Cambia el numero de generaciones maximo
	 * @param generaciones_max nuevo numero de generaciones maximo
	 * 
	 * @author Victoria Pelayo e Ignacio Rabunnal
	 */
	public void setGeneraciones_max(double generaciones_max) {
		this.generaciones_max = generaciones_max;
	}

	@Override
	/**
	 * Define conjunto terminales del algoritmo
	 * @param terminales lista de los terminales
	 * 
	 * @author Victoria Pelayo e Ignacio Rabunnal
	 */
	public void defineConjuntoTerminales(List<Terminal> terminales) {
		this.terminales = terminales;

	}
	@Override
	/**
	 * Define conjunto funciones del algoritmo
	 * @param funciones lista de las funciones
	 * @throws ArgsDistintosFuncionesException
	 * 
	 * @author Victoria Pelayo e Ignacio Rabunnal
	 */
	public void defineConjuntoFunciones(List<Function> funciones) throws ArgsDistintosFuncionesException {
		this.funciones = funciones;

	}
	@Override
	/**
	 * Crea la poblacion inicial
	 * 
	 * @author Victoria Pelayo e Ignacio Rabunnal
	 */
	public void crearPoblacion() {
		for(int i = 0; i < nIndividuos; i++) {
			IIndividuo in = new Individuo();
			in.crearIndividuoAleatorio(profundidad, terminales, funciones);
			poblacion.add(in);
		}

	}
	@Override
	/**
	 * Devuelve lista de individuos resultantes de un cruce
	 * @param prog1 individuo que se quiere cruzar
	 * @param prog2 individuo que se quiere cruzar
	 * @throws CruceNuloException
	 * @return lista de los hijos resultantes
	 * 
	 * @author Victoria Pelayo e Ignacio Rabunnal
	 */
	public List<IIndividuo> cruce(IIndividuo prog1, IIndividuo prog2) throws CruceNuloException {
		PruebaCruce p = new PruebaCruce();

		return p.cruce(prog1, prog2);
	}
	@Override
	/**
	 * Crea una nueva poblacion a partir de la actual
	 * 
	 * @author Victoria Pelayo e Ignacio Rabunnal
	 */
	public void crearNuevaPoblacion() {
		
		if(generacion == generaciones_max) {
			return;
		}
		if(poblacion.size() < 2) {
			return;
		}else if(poblacion.size() == 2){
			List<IIndividuo> poblacion2 = new ArrayList<>();
			try {
				poblacion2.addAll(cruce(poblacion.get(0), poblacion.get(1)));
			} catch (CruceNuloException e) {
				e.printStackTrace();
			}
			poblacion = poblacion2;
			nIndividuos = 2;
		}else {
			List<IIndividuo> tmp = new ArrayList<>();
			List<IIndividuo> poblacion2 = new ArrayList<>();
			List <IIndividuo> padres = new ArrayList<>();
			List <IIndividuo> cruce = new ArrayList<>();
			//individuos que pasan directos
			List <IIndividuo> aux = new ArrayList<>();
			
			
			tmp.addAll(poblacion);
			int i = 0;
			
			//elegimos el 1-prob de individuos que pasan directos
			
			while(i < (int)tmp.size()*(1-prob)) {
				IIndividuo max = tmp.get(0);
				for(int j = 0; j < tmp.size(); j++) {
					if(tmp.get(j).getFitness() > max.getFitness()) {
						max = tmp.get(j);
					}
				}
				aux.add(max);
				tmp.remove(max);
				i++;
			}
			poblacion2.addAll(aux);
			System.out.println("Individuos que pasan directos: "+poblacion2);
			
			//Elegimos individuos que se van a cruzar
			i = 0;
			
			while(i < K){
				IIndividuo j = tmp.get((int) (Math.random()*aux.size()));
				padres.add(j);
				tmp.remove(j);
				i++;
				
			}
			
			System.out.println("Candidatos para cruzarse: "+padres);
			
			//elegimos los dos mejores padres
			i = 0;
			while(i < 2) {
				IIndividuo max = padres.get(0);
				for(int j = 0; j < padres.size(); j++) {
					if(padres.get(j).getFitness() > max.getFitness()) {
						max = padres.get(j);
					}
				}
				cruce.add(max);
				padres.remove(max);
				i++;
			}
			System.out.println("Individuos que se cruzan: "+cruce);
			
			//Annadimos los hijos a la nueva poblacion
			
			try {
				poblacion2.addAll(cruce(cruce.get(0), cruce.get(1)));
			} catch (CruceNuloException e) {
				e.printStackTrace();
			}
			
			System.out.println("Poblacion total final: "+ poblacion2);
			
			nIndividuos = poblacion2.size();

			this.setPoblacion(poblacion2);
			
		}
	}
	/**
	 * @return lista de terminales del algoritmo
	 * 
	 * @author Victoria Pelayo e Ignacio Rabunnal
	 */
	public List<Terminal> getTerminales() {
		return terminales;
	}
	
	/**
	 * @return lista de funciones del algoritmo
	 * 
	 * @author Victoria Pelayo e Ignacio Rabunnal
	 */
	public List<Function> getFunciones() {
		return funciones;
	}
	
	/**
	 * @return lista de individuos actuales del algoritmo
	 * 
	 * @author Victoria Pelayo e Ignacio Rabunnal
	 */
	public List<IIndividuo> getPoblacion() {
		return poblacion;
	}
	
	/**
	 * Cambia poblacion del algoritmo
	 * @param poblacion lista de individuos, nueva poblacion
	 * 
	 * @author Victoria Pelayo e Ignacio Rabunnal
	 */
	public void setPoblacion(List<IIndividuo> poblacion) {
		this.poblacion = poblacion;
		this.nIndividuos = poblacion.size();
	}
	
	/**
	 * @return numero de individuos en la poblacion
	 * 
	 * @author Victoria Pelayo e Ignacio Rabunnal
	 */
	public int getnIndividuos() {
		return nIndividuos;
	}
	
	/**
	 * Cambia numero de individuos de una poblacion
	 * @param nIndividuos numero de individuos nuevo
	 * 
	 * @author Victoria Pelayo e Ignacio Rabunnal
	 */
	public void setnIndividuos(int nIndividuos) {
		this.nIndividuos = nIndividuos;
	}
	
	/**
	 * @return numero de la generacion actual
	 * 
	 * @author Victoria Pelayo e Ignacio Rabunnal
	 */
	public int getGeneracion() {
		return generacion;
	}
	
	/**
	 * Cambia la generacion de la poblacion
	 * @param generacion nuevo numero de generacion
	 * 
	 * @author Victoria Pelayo e Ignacio Rabunnal
	 */
	public void setGeneracion(int generacion) {
		this.generacion = generacion;
	}
	
	@Override
	/**
	 * ejecuta el algoritmo
	 * @param dominio dominio para calcular los fitness de la poblacion
	 * 
	 * @author Victoria Pelayo e Ignacio Rabunnal
	 */
	public void ejecutar(IDominio dominio) {
		//Creamos la  poblacion y calculamos el fitnes de los individuos
		this.crearPoblacion();
		System.out.println(this);
		
		for(int i = 0; i < poblacion.size(); i++) {
			double fitness = dominio.calcularFitness(poblacion.get(i));
			
			poblacion.get(i).setFitness(fitness);
		}
		
		while(generacion < generaciones_max) {
			
			System.out.println("Generacion: "+generacion+" maximo: "+ generaciones_max);
			
			this.crearNuevaPoblacion();
			
			//escribimos el fitness de cada individuo
			for(int i = 0; i < poblacion.size(); i++) {
				double fitness = dominio.calcularFitness(poblacion.get(i));
				
				poblacion.get(i).setFitness(fitness);
			}
			
			generacion++;
			System.out.println(this.toString());
		}
		
	}

	/**
	 * @return numero maximo de generaciones
	 * 
	 * @author Victoria Pelayo e Ignacio Rabunnal
	 */
	public double getGeneraciones_max() {
		return generaciones_max;
	}
	
	public String toString() {
		String algoritmo = "";
		for(int i = 0; i < poblacion.size(); i++) {
			algoritmo += ("INDIVIDUO "+ i+ "\n"+ poblacion.get(i)+ "\n----------------\n");
		}
		algoritmo += "Profundidad: "+ profundidad + "\n";
		algoritmo += "Generacion: " + generacion + "\n";
		
		return algoritmo;
	}
}
