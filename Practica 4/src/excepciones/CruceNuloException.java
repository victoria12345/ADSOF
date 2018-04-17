package excepciones;

@SuppressWarnings("serial")
/**
 * Descripcion de la clase de la excepcion CruceNuloException
 * Indica que se han elegido dos raices como punto de cruce
 * 
 * @author Victoria Pelayo e Ignacio Rabunnal
 */
public class CruceNuloException extends Exception {
	/**
	 * Constructor de la clase
	 * 
	 * @author Victoria Pelayo e Ignacio Rabunnal
	 */
	public CruceNuloException(){

	}

	/**
	 * @return cadena de caracteres con informacion sobre la escepcion
	 * 
	 * @author Victoria Pelayo e Ignacio Rabunnal
	 */
	public String toString() {
		return "Error al elegir los puntos de cruce.";
	}
}
