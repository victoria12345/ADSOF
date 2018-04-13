package Individuo;

import java.util.ArrayList;
import java.util.List;

import inodo.INodo;
import inodo.Nodo;
import inodo.funcion.Function;
import inodo.terminal.Terminal;


public class Individuo implements IIndividuo{
	private double fitness;
	private Nodo raiz;
	private List<INodo> etiquetados;

	@Override
	/**
	 * @return el nodo raiz
	 */
	public INodo getExpresion() {

		return raiz;
	}

	@Override
	/**
	 * Cambia el nodo raiz
	 * @param expresion nuevo nodo raiz
	 */
	public void setExpresion(INodo expresion) {
		raiz = (Nodo)expresion;

	}

	@Override
	public double getFitness() {

		return fitness;
	}

	@Override
	public void setFitness(double fitness) {
		this.fitness = fitness;

	}

	@Override
	public void crearIndividuoAleatorio(int profundidad, List<Terminal> terminales, List<Function> funciones) {
		if(profundidad == 0) {
			INodo f = funciones.get( (int) (Math.random()*funciones.size())).copy();
			int pos1, pos2;
			INodo t1;
			INodo t2;
			pos1 = (int) (Math.random()*funciones.size());
			pos2 = (int) (Math.random()*funciones.size());
			
			t1 = terminales.get(pos1).copy();
			t2 = terminales.get(pos2).copy();
			
			f.incluirDescendiente(t1);
			f.incluirDescendiente(t2);
			
			this.raiz = (Nodo) f;
		}

	}

	@Override
	public double calcularExpresion() {

		return raiz.calcular();
	}

	@Override
	public void writeIndividuo() {
		System.out.println(raiz);

	}

	public void etiquetaNodos() {
		this.etiquetados = crearLista(raiz);
		for(int i = 0; i < etiquetados.size(); i++) {
			etiquetados.get(i).setEtiqueta(i+1);
		}
	}

	public List<INodo> getEtiquetados() {
		return etiquetados;
	}

	public void setEtiquetados(List<INodo> etiquetados) {
		this.etiquetados = etiquetados;
		for(int i = 0; i < etiquetados.size(); i++) {
			etiquetados.get(i).setEtiqueta(i+1);
		}
	}


	private List<INodo> crearLista(INodo raiz){
		List<INodo> nodos, dch = new ArrayList<>();
		nodos = new ArrayList<>();
		INodo tmp , izq;

		nodos.add(raiz);
		if(raiz.getDescendientes().size() == 0) {
			return nodos;
		}
		izq =raiz.getDescendientes().get(0);
		dch.add(raiz.getDescendientes().get(1));

		while(dch.size() > 0 || izq != null) {
			if(izq != null) {
				nodos.add(izq);
				if(izq.getDescendientes().size() == 2) {
					dch.add(izq.getDescendientes().get(1));
					izq = izq.getDescendientes().get(0);
				}else {
					izq = null;
				}
			}else {
				tmp = dch.get(dch.size() -1);
				//eliminamos el nodo de la lista de los de la derecha
				dch.remove(tmp);
				nodos.add(tmp);
				if(tmp.getDescendientes().size() == 2) {
					dch.add(tmp.getDescendientes().get(1));
					izq = tmp.getDescendientes().get(0);
				}else {
					izq = null;
				}
			}	
		}
		return nodos;
	}

	public IIndividuo copy() {
		IIndividuo copia = new Individuo();
		List <INodo> nodos = new ArrayList<>();
		copia.setExpresion(raiz.copy());

		for(int i = 0; i < etiquetados.size(); i++) {
			nodos.add(etiquetados.get(i).copy());
		}

		((Individuo) copia).setEtiquetados(nodos);
		return copia;

	}


}
