package inodo.funcion;

import inodo.INodo;
import inodo.Nodo;

/**
 * Descripcion de la clase funcion
 * 
 * @author Victoria Pelayo e Ignacio Rabunnal
 */
public class Function extends Nodo {

	private int nNodos;

	/**
	 * Constructor de la clase Function
	 * @param nombre nombre de la clase function
	 * @param nNodos numero de nodos que va a tener la funcion
	 * 
	 * @author Victoria Pelayo e Ignacio Rabunnal
	 */
	public Function(String nombre, int nNodos) {
		super(nombre);
		this.setnNodos(nNodos);
	}

	@Override
	/**
	 * @return el simbolo de la funcion
	 * 
	 * @author Victoria Pelayo e Ignacio Rabunnal
	 */
	public String getRaiz() {
		return this.getNombre();
	}

	@Override
	/**
	 * @return copia de la funcion en cuestion
	 * 
	 * @author Victoria Pelayo e Ignacio Rabunnal
	 */

	public INodo copy() {
		Function f = new Function(this.getNombre(), this.getnNodos());
		f.setDescendientes(this.getDescendientes());
		return f;
	}

	@Override
	/**
	 * @return cadena de caracteres con los datos de la funcion
	 * 
	 * @author Victoria Pelayo e Ignacio Rabunnal
	 */
	public String toString() {
		String function = this.getNombre();
		for(int i = 0; i < nNodos; i++) {

		}
		return function;
	}

	/**
	 * @return numero de nodos de la funcion
	 * 
	 * @author Victoria Pelayo e Ignacio Rabunnal
	 */
	public int getnNodos() {
		return nNodos;
	}

	/**
	 * Cambia el numero de nodos de la funcion
	 * @param nNodos nuevo numero de nodos
	 * 
	 * @author Victoria Pelayo e Ignacio Rabunnal
	 */
	public void setnNodos(int nNodos) {
		this.nNodos = nNodos;
	}

	/**
	 * Annade un descendiente al nodo
	 * @param nodo nuevo descendiente
	 * 
	 * @author Victoria Pelayo e Ignacio Rabunnal
	 */
	@Override
	public void incluirDescendiente(INodo nodo) {
		//Como maximo puede tener nNodos nodos una funcion
		if(this.getDescendientes().size() == nNodos) {
			return;
		}
		nodo.setPadre(this);
		this.getDescendientes().add(nodo.copy());		
	}

	@Override
	/**
	 * Calcula el valor de la funcion
	 * @return 0
	 * 
	 * @author Victoria Pelayo e Ignacio Rabunnal
	 */
	public double calcular() {
		return 0;
	}

	@Override
	/**
	 * Cambia el padre de la funcion
	 * @param nodo nuevo nodo padre
	 * 
	 * @author Victoria Pelayo e Ignacio Rabunnal
	 */
	public void setPadre(INodo nodo) {
		super.setPadre(nodo);

	}

	@Override
	/**
	 * @return INodo padre de la funcion
	 */
	public INodo getPadre() {
		return super.getPadre();

	}

}
