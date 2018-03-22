/**
* Definicion del test de la clase Pelicula
* @author Victoria Pelao e Ignacio Rabunnal
*/

public class TesterPelicula{
	/**
	* main para prbar la clase pelicula
	* Se crea una pelicula se cambian los atributos
	* utilizando sus funciones y se comprueba
	* su correcto funcionamiento
	*/
	public static void main(String[] args) {
		Pelicula p = new Pelicula("titulo", "director", 1960, "sinopsis", Genero.DRAMA);

		//Imprimimos la pelicula para ver su estado actual
		System.out.println("Inicial: \n" + p);

		//Probamos a cambiar sus atributos
		p.setTitulo("Titulo2");
		p.setDirector("Director2");
		p.setAnno(50);
		p.setSinopsis("Sinopsis2");
		p.setGenero(Genero.TERROR);

		//Imprimimos para comprobar el resultado
		System.out.println("Final: \n" + p);
	}
}