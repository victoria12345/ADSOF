package Individuo;

import java.util.ArrayList;
import java.util.List;

import inodo.INodo;
import inodo.Nodo;
import inodo.funcion.Function;
import inodo.terminal.Terminal;

/**
 * Descripcion de la clase Individuo
 * 
 * @author Victoria Pelayo e Ignacio Rabunnal
 */
public class Individuo implements IIndividuo{
	private double fitness;
	private INodo raiz;
	private List<INodo> etiquetados = new ArrayList<>();

	@Override
	/**
	 * @return el nodo raiz
	 * 
	 * @author Victoria Pelayo e Ignacio Rabunnal
	 */
	public INodo getExpresion() {

		return raiz;
	}

	@Override
	/**
	 * Cambia el nodo raiz
	 * @param expresion nuevo nodo raiz
	 * 
	 * @author Victoria Pelayo e Ignacio Rabunnal
	 */
	public void setExpresion(INodo expresion) {
		raiz = (Nodo)expresion;

	}

	@Override
	/**
	 * @return el fitnes de un individuo
	 * 
	 * @author Victoria Pelayo e Ignacio Rabunnal
	 */
	public double getFitness() {

		return fitness;
	}

	@Override
	/**
	 * Cambia el fitnes de un individuo
	 * @param fitness nuevo fitnes asociado al individuo
	 * 
	 * @author Victoria Pelayo e Ignacio Rabunnal
	 */
	public void setFitness(double fitness) {
		this.fitness = fitness;

	}

	@Override
	/**
	 * Crea un individuo aleatorio
	 * @param profundidad profundidad que tiene que tener el individuo
	 * @param terminales lista de los posibles terminales del individuo
	 * @param funciones lista de las posibles funciones del individuo
	 * 
	 * @author Victoria Pelayo e Ignacio Rabunnal
	 */
	public void crearIndividuoAleatorio(int profundidad, List<Terminal> terminales, List<Function> funciones) {
		
		if(terminales.size() == 0 || funciones.size() == 0) {
			System.out.println("ERROR: Annadir lista de terminales y funciones");
			return;
		}
		
		this.raiz = nodo_aleat(profundidad, terminales, funciones);

	}
	
	/**
	 * Funcion privada que devuelve un nodo aleatorio
	 * @param profundidad profundidad que tendra el nodo
	 * @param terminales lista de los posbiles terminales que tendra
	 * @param funciones lista d elas posibles funciones que tendra
	 * @return un nodo aleatorio
	 * 
	 * @author Victoria Pelayo e Ignacio Rabunnal
	 */
	private INodo nodo_aleat (int profundidad, List<Terminal> terminales, List<Function> funciones) {
		
		if(profundidad == 0) {
			INodo x = terminales.get((int) (Math.random()*terminales.size())).copy();
			return  x;
		
		}else {
			INodo f = funciones.get( (int) (Math.random()*funciones.size())).copy();
			
			for(int i = 0; i< ((Function)f).getnNodos(); i++) {
				f.incluirDescendiente(nodo_aleat(profundidad - 1, terminales, funciones));
			}
			
			return f;
		}
	}

	@Override
	/**
	 * @return resultado de calcular la expresion del nodo raiz
	 * 
	 * @author Victoria Pelayo e Ignacio Rabunnal
	 */
	public double calcularExpresion() {

		return raiz.calcular();
	}

	@Override
	/**
	 * Escribe la raiz por pantalla
	 * 
	 * @author Victoria Pelayo e Ignacio Rabunnal
	 */
	public void writeIndividuo() {
		System.out.println(raiz);

	}

	/**
	 * Etiqueta los nodos de un individuo
	 * 
	 * @author Victoria Pelayo e Ignacio Rabunnal
	 */
	public void etiquetaNodos() {
		this.etiquetados = crearLista(raiz);
		for(int i = 0; i < etiquetados.size(); i++) {
			etiquetados.get(i).setEtiqueta(i+1);
		}
	}

	/**
	 * Devuelve una lista de nodos en orden de etiqueta
	 * @return la lista de los etiquetados del individuo
	 * 
	 * @author Victoria Pelayo e Ignacio Rabunnal
	 */
	public List<INodo> getEtiquetados() {
		return etiquetados;
	}

	/**
	 * Cambia la lista de etiquetados
	 * @param etiquetados nueva lista de etiquetados
	 * 
	 * @author Victoria Pelayo e Ignacio Rabunnal
	 */
	public void setEtiquetados(List<INodo> etiquetados) {
		this.etiquetados = etiquetados;
		for(int i = 0; i < etiquetados.size(); i++) {
			etiquetados.get(i).setEtiqueta(i+1);
		}
	}

	/**
	 * Funcion auxiliar para crear la lista de etiquetados
	 * @param raiz raiz de los nodos que se van a etiquetar
	 * @return lista de los nodos en orden de etiqueta
	 * 
	 * @author Victoria Pelayo e Ignacio Rabunnal
	 */
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

	/**
	 * HAce una copia del individuo
	 * @return individuo copia del original
	 * 
	 * @author Victoria Pelayo e Ignacio Rabunnal
	 */
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
	
	public String toString() {
		return raiz.toString();
	}


}
