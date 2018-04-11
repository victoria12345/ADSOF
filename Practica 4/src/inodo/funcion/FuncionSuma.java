package inodo.funcion;
public class FuncionSuma extends Function{

	public FuncionSuma(String nombre, int nNodos) {
		super(nombre, nNodos);
	}
	
	public String  toString() {
		String multi = "";
		//Si no hay dos operandos como defecto devuelve el simbolo
		if(this.getDescendientes().size() < 2) {
			return "+";
		}
		multi += "( + " + getDescendientes().get(0)+ " " + getDescendientes().get(1)+" )";
		
		return multi;
	}
	
	@Override
	/**
	 * @return el resultado de realizar una suma
	 */
	public double calcular() {
		if(this.getDescendientes().size() != 2) {
			return 0;
		}
		return getDescendientes().get(0).calcular() + getDescendientes().get(1).calcular();
	}

}
