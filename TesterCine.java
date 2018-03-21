/**
* Test para probar la clase cine
* Dado que cine llama a funciones del resto de clases
* directa o indirectamente, este test servirá como prueba de integracion
* @author Victoria Pelayo e Ignacio Rabunnal
*/

public class TesterCine{

	/**
	* main para probar la clase cine
	* iremos mdificando sius atributos utilizando funciones suyas
	* e iremos comprobando su funcionamiento. 
	* A su vez se comprueba como trabajan todos los modulos juntos
	* @author Victoria Pelayo e Ignacio Rabunnal
	*/
	public static void main(String[] args) {
		Pelicula p1 = new Pelicula("titulo", "director", 1960, "sinopsis", Genero.DRAMA);
		Fecha f = new Fecha(05,10,2011);
		Fecha f2 = new Fecha(25,10,2011);
		Sesion s1 = new Sesion(f,p1,10);
		Sesion s2 = new Sesion(f2,p1,10);
		Sesion s3 = new Sesion(f2, p1,5);
		Sala sal1 = new Sala(1,5);
		Sala sal2 = new Sala(2, 30);

		sal1.addSesion(s1);
		sal2.addSesion(s2);
		sal1.addSesion(s3);

		Cine c = new Cine( )
	}
}