/**
 * Aqui definimos la clase Cine
 * @author Victoria Pelayo e Ignacio Rabuñal
 * grupo 2101
 */

import java.util.*;

/**
   * Enumeracion resultado de funciones
   */
public enum Status{
	OK, ERROR
}

public class Cine{
	private String nombre;
	private String direccion;
	private List<Pelicula> peliculas = new ArrayList<Pelicula>();
	private List<Sala> salas = new ArrayList<Sala>();
	private List<Entrada> entradas = new ArrayList<Entrada>();

	/**
	* Constructor de la clase Cine
	* @param nombre nombre del cine
	* @param direccion direccion del cine
	* @param peliculas lista de las peliculas del cine
	* @param salas lista de las salas del cine
	* @param entradas lista de las entradas del cine
	* @author Victoria Pelayo e Ignacio Rabuñal
	*/
	public Cine(String nombre, String direccion, List<Pelicula> peliculas, List<Sala> salas, List<Entrada> entradas){
		this.nombre = nombre;
		this.direccion = direccion;
		this.peliculas = peliculas;
		this.salas = salas;
		this.entradas = entradas;
	}

	/**
	* Imprime los datos del cine por pantalla
	* @author Victoria Pelayo e Ignacio Rabuñal
	*/
	public String toString(){
		String cine = "";

		return cine + "Nombre: " + nombre + "\n"
		+ "Direccion: " + direccion + "\n"
		+ "Peliculas" + peliculas + "\n"
		+ "Salas: " + salas + "\n"
		+ "Entradas: " + entradas + "\n";
	}

	/**
	* Devuelve el nombre de un cine
	* @return nombre nombre del cine 
	*/
	public String getNombre(){
		return this.nombre;
	}

	/**
	* Devuelve la direccion de un cine
	* @return direccion del cine
	*/
	public String getDireccion(){
		return this.direccion;
	}

	/**
	* Devuelve las peliculas de un cine
	* @return peliculas del cine
	*/
	public List<Pelicula> getDireccion(){
		return this.peliculas;
	}

	/**
	* Devuelve las salas de un cine
	* @return salas del cine
	*/
	public List<Sala> getSalas(){
		return this.salas;
	}

	/**
	* Devuelve las entradas de un cine
	* @return entradas del cine
	*/
	public List<Sala> getEntradas(){
		return this.entradas;
	}

	/**
	* Se añade una pelicula al cine
	* @param pelicula pelicula que se quiere añadir
	*/
	public void addPelicula(Pelicula pelicula){
		int i;

		for(i = 0; i < peliculas.getSize(); i++){
			if(pelicula.getNombre() == peliculas.get(i).getNombre() ){
				return;
			}
		}

		peliculas.add(pelicula);
	}

	/**
	* Se añade una sala al cine
	* @param sala sala que se quiere añadir
	*/
	public void addSala(Sala sala){
		int i;

		for(i = 0; i < salas.getSize(); i++){
			if(sala.getId() == salas.get(i).getId() ){
				return;
			}
		}

		salas.add(sala);
	}

	/**
	* Se elimina una pelicula
	* @param pelicula Pelicula que se quiere eliminar
	*/

	private Status removePelicula(Pelicula pelicula){
		int i;

		for(i = 0; i < peliculas.getSize(); i++){
			if(pelicula == peliculas.get(i) ){
				peliculas.remove(i);
				return OK;
			}
		}

		return ERROR;
	}

	/**
	* Se elimina una sala
	* @param sala Sala que se quiere eliminar
	*/

	private Status removeSala(Sala sala){
		int i;

		for(i = 0; i < salas.getSize(); i++){
			if(sala.getId() == salas.get(i).getId() ){
				salas.remove(i );
				return OK;
			}
		}

		return ERROR;
	}

	public Status removePeliculaCartelera(Pelicula pelicula){
		int i, cont = 0;

		if(removePelivula(pelicula) == ERROR){
			return ERROR;
		}

		for(i = 0; i < salas.getSize(); i++){
			if(salas.get(i).getPelicula() == pelicula){
				///AÑADIR FUNCION A SALA PARA QUE DEVUELVA SESIONES QUE TIENEN ESA PELI!!!!!!!!!!!!!!!!!!!!!!!
				}
			}
		}

		System.out.printIn("Numero de ")
	}

}