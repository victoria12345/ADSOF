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
	private Cartelera cartelera = new Cartelera();
	private List<Sala> salas = new ArrayList<Sala>();
	private List<Entrada> entradas = new ArrayList<Entrada>();

	/**
	* Constructor de la clase Cine
	* @param nombre nombre del cine
	* @param direccion direccion del cine
	* @author Victoria Pelayo e Ignacio Rabuñal
	*/
	public Cine(String nombre, String direccion){
		this.nombre = nombre;
		this.direccion = direccion;
	}

	/**
	* Imprime los datos del cine por pantalla
	* @author Victoria Pelayo e Ignacio Rabuñal
	*/
	public String toString(){
		String cine = "";

		return cine + "Nombre: " + nombre + "\n"
		+ "Direccion: " + direccion + "\n"
		+ "Cartelera:" + cartelera + "\n"
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
	* Devuelve la cartelera del cine
	* @return peliculas del cine
	*/
	public Cartelera getCartelera(){
		return this.cartelera;
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

		return this.cartelera.addPelicula(pelicula);
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

		if(salas.contains(sala) == true){
			return false;
		}

		salas.add(sala);
		return true;
	}

	/**
	* Se elimina una pelicula
	* Es una funficn privada que es auxiliar de eliminarPeliculaCartelera
	* @param pelicula Pelicula que se quiere eliminar
	*/

	private boolean removePelicula(Pelicula pelicula){
		int i;

		if(cartelera.eliminar(pelicula) == false){
			return false;
		}

		return true;
	}

	/**
	* Se elimina una sala
	* @param sala Sala que se quiere eliminar
	*/

	public boolean removeSala(Sala sala){
		int i;

		if (salas.isEmpty() == true || salas.contains(sala) == false){
			return false;
		}

		for(i = 0; i < salas.size(); i++){
			if(salas.get(i).getId() == salas.get(i).getId() ){
				salas.remove(i);
				return true;
			}
		}

		return false;
	}

	/**
	* Se elimina una pelicula de la cartelera
	* @param pelicula pelicula que se desea eliminar
	* @return true si se realiza correctamente y false si no es asi
	* @author Victoria Pelayo e Ignacio Rabunnal
	*/
	public boolean removePeliculaCartelera(Pelicula pelicula){
		if (removePelicula(pelicula) == false){
			return false;
		}

		int i;
		//Se busca las sesiones en las que estaba esa pelicula
		for(i = 0; i < salas.size(); i++){
			List<Sesion> sesiones= salas.get(i).getSesiones();
			int j;
			for(j = 0; j < sesiones.size(); j++){
				if(pelicula == sesiones.get(j).getPelicula()){
					salas.get(i).delSesion(sesiones.get(j));
				}
			}
		}

		return true;		
	}

	/**
	* Se añade una sesion al cine
	* @param s sesion que se desea añadir
	* @param sal sala en la que se añade
	* @return true si se realiza correctamente y false si no es asi
	* @author Victoria Pelayo e Ignacio Rabunnal
	*/
	public boolean addSesion(Sesion s, Sala sal){
		if(salas.contains(sal) == false){
			return false;
		}

		int i;
		for(i = 0; i < salas.size(); i++){
			if(salas.get(i).getId() == sal.getId()){
				if(salas.get(i).addSesion(s)== true){
					//Se añade la pelicula a la lista de peliculas
					return cartelera.addPelicula(s.getPelicula());
				}
			}
		}
		return false;
	}

	/**
	* Se añade una sesion al cine
	* @param s sesion que se desea añadir
	* @return true si se realiza correctamente y false si no es asi
	* @author Victoria Pelayo e Ignacio Rabunnal
	*/
	public boolean delSesion(Sesion s){
		int i;
		List<Sesion> sesiones;
		for(i = 0; i < salas.size(); i++){
			if(salas.get(i).delSesion(s) == true){
				return true;
			}
		}
		return false;
	}

	/**
	* Comprar entrada para una pelicula
	* @param precio de la entrada
	* @param dia de la semana que se compra
	* @param titulo titulo de la pelicula que se quiere ver
	* @return sesion donde se proyecta la pelicula o null en caso de error
	*/

	public Sesion comprarEntrada(double precio, Dia dia, String titulo, Edad edad){
		List<Sesion> s;
		int i,j;
		int descuento = 0;

		Entrada entrada;

		if(dia == Dia.MIERCOLES){
			descuento = 30;
		}else if(dia == Dia.FESTIVO){
			descuento = 50;
		}

		if(edad == Edad.ADULTO){
			if(descuento != 0){
				entrada = new EntradaEspectador(precio, descuento);
			}else{
				entrada = new Entrada(precio);
			}

		}else{
			int descuento2;
			if(edad == Edad.NINNO){
				descuento2 = 20;
			}else if(edad == Edad.NINNO_R){
				descuento2 = 30;
			}else if(edad == Edad.ADULTO_R){
				descuento2 = 20;
			}else if(edad == Edad.JUBILADO_R){
				descuento2 = 40;
			}else{
				descuento2 = 45;
			}

			entrada = new EntradaReducida(precio, descuento, descuento2);
		}

		

		for(i = 0; i < salas.size(); i++){
			s = salas.get(i).getSesiones();
			for(j =0 ; j < s.size(); j++){
				if(titulo == s.get(j).getPelicula().getTitulo() && s.get(j).getDisponibles() > 0){
					s.get(j).venderButaca();
					//En caso de que todo haya ido bien
					entradas.add(entrada);
					//Sesion en la que se proyecta la pelicula
					return s.get(j);
				}
			}
		}

		return null;		
	}

	/**
	* Calcular los beneficios del cine
	* @return dinero recaudado
	*/

	public double getBeneficios(){
		double res = 0;
		int i;

		for(i = 0; i < entradas.size(); i++){
			res += entradas.get(i).getPrecio();
		}

		return res;
	}

	/**
	* Elimina todos los registros de entradas anteriores
	* @author Victoria Pelayo e Ignacio Rabunnal
	*/

	public void borrarEntradas(){
		List<Entrada> entrads = new ArrayList<Entrada>();

		entradas = entrads;
	}

	/**
	* Elimina todos las peliclas
	* @author Victoria Pelayo e Ignacio Rabunnal
	*/

	public void borrarPeliculas(){
		cartelera = new Cartelera();
	}

	/**
	* Elimina todos las salas
	* @author Victoria Pelayo e Ignacio Rabunnal
	*/

	public void borrarSalas(){
		List<Sala> sala = new ArrayList<Sala>();

		salas = sala;
	}

}