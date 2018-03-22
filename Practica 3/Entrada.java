/**
 * Aqui definimos la clase Entrada
 * @author Victoria Pelayo e Ignacio Rabuñal
 * grupo 2101
 */

public class Entrada{
	private double precio;

	/**
	* Constructor de la clase Pelicula
	* @param precio precio de la entrada
	* @author Victoria Pelayo e Ignacio Rabuñal
	*/
	public Entrada(double precio){

		this.precio = precio;
	}

	/**
   * Imprime por pantalla los datos de la sesion
   * @author Victoria Pelayo e Ignacio Rabunnal
   * @return cadena de caracteres formada por los datos
   */
	public String toString(){
		String entrada = "";

		return entrada = entrada + "Precio: " + precio ;
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
	* Cambia el precio de una entrada
	* @author Victoria Pelayo e Ignacio Rabunnal
	* @param precio nuevo precio de la entrada
	*/

	public void setPrecio(double precio){
		this.precio = precio;
	}

}


