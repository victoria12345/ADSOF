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
		String entrada = "";

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

	public void setPrecio(double precio){
		this.precio = precio;
	}

}


