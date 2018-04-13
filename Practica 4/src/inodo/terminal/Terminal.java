package inodo.terminal;

import java.util.ArrayList;
import java.util.List;

import inodo.INodo;
import inodo.Nodo;

public class Terminal extends Nodo {
	// Como valor por defecto sera cero
	private static double valor = 0;
	
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

	public double getValor() {
		return valor;
	}

	public static void setValor(double valor) {
		Terminal.valor = valor;
	}

	@Override
	public String toString() {
		return this.getNombre();
	}
	
	public int getnNodos() {
		return 0;
	}
	
	public void setPadre(INodo nodo) {
		super.setPadre(nodo);
	}
	
	public INodo copy() {
		INodo copia = new Terminal(this.getNombre());
				
		copia.setPadre(this.getPadre());
		copia.setEtiqueta(this.getEtiqueta());
		
		return copia;
		
	}

}
