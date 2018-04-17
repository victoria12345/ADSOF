package inodo.terminal;

/**
 * Descripcion de la clase Terminal aritmetico
 * @author Victoria Pelayo e Ignacio Rabunnal
 *
 */
public class TerminalAritmetico extends Terminal {

	/**
	 * Constructor de un Terminal Aritmetico
	 * @param nombre del terminal
	 */
	public TerminalAritmetico(String nombre) {
		super(nombre);
	}

	/**
	 * @return cadena de caracteres con los datos del terminal
	 */
	public String toString() {
		return this.getNombre();
	}

}
