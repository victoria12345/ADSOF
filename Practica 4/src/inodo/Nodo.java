package inodo;

import java.util.*;

public abstract class Nodo implements INodo{
	private INodo padre;
	
	public INodo getPadre() {
		return padre;
	}

	public void setPadre(INodo padre) {
		this.padre = padre;
	}

	private String nombre;
	private List<INodo> descendientes;
	/**
	 * Constructor de la clase nodo
	 * @param nombre nombre del nodo
	 */
	public Nodo(String nombre) {
		this.nombre = nombre;
		descendientes = new ArrayList<>();
	} 
	
	/**
	 * @return lista de los descendientes del nodo
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
	}

	/**
	 * @return nombre del nodo
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * Cambia el nombre del nodo
	 * @param nombre nuevo nombre del nodo
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	/**
	 * Annade un descendiente al nodo
	 * @param nodo nuevo descendiente
	 */
	public void incluirDescendiente(INodo nodo) {
		descendientes.add(nodo);
		nodo.setPadre(this);
		
	}
	
	public abstract int getnNodos();
	
	
}
