/**
 * Aqui definimos la clase Sesion
 * @author Victoria Pelayo e Ignacio Rabuñal
 * grupo 2101
 */

import java.util.*;

public class Sesion{

	private Fecha fecha;
	private Pelicula pelicula;
	private int butacas_disp;
	private int vendidas;

	/**
	* Constructor de la clase Pelicula
	* @author Victoria Pelayo e Ignacio Rabuñal
	* @param fecha fecha de la sesion
	* @param pelicula pelicula que se proyecta en la sesion
	* @param butacas numero de butacas iniciales disponibles
	*/
	public Sesion(Fecha fecha, Pelicula pelicula, int butacas){

		this.fecha = fecha;
		this.pelicula = pelicula;
		this.butacas_disp = butacas;
		this.vendidas = 0;

	}

	/**
   * Imprime por pantalla los datos de la sesion
   * @author Victoria Pelayo e Ignacio Rabunnal
   * @return cadena de caracteres formada por los datos
   */
	public String toString(){
		String sesion = "";

		return sesion = sesion + "Fecha: " + fecha + "   "+
		"Pelicula: "+ pelicula.getTitulo() + "   "+
		"Butacas disponibles: "+ butacas_disp + "  "+
		"Vendidas: "+ vendidas+ "   ";
	}

	/**
	* Devuelve la fecha d euna sesion
	* @author Victoria Pelayo e Ignacio Rabunnal
	* @return fecha fecha de la sesion
	*/

	public Fecha getFecha(){
		return fecha;
	}

	/**
	* Devuelve la pelicula de una sesion
	* @author Victoria Pelayo e Ignacio Rabunnal
	* @return pelicula pelicula que se proyecta en la sesion
	*/

	public Pelicula getPelicula(){
		return pelicula;
	}

	/**
	* Devuelve las butacas disponibles de una sesion
	* @author Victoria Pelayo e Ignacio Rabunnal
	* @return butacas numero de butacas de una sala
	*/

	public int getDisponibles(){
		return butacas_disp;
	}

	/**
	* Devuelve las butacas vendidas de una sesion
	* @author Victoria Pelayo e Ignacio Rabunnal
	* @return butacas numero de butacas de una sala
	*/

	public int getVendidas(){
		return vendidas;
	}

	/**
	* Cambia la pelicula de una sesion
	* @author Victoria Pelayo e Ignacio Rabunnal
	* @param pelicula nueva pelicula de la sesion
	*/

	public void setPelicula(Pelicula pelicula){
		this.pelicula = pelicula;
	}

	/**
	* Cambia la fecha de una sesion
	* @author Victoria Pelayo e Ignacio Rabunnal
	* @param fecha nueva fecha de la sesion
	*/

	public void setFecha(Fecha fecha){
		this.fecha = fecha;
	}

	/**
	* Cambia la fecha de una sesion
	* @author Victoria Pelayo e Ignacio Rabunnal
	* @param fecha nueva fecha de la sesion
	*/

	public void setDirector(Fecha fecha){
		this.fecha = fecha;
	}

	/**
	* Cambia el numero de butacas disponibles
	* @author Victoria Pelayo e Ignacio Rabunnal
	* @param butacas nuevo numero de butacas
	*/

	public void setButacas(int butacas){
		this.butacas_disp = butacas;
	}

	/**
	* Se añade una butaca como disponible
	*/

	public void addButaca(){
		butacas_disp++;
	}

	/**
	* Se elimina una butaca disponible
	*/

	public void delButaca(){
		if(butacas_disp <= 0){
			return;
		}
		butacas_disp--;
	}

	/**
	* Se vende una entrada
	* Se elimina una butaca como disponible y se añade una en vendida
	* @return true si se realiza con exito y false si no es asi
	*/

	public boolean venderButaca(){
		if(butacas_disp == 0){
			return false;
		}

		butacas_disp --;
		vendidas++;
		return true;
	}

}