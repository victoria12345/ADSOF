package inodo.funcion;

import inodo.INodo;

/**
 * Descripcion de la clase funcion multiplicacion
 *
 * @author Victoria Pelayo e Ignacio Rabunnal
 */
public class FuncionMultiplicacion extends Function{

	/**
	 * Constructor de la clase Funcion Multiplicacion
	 * @param nombre nombre de la funcion
	 * @param nNodos numero de nodos de la funcion
	 * 
	 * @author Victoria Pelayo e Ignacio Rabunnal
	 */
	public FuncionMultiplicacion(String nombre, int nNodos) {
		super(nombre, nNodos);
	}

	/**
	 * @return cadena de caracteres con los datos de la funcion multiplicacion
	 * 
	 * @author Victoria Pelayo e Ignacio Rabunnal
	 */
	public String  toString() {
		String multi = "";
		//Si no hay dos operandos como defecto devuelve el simbolo
		if(this.getDescendientes().size() < 2) {
			return "*";
		}
		/*multi += "( * " + getDescendientes().get(0)+ " " + getDescendientes().get(1)+" )";*/
		
		multi += "( * ";
		for(int i = 0; i < getnNodos(); i++) {
			multi += getDescendientes().get(i) + " ";
		}
		multi += ")";
		return multi;
	}

	@Override
	/**
	 * @return el resultado de realizar una multiplicacion
	 * 
	 * @author Victoria Pelayo e Ignacio Rabunnal
	 */
	public double calcular() {
		if(this.getDescendientes().size() != 2) {
			return 0;
		}
		return getDescendientes().get(0).calcular() * getDescendientes().get(1).calcular();
	}

	/**
	 * Hace una copia de la funcion multiplicacion
	 * @return INodo copia de la funcion
	 * 
	 * @author Victoria Pelayo e Ignacio Rabunnal
	 */
	public INodo copy() {
		INodo copia = new FuncionMultiplicacion(this.getNombre(), this.getnNodos());
		INodo aux;

		for(INodo des: this.getDescendientes()) {
			aux = des.copy();
			copia.incluirDescendiente(aux);
		}

		copia.setPadre(this.getPadre());
		copia.setEtiqueta(this.getEtiqueta());

		return copia;

	}
}
