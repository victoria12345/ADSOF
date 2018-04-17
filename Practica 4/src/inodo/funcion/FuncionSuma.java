package inodo.funcion;

import inodo.INodo;
/**
 * Descripcion de la clase funcion Suma
 * 
 * @author Victoria Pelayo e Ignacio Rabunnal
 */
public class FuncionSuma extends Function{
	/**
	 * Constructor de la clase funcion suma
	 * @param nombre de la funcion
	 * @param nNodos numero de nodos
	 */
	public FuncionSuma(String nombre, int nNodos) {
		super(nombre, nNodos);
	}

	/**
	 * @return cadena de caracteres con los datos de la funcion
	 */
	public String  toString() {
		String multi = "";
		//Si no hay dos operandos como defecto devuelve el simbolo
		if(this.getDescendientes().size() < 2) {
			return "+";
		}
		/*multi += "( + " + getDescendientes().get(0)+ " " + getDescendientes().get(1)+" )";*/
		multi+= "( + ";
		for(int i = 0; i < getnNodos(); i++) {
			multi+= getDescendientes().get(i) + " ";
		}
		multi += ")";
		return multi;
	}

	@Override
	/**
	 * @return el resultado de realizar una suma
	 * 
	 * @author Victoria Pelayo e Ignacio Rabunnal
	 */
	public double calcular() {
		if(this.getDescendientes().size() != 2) {
			return 0;
		}
		return getDescendientes().get(0).calcular() + getDescendientes().get(1).calcular();
	}

	/**
	 * Hace una copia de una funcion suma
	 * @return INodo copia de la funcion suma
	 * 
	 * @author Victoria Pelayo e Ignacio Rabunnal
	 */
	public INodo copy() {
		INodo copia = new FuncionSuma(this.getNombre(), this.getnNodos());
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
