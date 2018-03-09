/**
 * Aqui definimos la clase Entrada
 * @author Victoria Pelayo e Ignacio Rabuñal
 * grupo 2101
 */

public class Entrada{
	private int id;
	private double precio;

	/**
	* Constructor de la clase Pelicula
	* @param id identificador de la entrada
	* @param precio precio de la entrada
	* @author Victoria Pelayo e Ignacio Rabuñal
	*/
	public Entrada(int id, double precio){

		this.id = id;
		this.precio = precio;
	}

	/**
   * Imprime por pantalla los datos de la sesion
   * @author Victoria Pelayo e Ignacio Rabunnal
   * @return cadena de caracteres formada por los datos
   */
	public String toString(){
		entrada = "";

		return entrada = entrada + "Id: "+ id + "\n" + "Precio: " + precio + "\n";
	}

	/**
	* Devuelve el precio de una entrada
	* @author Victoria Pelayo e Ignacio Rabunnal
	* @return precio precio de una entrada
	*/

	public double getPrecio(){
		return precio;
	}

	/**
	* Devuelve el identificador de una entrada
	* @author Victoria Pelayo e Ignacio Rabunnal
	* @return id identificador de una entrada
	*/
	public int getId(){
		return id;
	}

	/**
	* Cambia el precio de una entrada
	* @author Victoria Pelayo e Ignacio Rabunnal
	* @param precio nuevo precio de la entrada
	*/

	public void setPrecio(Precio precio){
		this.precio = precio;
	}

}


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
		this.precio = precio;
	}

	/**
	* Imprime las caracteristicas de una entrada Espectador
	* @return cadena de caracteres que son las caracteristicas
	* @author Victoria Pelayo e Ignacio Rabuñal
	*/
	public toString(){

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