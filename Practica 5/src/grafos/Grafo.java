package grafos;

import java.util.*;

public abstract class Grafo<T> {

	protected Map<Integer, Vertice<T>> vertices;
	private List<Vertice<T>> vertices_list;
	private int id_vertice = 0;
	
	/**
	 * Annade un vertice al grafo
	 * @param datos datos del vertice que se deasea annadir
	 * @return vertice que se ha annadido
	 * 
	 * @author Vctoria Pelayo e Ignacio Rabunnal
	 */
	public Vertice<T> addVertice(T datos){
		Vertice v = new Vertice(datos);
		vertices_list.add(v);
		return v;
	}
	
	/**
	 * Annade un vertice al grafo
	 * @param id identificador de la arista 
	 * @param datos datos del vertice que se annade
	 * @return vertice que se annade al grafo
	 * 
	 * @author Vctoria Pelayo e Ignacio Rabunnal
	 */
	protected Vertice<T> addVertice(int id, T datos){
		Vertice v = new Vertice(datos);
		vertices.put(id, v);
		
		return v;
	}
	
	/**
	 * @return lista de vertices del grafo
	 * 
	 * @author Vctoria Pelayo e Ignacio Rabunnal
	 */
	public List<Vertice<T>> getVertices(){
		return vertices_list;
	}
	
	/**
	 * @return numero vertices del grafo
	 * 
	 * @author Vctoria Pelayo e Ignacio Rabunnal
	 */
	public int getNumVertices() {
		return vertices_list.size();
	}
	
	/**
	 * Annade arsta al grafo
	 * @param v1 extremo de la arista
	 * @param v2 extremo de la arista
	 * @param peso peso de la arista
	 * 
	 * @author Vctoria Pelayo e Ignacio Rabunnal
	 */
	public abstract void addArco(Vertice<T> v1, Vertice<T> v2, double peso);
	
	/**
	 * @param v1 posible extremo de arista
	 * @param v2 posible extremo de arista
	 * @return true si existe un arco que los une y false si no es asi
	 * 
	 * @author Vctoria Pelayo e Ignacio Rabunnal
	 */
	public boolean existeArco(Vertice<T> v1, Vertice<T> v2) {
		return false;
		//REVISAAAAAAAAAAAAAR
	}
	
	/**
	 * @return numero de arcos del grafo
	 * 
	 * @author Vctoria Pelayo e Ignacio Rabunnal
	 */
	public int getNumArcos() {
		return 0;
	}
	
	/**
	 * @param v1 vertice extremo de un arco
	 * @param v2 vertice extremo de un arco
	 * @return el peso de ese arcp y -1 en caso de error
	 * 
	 * @author Vctoria Pelayo e Ignacio Rabunnal
	 */
	public abstract double getPesoDe(Vertice<T> v1, Vertice<T> v2);
	
	/**
	 * @param v vertice cuyos vecinos se buscan
	 * @return lista de los vecinos del vertice
	 * 
	 * @author Vctoria Pelayo e Ignacio Rabunnal
	 */
	public abstract List<Vertice<T>> getVecinosDe(Vertice<T> v); // devuelve los vértices que tienen un arco con v
	 // (en grafo dirigido, v ha de ser origen de los arcos)
	/**
	 * @return cadena de caracteres con los datos del grafo
	 * 
	 * @author Vctoria Pelayo e Ignacio Rabunnal
	 */
	public String toString() {
		return null;
	}
}
