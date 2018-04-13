package inodo.funcion;

import inodo.INodo;
import inodo.Nodo;

public class Function extends Nodo implements Cloneable {
	
	private int nNodos;
	
	/**
	 * Constructor de la clase Function
	 * @param nombre nombre de la clase function
	 */
	public Function(String nombre, int nNodos) {
		super(nombre);
		this.setnNodos(nNodos);
	}

	@Override
	/**
	 * @return el simbolo de la funcion
	 */
	public String getRaiz() {
		return this.getNombre();
	}

	@Override
	/**
	 * @return copia de la funcion en cuestion
	 */

	public INodo copy() {
		Function f = new Function(this.getNombre(), this.getnNodos());
		f.setDescendientes(this.getDescendientes());
		return f;
	}
	
	@Override
	public String toString() {
		String function = this.getNombre();
		for(int i = 0; i < nNodos; i++) {
			
		}
		return function;
	}

	public int getnNodos() {
		return nNodos;
	}

	public void setnNodos(int nNodos) {
		this.nNodos = nNodos;
	}
	
	/**
	 * Annade un descendiente al nodo
	 * @param nodo nuevo descendiente
	 */
	@Override
	public void incluirDescendiente(INodo nodo) {
		//Como maximo puede tener dos nodos una funcion
		if(this.getDescendientes().size() == nNodos) {
			return;
		}
		nodo.setPadre(this);
		this.getDescendientes().add(nodo.copy());		
	}

	@Override
	public double calcular() {
		return 0;
	}

	@Override
	public void setPadre(INodo nodo) {
		super.setPadre(nodo);
		
	}

	@Override
	public INodo getPadre() {
		return super.getPadre();
		
	}

}
