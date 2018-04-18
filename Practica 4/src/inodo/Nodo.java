package inodo;

import java.util.*;

/**
 * Descripcion de la clase Nodo
 * 
 * @author Victoria Pelayo e Ignacio Rabunnal
 */
public abstract class Nodo implements INodo{

	private String nombre;
	private List<INodo> descendientes = new ArrayList<>();
	private INodo padre = null;
	private int etiqueta;

	/**
	 * @return etiqueta de un Nodo
	 * 
	 * @author Victoria Pelayo e Ignacio Rabunnal
	 */
	public int getEtiqueta() {
		return etiqueta;
	}

	/**
	 * Cambia la etiqueta de un Nodo
	 * @param etiqueta nueva etiqueta del nodo
	 * 
	 * @author Victoria Pelayo e Ignacio Rabunnal
	 */
	public void setEtiqueta(int etiqueta) {
		this.etiqueta = etiqueta;
	}

	/**
	 * @return padre del nodo
	 * 
	 * @author Victoria Pelayo e Ignacio Rabunnal
	 */
	public INodo getPadre() {
		return padre;
	}

	/**
	 * Cambia el padre de un nodo
	 * @param padre nuevo padre del nodo
	 * 
	 * @author Victoria Pelayo e Ignacio Rabunnal
	 */
	public void setPadre(INodo padre) {
		this.padre = padre;
	}

	/**
	 * Constructor de la clase nodo
	 * @param nombre nombre del nodo
	 * 
	 * @author Victoria Pelayo e Ignacio Rabunnal
	 */
	public Nodo(String nombre) {
		this.nombre = nombre;
		descendientes = new ArrayList<>();
	} 

	/**
	 * @return lista de los descendientes del nodo
	 * 
	 * @author Victoria Pelayo e Ignacio Rabunnal
	 */
	public List<INodo> getDescendientes() {
		return descendientes;
	}

	/**
	 * Cambia la lista de descendientes
	 * @param descendientes nueva lista de descendientes
	 */
	public void setDescendientes(List<INodo> descendientes) {
		this.descendientes = descendientes;
		for(int i = 0; i < this.descendientes.size(); i++) {
			descendientes.get(i).setPadre(this);
		}
	}

	/**
	 * @return nombre del nodo
	 * 
	 * @author Victoria Pelayo e Ignacio Rabunnal
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * Cambia el nombre del nodo
	 * @param nombre nuevo nombre del nodo
	 * 
	 * @author Victoria Pelayo e Ignacio Rabunnal
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * Annade un descendiente al nodo
	 * @param nodo nuevo descendiente
	 * 
	 * @author Victoria Pelayo e Ignacio Rabunnal
	 */
	public void incluirDescendiente(INodo nodo) {
		descendientes.add(nodo);
		nodo.setPadre(this);

	}

	/**
	 * @return el numero de nodos del nodo
	 * 
	 * @author Victoria Pelayo e Ignacio Rabunnal
	 */
	public abstract int getnNodos();


}
