/**
 * Aqui definimos la clase Cine
 * @author Victoria Pelayo e Ignacio Rabuñal
 * grupo 2101
 */

import java.util.*;


public class Cine{
	private static int MAXPELIS = 20;
	private static int MAXSALAS = 20;
	private static int MAXBUTACAS = 500;
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
	public List<Pelicula> getPeliculas(){
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
	public List<Entrada> getEntradas(){
		return this.entradas;
	}

	/**
	* Se añade una pelicula al cine
	* @param pelicula pelicula que se quiere añadir
	*/
	public boolean addPelicula(Pelicula pelicula){
		int i;

		if (peliculas.size() == MAXPELIS){
			return false;
		}

		for(i = 0; i < peliculas.size(); i++){
			if(pelicula.getTitulo() == peliculas.get(i).getTitulo()){
				return false;
			}
		}

		peliculas.add(pelicula);
		return true;
	}

	/**
	* Se añade una sala al cine
	* @param sala sala que se quiere añadir
	*/
	public boolean addSala(Sala sala){
		int i;

		if(salas.size() == MAXSALAS){
			return false;
		}

		for(i = 0; i < salas.size(); i++){
			if(salas.get(i).getId() == salas.get(i).getId() ){
				return false;
			}
		}

		salas.add(sala);
		return true;
	}

	/**
	* Se elimina una pelicula
	* @param pelicula Pelicula que se quiere eliminar
	*/

	private boolean removePelicula(Pelicula pelicula){
		int i;

		if(peliculas.isEmpty() == true){
			return false;
		}

		for(i = 0; i < peliculas.size(); i++){
			if(pelicula.getTitulo() == peliculas.get(i).getTitulo() ){
				peliculas.remove(i);
				return true;
			}
		}

		return false;
	}

	/**
	* Se elimina una sala
	* @param sala Sala que se quiere eliminar
	*/

	private boolean removeSala(Sala sala){
		int i;

		if (salas.isEmpty() == true){
			return false;
		}

		for(i = 0; i < salas.size(); i++){
			if(salas.get(i).getId() == salas.get(i).getId() ){
				salas.remove(i );
				return true;
			}
		}

		return false;
	}

	public boolean removePeliculaCartelera(Pelicula pelicula){
		if (removePelicula(pelicula) == false){
			return false;
		}

		int i;
		for (i = 0; i< salas.size(); i++){
			int j;
			List<Sesion> sesion = salas.get(i).getSesiones();

			for(j = 0; j< sesion.size(); j++){
				if(sesion.get(j).getPelicula().getTitulo() == pelicula.getTitulo()){
					if(salas.get(i).delSesion(sesion.get(j)) == false){
						return false;
					}
				}

			}

		}

		return true;		
	}

}