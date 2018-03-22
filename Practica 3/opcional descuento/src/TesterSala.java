/**
* Test para probar la clase sala
* @author Victoria Pelayo e Ignacio Rabunnal
*/

public class TesterSala{

	/**
	* main para probar la clase sala
	* Se crea una sala y se prueba a modificar
	* sus atributos utilizando sus funciones y comprobando
	* su funcionamiento
	* @author Victoria Pelayo e Ignacio Rabunnal
	*/
	public static void main(String[] args) {
		
		Pelicula p1 = new Pelicula("titulo", "director", 1960, "sinopsis", Genero.DRAMA);
		Pelicula p2 = new Pelicula("titulo2", "director2", 60, "sinopsis2", Genero.DRAMA);
		Fecha f = new Fecha(05,10,2011);
		Fecha f2 = new Fecha(25,10,2011);
		Sesion s1 = new Sesion(f,p1,10);
		Sesion s2 = new Sesion(f2,p1,10);
		Sesion s3 = new Sesion(f2, p1,5);

		Sala sala = new Sala(1,5);
		System.out.println("Inicial: \n" + sala);

		//Añadimos dos sesiones con distinta fecha
		sala.addSesion(s1);
		sala.addSesion(s3);

		System.out.println("Sesiones: " + sala.getSesiones());

		//Añadimos una sala el mismo dia
		sala.addSesion(s2);
		//Eliminamos la sala 1
		sala.delSesion(s1);
		System.out.println("\nSesiones(2): "+ sala.getSesiones());

		sala.addButaca();
		System.out.println("\nEstado final\n" + sala);
	}
}