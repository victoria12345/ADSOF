package excepciones;

@SuppressWarnings("serial")
public class ArgsDistintosFuncionesException extends Exception{
	public ArgsDistintosFuncionesException() {
		
	}
	
	public String toString() {
		return "Error con el numero de argumentos para la funcion.";
	}
}
