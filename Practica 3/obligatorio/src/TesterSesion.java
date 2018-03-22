/**
* Clase para comprobar funcionamiento de la clase sesion
* @author Victoria Pelayo e Ignacio Rabuñal
*/

public class TesterSesion{

	/**
	* main para comprobar funcionamiento de la clase sesion
	* Se crea una sesion y se modifican los atributos
	* utilizando sus funciones y despues se imprimen los datos
	* para comprobar su correcto funcionamiento
	* @author Victoria Pelayo e Ignacio Rabuñal
	*/
	public static void main(String[] args) {

		Pelicula p1 = new Pelicula("titulo", "director", 1960, "sinopsis", Genero.DRAMA);
		Pelicula p2 = new Pelicula("titulo2", "director2", 1960, "sinopsis2", Genero.DRAMA);
		Fecha f = new Fecha(05,10,2011);
		Fecha f2 = new Fecha(25,10,2011);

		Sesion s = new Sesion(f,p1,10);
		System.out.println("Inicial: \n" + s);

		//Modificamos los datos de la sesion
		s.setFecha(f2);
		s.setPelicula(p2);
		s.addButaca();
		System.out.println("Modificacion1: \n" + s);

		//Probamos a vender 11 butacas
		int i;
		for(i = 0; i< 11; i++){
			s.venderButaca();
			System.out.println("Disponibles: "+ s.getDisponibles()+ "\n");
		}

		//Probamos a vender una butaca de mas
		//Tambien a eliminar una butaca disponible de mas
		s.delButaca();
		s.venderButaca();

		System.out.println("Estado final: \n" + s);		
	}
}