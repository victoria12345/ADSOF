public class EntradaReducida extends EntradaEspectador{
	private int descuento2;

	/**
	* Constructor de la clase entrada reducida
	* @param precio precio de la entrada
	* @param descuento2 descuento de la entrada, en funcion de la edad o si es usuario
	*/
	public EntradaReducida(double precio, int descuento, int descuento2){
		super( precio,descuento);
		this.descuento2 = descuento2;
	}

	/**
	* Imprime las caracteristicas de una entrada Reeducida
	* Se imprime precio inicial y el descuento que se aplica
	* @return cadena de caracteres que son las caracteristicas
	* @author Victoria Pelayo e Ignacio Rabuñal
	*/
	public String toString(){
		String entrada;

		return super.toString() + "  Descuento adicional: " + descuento2;
	}

	/**
	* Devuelve el descuento asociado a una entrada
	* @return descuento descuento adicional
	* @author Victoria Pelayo e Ignacio Rabuñal
	*/
	public int getDescuentoAdic(){
		return descuento2;
	}

	/**
	* Modifica el descuento asociado a una entrada
	* @param descuento entero que indica el nuevo descuento adicional asociado
	* @author Victoria Pelayo e Ignacio Rabuñal
	*/
	public void setDescuentoAdic(int descuento){
		this.descuento2 = descuento;
	}

	/**
	* Modifica el descuento asociado a una entrada
	* @return precio final de la entrada
	* @author Victoria Pelayo e Ignacio Rabuñal
	*/
	public double getPrecio(){
		return super.getPrecio() - (super.getPrecio() * descuento2/100);
	}
}