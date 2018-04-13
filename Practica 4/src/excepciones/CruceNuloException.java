package excepciones;

@SuppressWarnings("serial")
public class CruceNuloException extends Exception {
	public CruceNuloException(){

	}

	public String toString() {
		return "Error al elegir los puntos de cruce.";
	}
}
