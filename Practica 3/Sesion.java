/**
 * Aqui definimos la clase Sesion
 * @author Victoria Pelayo e Ignacio Rabuñal
 * grupo 2101
 */

import java.util.*;

public class Sesion{

	public static int MAXBUTACAS = 100;
	private int id;
	private Fecha fecha;
	private Pelicula pelicula;
	private List<Entrada> butacas_disp = new ArrayList<Entrada>();
	private List<Entrada> vendidas = new ArrayList<Entrada>();

	/**
	* Constructor de la clase Pelicula
	* @param titutlo titulo que va a tener la clase pelidula
	* @param id identificador de la sesion
	* @param director nombre del director de la pelicula
	* @param anno anno en el que la pelicula fue estrenada
	* @param sinopsis sinopsis de la pelicula
	* @genero genero genero de la pelicula
	*/
	public Sesion(int id,Fecha fecha, Pelicula pelicula, List<Entrada> butacas, List<Entrada> vendidas){

		this.id = id;
		this.fecha = fecha;
		this.pelicula = pelicula;
		this.butacas_disp = butacas;
		this.vendidas = vendidas;

	}

	/**
   * Imprime por pantalla los datos de la sesion
   * @author Victoria Pelayo e Ignacio Rabunnal
   * @return cadena de caracteres formada por los datos
   */
	public String toString(){
		String pelicula = "";

		return pelicula = pelicula + "Fecha: " + fecha + "\n"+
		"Pelicula: "+ pelicula + "\n"+
		"Total butacas: "+ butacas_disp + "\n"+
		"Vendidas: "+ vendidas+ "\n";
	}

	/**
	* Devuelve el id de una sesion
	* @author Victoria Pelayo e Ignacio Rabunnal
	* @return id id de una sesion
	*/

	public int getId(){
		return id;
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

	public List<Entrada> getDisponibles(){
		return butacas_disp;
	}

	/**
	* Devuelve las butacas vendidas de una sesion
	* @author Victoria Pelayo e Ignacio Rabunnal
	* @return butacas numero de butacas de una sala
	*/

	public List<Entrada> getVendidas(){
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

	public void setDirector(Fecha fecha){
		this.fecha = fecha;
	}

	/**
	* Se añade una butaca disponible
	* @param butaca butaca que se añade como disponible
	* @return true si se realzia con exito y false si no es asi
	*/

	public boolean addButaca(Entrada butaca){
		int i;

		//Hay un maximo de butacas por sesion
		if(butacas_disp.size() + vendidas.size() == MAXBUTACAS){
			return false;
		}

		for(i = 0; i < butacas_disp.size(); i++){
			if (butacas_disp.get(i).getId() == butaca.getId())
				return false;
		}

		butacas_disp.add(butaca);
		return true;
	}

	/**
	* Se elimina una butaca disponible
	* @param butaca butaca que se elimina como disponible
	* @return true si se realzia con exito y false si no es asi
	*/

	public boolean delButaca(int id){
		int i;

		if(butacas_disp.isEmpty() == true){
			return false;
		}

		for(i = 0; i < butacas_disp.size(); i++){
			if (butacas_disp.get(i).getId() == id){
				butacas_disp.remove(i);
				return true;
			}

		}

		return false;
	}

	/**
	* Se vende una entrada
	* @param id id de la entrada que se vende
	* @return true si se realiza con exito y false si no es asi
	*/

	public boolean venderButaca(int id){
		int i;



		for (i  = 0; i < butacas_disp.size(); i++){
			if (butacas_disp.get(i).getId() == id){
				// si encuentra la butaca la añade a vendidas y 
				// despues la elimina de disponibles
				vendidas.add(butacas_disp.get(i));
				delButaca(id);
				return true;
			}
		}

		return false;
	}

}