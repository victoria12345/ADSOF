package inodo.terminal;

import java.util.ArrayList;
import java.util.List;

import inodo.INodo;
import inodo.Nodo;

public class Terminal extends Nodo {
	private static final int valor = 0;
	
	/**
	 * Constructor de la clase terminal
	 * @param nombre nombre del terminal
	 */
	public Terminal(String nombre) {
		super(nombre);
	}

	@Override
	/**
	 * @return el simbolo de un terminal
	 */
	public String getRaiz() {
		
		return this.getNombre();
	}
	
	@Override
	/**
	 * @return lista vacia
	 */
	public List<INodo> getDescendientes() {
		List<INodo> lista = new ArrayList<INodo>();
		return lista;
	}

	@Override
	/**
	 * @return valor predeterminado asociado a los terminales
	 */
	public double calcular() {
		return valor;
	}

	@Override
	/**
	 * @return una copa del terminal
	 */
	public INodo copy() {
		Terminal t = new Terminal(this.getNombre());
		t.setDescendientes(t.getDescendientes());
		return t;
	}

	@Override
	public String toString() {
		return this.getNombre();
	}
	
	public int getnNodos() {
		return 0;
	}

}
