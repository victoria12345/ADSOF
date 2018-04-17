package inodo.funcion;

import inodo.INodo;

/**
 * Descripcion de la clase Funcion Resta
 * 
 * @author Victoria Pelayo e Ignacio Rabunnal
 */
public class FuncionResta extends Function {

	/**
	 * Constructor de la clase Funcion Resta
	 * @param nombre nombre de la funcion
	 * @param nNodos numero de nodos de la funcion
	 * 
	 * @author Victoria Pelayo e Ignacio Rabunnal
	 */
	public FuncionResta(String nombre, int nNodos) {
		super(nombre, nNodos);
	}

	/**
	 * @return cadena de caracteres con los datos de la funcion
	 * 
	 * @author Victoria Pelayo e Ignacio Rabunnal
	 */
	public String  toString() {
		String multi = "";
		//Si no hay dos operandos como defecto devuelve el simbolo
		if(this.getDescendientes().size() < 2) {
			return "-";
		}
		/*multi += "( - " + getDescendientes().get(0)+ " " + getDescendientes().get(1)+" )";+7*/
		
		multi += "( - ";
		for(int i = 0 ; i < getnNodos(); i++) {
			multi += getDescendientes().get(i) + " ";
		}
		multi += ")";

		return multi;
	}

	@Override
	/**
	 * @return el resultado de realizar una resta
	 * 
	 * @author Victoria Pelayo e Ignacio Rabunnal
	 */
	public double calcular() {
		if(this.getDescendientes().size() != 2) {
			return 0;
		}
		return getDescendientes().get(0).calcular() - getDescendientes().get(1).calcular();
	}

	/**
	 * Hace una copia de la funcion resta
	 * @return INodo copia de la funcion
	 * 
	 * @author Victoria Pelayo e Ignacio Rabunnal
	 */
	public INodo copy() {
		INodo copia = new FuncionResta(this.getNombre(), this.getnNodos());
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
