package excepciones;

@SuppressWarnings("serial")
/**
 * Descripcion de la clase ArgsDistitosFuncionesException
 * Es un tipo de excepcion cuando se introducen incorrectamente el numero
 * de argumentos de una funcion
 * 
 * @author Victoria Pelayo e Ignacio Rabunnal
 */
public class ArgsDistintosFuncionesException extends Exception{
	/**
	 * Constructor de la clase
	 * 
	 * @author Victoria Pelayo e Ignacio Rabunnal
	 */
	public ArgsDistintosFuncionesException() {

	}

	/**
	 * @return cadena de caracteres con informacion sobre la excepcion
	 * 
	 * @author Victoria Pelayo e Ignacio Rabunnal
	 */
	public String toString() {
		return "Error con el numero de argumentos para la funcion.";
	}
}
