package inodo.funcion;

import inodo.INodo;

public class FuncionMultiplicacion extends Function{

	public FuncionMultiplicacion(String nombre, int nNodos) {
		super(nombre, nNodos);
	}
	
	public String  toString() {
		String multi = "";
		//Si no hay dos operandos como defecto devuelve el simbolo
		if(this.getDescendientes().size() < 2) {
			return "*";
		}
		multi += "( * " + getDescendientes().get(0)+ " " + getDescendientes().get(1)+" )";
		
		return multi;
	}

	@Override
	/**
	 * @return el resultado de realizar una multiplicacion
	 */
	public double calcular() {
		if(this.getDescendientes().size() != 2) {
			return 0;
		}
		return getDescendientes().get(0).calcular() * getDescendientes().get(1).calcular();
	}
	
	public INodo copy() {
		INodo copia = new FuncionMultiplicacion(this.getNombre(), this.getnNodos());
		INodo aux;
		
		for(INodo des: this.getDescendientes()) {
			aux = des.copy();
			copia.incluirDescendiente(aux);
		}
		
		copia.setPadre(this.getPadre());
		
		return copia;
		
	}
}
