public class EntradaEspectador extends Entrada{
	public int descuento;

	/**
	* Constructor de la clase entrada espectador
	* @param id identificador de la entrada
	* @param precio precio de la entrada
	* @param descuento descuento de la entrada
	*/
	public EntradaEspectador(int id, double precio, int descuento){
		super(id, precio);
		this.descuento = descuento;
	}

	/**
	* Imprime las caracteristicas de una entrada Espectador
	* @return cadena de caracteres que son las caracteristicas
	* @author Victoria Pelayo e Ignacio Rabuñal
	*/
	public String toString(){

		return super.toString() + "Descuento: " + descuento + "\n";
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
}