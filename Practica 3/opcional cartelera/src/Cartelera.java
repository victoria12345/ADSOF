/**
* Definicion de la clase cartelera
* @author Victoria Pelayo e Ignacio Rabunnal
*/

import java.util.*;

public class Cartelera{
	private List<Pelicula> peliculas = new ArrayList<Pelicula>();

	/**
	* Constructor de la clase cartelera
	* no recibe parametros inicialmente porque se crea vacia
	*/
	public Cartelera(){

	}

	public String toString(){
		int i;
		String cartelera = "";
		cartelera = cartelera + "\n------------------------------------\n-------CARTELERA--------------------\n";
		for(i = 0; i < peliculas.size(); i++){
			cartelera = cartelera + "PELICULA " + i + " : \n" + peliculas.get(i) + "\n";

		}

		cartelera = cartelera + "\n------------------------------------\n---------FIN CARTELERA--------------\n";
		return cartelera;
	}

	/**
	* Devuelve una lista de las peliculas de la cartelera
	* @return lista de peliculas en la cartelera
	* @author Victoria Pelayo e Ignacio Rabunnal
	*/
	public List<Pelicula> getPeliculas(){
		return peliculas;
	}

	/**
	* Annade una pelicula a la cartelera
	* @param pelicula pelicula que se desea annadir
	* @return true si se realiza correctamente y false si no es asi
	* @author Victoria Pelayo e Ignacio Rabunnal
	*/

	public boolean addPelicula(Pelicula pelicula){
		if(peliculas.contains(pelicula) == true){
			return false;
		}

		peliculas.add(pelicula);
		return true;
	}

	/**
	* Elimina una pelicula a la cartelera
	* @param pelicula pelicula que se desea eliminar
	* @return true si se realiza correctamente y false si no es asi
	* @author Victoria Pelayo e Ignacio Rabunnal
	*/

	public boolean eliminar(Pelicula pelicula){
		if(peliculas.contains(pelicula) == false){
			return false;
		}

		int i;
		for(i = 0; i < peliculas.size(); i++){
			if(pelicula == peliculas.get(i)){
				peliculas.remove(i);
				return true;
			}
		}
		return false;
	}

}
