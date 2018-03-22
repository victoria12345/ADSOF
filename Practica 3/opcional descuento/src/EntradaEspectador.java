public class EntradaEspectador extends Entrada{
	private int descuento;

	/**
	* Constructor de la clase entrada espectador
	* @param precio precio de la entrada
	* @param descuento descuento de la entrada
	*/
	public EntradaEspectador(double precio, int descuento){
		super( precio);
		this.descuento = descuento;
	}

	/**
	* Imprime las caracteristicas de una entrada Espectador
	* Se imprime precio inicial y el descuento que se aplica
	* @return cadena de caracteres que son las caracteristicas
	* @author Victoria Pelayo e Ignacio Rabuñal
	*/
	public String toString(){
		String entrada;

		return super.toString() + "  Descuento: " + descuento;
	}

	/**
	* Devuelve el descuento asociado a una entrada
	* @return descuento descuento asociado
	* @author Victoria Pelayo e Ignacio Rabuñal
	*/
	public int getDescuento(){
		return descuento;
	}

	/**
	* Modifica el descuento asociado a una entrada
	* @param descuento entero que indica el nuevo descuento asociado
	* @author Victoria Pelayo e Ignacio Rabuñal
	*/
	public void setDescuento(int descuento){
		this.descuento = descuento;
	}

	/**
	* Modifica el descuento asociado a una entrada
	* @return precio final de la entrada
	* @author Victoria Pelayo e Ignacio Rabuñal
	*/
	public double getPrecio(){
		return super.getPrecio() - (super.getPrecio() * descuento/100);
	}
}