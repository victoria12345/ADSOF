package grafos;

import java.util.*;

public abstract class Grafo<T> {
	/**
	 * Numero de vertices del grafo
	 */
	protected int nVertices = 0;
	/**
	 * Numero de aristas del grafo
	 */
	protected int nAristas = 0;
	/**
	 * Mapa de los vertices, a clave es el identificador
	 */
	protected Map<Integer, Vertice<T>> vertices = new TreeMap<>();
	/**
	 * Mapa de las aristas, el doble es el peso del  arco
	 */
	protected Map<List<Vertice<T>>, Double> aristas = new HashMap<>();
	
	/**
	 * Constructur de un grafo
	 */
	public Grafo(){
		
	}
	/**
	 * Annade un vertice al grafo
	 * @param datos datos del vertice
	 * @return vertice annadido o null en caso de error
	 */
	public Vertice<T> addVertice(T datos){
		if(datos == null) {
			return null;
		}
		
		return addVertice(nVertices, datos);
	}
	
	/**
	 * Annade vertice al grafo
	 * @param id id del nuevo vertice
	 * @param datos datos del nuevo vertice
	 * @return vertice annadido
	 */
	protected Vertice<T> addVertice(int id, T datos){
		Vertice<T> v = new Vertice<T>(id, datos);
		
		/*El control de errores se realiza previamente a llamar a esta funcion*/
		
		this.nVertices++;
		vertices.put(id, v);
		return v;
	}
	
	/**
	 * @return lista de vertices del grafo
	 */
	public List<Vertice<T>> getVertices(){
		List<Vertice<T>> lista = new ArrayList<>();
		
		for(int i = 0; i < vertices.size(); i++) {
			lista.add(vertices.get(i));
		}
		
		return lista;
	}
	
	/**
	 * @return numero de vertices del grafo
	 */
	public int getNumVertices() {
		return this.nVertices;
	}
	
	/**
	 * Annade un arco al grafo
	 * @param v1 primer extremo del arco
	 * @param v2 segundo extremo
	 * @param peso peso del arco
	 */
	public abstract void addArco(Vertice<T> v1, Vertice<T> v2, double peso);
	
	/**
	 * Comprueba si existe un arco en el vertice
	 * @param v1 origen arco
	 * @param v2 destino arco
	 * @return true si existe false si no
	 */
	public boolean existeArco(Vertice<T> v1, Vertice<T> v2) {
		
		if(v1 == null || v2 == null) {
			return false;
		}
		
		if(aristas.containsKey(Arrays.asList(v1,v2))) {
			return true;
		}
		
		return false;
	}
	
	/**
	 * @return numero de arcos del grafo
	 */
	public int getNumArcos() {
		return this.nAristas;
	}
	
	/**
	 * Devuelve el peso de un arco
	 * @param v1 primer vertice del arco
	 * @param v2 segundo vertice de arco
	 * @return peso del arco, 0 en caso de error
	 */
	public abstract double getPesoDe(Vertice<T> v1, Vertice<T> v2);
	
	/**
	 * Devuelve los verticesque tienen un arco con v
	 * @param v vertice del que se buscan los vecinos
	 * @return lista de vertices o null en caso de error
	 */
	public abstract List<Vertice<T>> getVecinosDe(Vertice<T> v);
	
	/**
	 * @return String con los vertices ordenados
	 */
	public String toString() {
		String cadena = "";
		for(int i = 0; i < vertices.size(); i++) {
			cadena+= vertices.get(i);
		}
		
		return cadena;
	}
}
