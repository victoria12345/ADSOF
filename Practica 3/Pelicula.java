/**
 * Aqui definimos la clase Pelicula
 * @author Victoria Pelayo e Ignacio Rabuñal
 * grupo 2101
 */


public class Pelicula{
	private String titulo;
	private String director;
	private int anno;
	private String sinopsis;
	private Genero genero;

	/**
	* Constructor de la clase Pelicula
	* @author Victoria Pelayo e Ignacio Rabuñal
	* @param titutlo titulo que va a tener la clase pelidula
	* @param director nombre del director de la pelicula
	* @param anno anno en el que la pelicula fue estrenada
	* @param sinopsis sinopsis de la pelicula
	* @param genero genero de la pelicula
	*/
	public Pelicula(String titulo, String director, int anno, String sinopsis, Genero genero){

		this.titulo = titulo;
		this.director = director;
		this.anno = anno;
		this.sinopsis = sinopsis;
		this.genero = genero;

	}

	/**
   * Imprime por pantalla los datos de la pelicula
   * @author Victoria Pelayo e Ignacio Rabunnal
   * @return cadena de caracteres formada por los datos
   */
	public String toString(){
		String pelicula = "";

		return pelicula = pelicula + "Título: " + titulo + "\n"+
		"Director: "+ director + "\n"+
		"Anno: "+ anno + "\n"+
		"Sinopsis: "+ sinopsis+ "\n"+
		"Genero: " + genero+ "\n";
	}

	/**
	* Devuelve el titulo de una pelicula
	* @author Victoria Pelayo e Ignacio Rabunnal
	* @return titulo cadena de caracteres que corresponde al titulo
	*/

	public String getTitulo(){
		return titulo;
	}

	/**
	* Devuelve el director de una pelicula
	* @author Victoria Pelayo e Ignacio Rabunnal
	* @return director cadena de caracteres que corresponde al director
	*/

	public String getDirector(){
		return director;
	}

	/**
	* Devuelve el anno de una pelicula
	* @author Victoria Pelayo e Ignacio Rabunnal
	* @return anno int que corresponde al anno
	*/

	public int getAnno(){
		return anno;
	}

	/**
	* Devuelve la sinopsis de una pelicula
	* @author Victoria Pelayo e Ignacio Rabunnal
	* @return sinopsis cadena de caracteres que corresponde a la sinopsis
	*/

	public String getSinopsis(){
		return sinopsis;
	}

	/**
	* Devuelve el genero de una pelicula
	* @author Victoria Pelayo e Ignacio Rabunnal
	* @return genero de tipo genero
	*/

	public Genero getGenero(){
		return genero;
	}

	/**
	* Cambia el titulo de una pelicula
	* @author Victoria Pelayo e Ignacio Rabunnal
	* @param titulo nuevo titulo de la pelicula
	*/

	public void setTitulo(String titulo){
		this.titulo = titulo;
	}

	/**
	* Cambia el director de una pelicula
	* @author Victoria Pelayo e Ignacio Rabunnal
	* @param director nuevo director de la pelicula
	*/

	public void setDirector(String director){
		this.director = director;
	}

	/**
	* Cambia el anno de una pelicula
	* @author Victoria Pelayo e Ignacio Rabunnal
	* @param anno nuevo anno de la pelicula
	*/

	public void setAnno(int anno){
		this.anno = anno;
	}

	/**
	* Cambia la sinopsis de una pelicula
	* @author Victoria Pelayo e Ignacio Rabunnal
	* @param sinopsis nueva sinopsis de la pelicula
	*/

	public void setSinopsis(String sinopsis){
		this.sinopsis = sinopsis;
	}

	/**
	* Cambia el genero de una pelicula
	* @author Victoria Pelayo e Ignacio Rabunnal
	* @param genero nuevo genero de la pelicula
	*/

	public void setGenero(Genero genero){
		this.genero = genero;
	}
}