package inodo.terminal;

import java.util.ArrayList;
import java.util.List;

import inodo.INodo;
import inodo.Nodo;

/**
 * Descripcion de la clase terminal
 * @author Victoria Pelayo e Ignacio Rabunnal
 *
 */
public class Terminal extends Nodo {
	// Como valor por defecto sera cero
	private static double valor = 0;

	/**
	 * Constructor de la clase terminal
	 * @param nombre nombre del terminal
	 * 
	 * @author Victoria Pelayo e Ignacio Rabunnal
	 */
	public Terminal(String nombre) {
		super(nombre);
	}

	@Override
	/**
	 * @return el simbolo de un terminal
	 * 
	 * @author Victoria Pelayo e Ignacio Rabunnal
	 */
	public String getRaiz() {

		return this.getNombre();
	}

	@Override
	/**
	 * @return lista vacia
	 * 
	 * @author Victoria Pelayo e Ignacio Rabunnal
	 */
	public List<INodo> getDescendientes() {
		List<INodo> lista = new ArrayList<INodo>();
		return lista;
	}

	@Override
	/**
	 * @return valor predeterminado asociado a los terminales
	 * 
	 * @author Victoria Pelayo e Ignacio Rabunnal
	 */
	public double calcular() {
		return valor;
	}

	/**
	 * Cambia el valor predeterminado de los terminales
	 * @param valor nuevo valor predeterminado
	 * 
	 * @author Victoria Pelayo e Ignacio Rabunnal
	 */
	public static void setValor(double valor) {
		Terminal.valor = valor;
	}

	@Override
	/**
	 * @return Cadena de caracteres con el simbolo del temrinal
	 * 
	 * @author Victoria Pelayo e Ignacio Rabunnal
	 */
	public String toString() {
		return this.getNombre();
	}

	/**
	 * @return 0, numero de nodos descendientes
	 * 
	 * @author Victoria Pelayo e Ignacio Rabunnal
	 */
	public int getnNodos() {
		return 0;
	}

	/**
	 * Cambia el nodo padre del terminal
	 * @param nodo nuevo padre
	 * 
	 * @author Victoria Pelayo e Ignacio Rabunnal
	 */
	public void setPadre(INodo nodo) {
		super.setPadre(nodo);
	}

	/**
	 * Hace una copia del terminal
	 * @return INodo copia del terminal
	 * 
	 * @author Victoria Pelayo e Ignacio Rabunnal
	 */
	public INodo copy() {
		INodo copia = new Terminal(this.getNombre());

		copia.setPadre(this.getPadre());
		copia.setEtiqueta(this.getEtiqueta());

		return copia;

	}

}
