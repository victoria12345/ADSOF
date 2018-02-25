/**
 * Aqui definimos la clase Autoecuela
 * @author Victoria Pelayo e Ignacio Rabuñal
 * grupo 2101
 */
public class Autoescuela{

	private int codigo;
  private String nombre;
  private String direccion;
  private Profesor encargado;
  private Profesor profesores[]= new Profesor[100];
  private Alumno alumnos[] = new Alumno[100];
  /**
  *La siguiente parte no la implementams porque no se pide en el anunciado
  * habria que crear las clases Aula y Coche y se implementarian como un array
  * no implementaremos las funciones relacionadas con estos atributos ni apareceran
  * en el constructor. En caso de que se implementara realmente todas las clases
  * aparecerian como el resto.
  *
  * private Coche flota[]= new Coche[100];
  * private Aula aulas[] = new Aula[100];
  */

  /**
   * Constructor de la clase Autoescuela
   * @param codigo entero que es el codigo de la autoescuela
   * @param nombre nombre de la autoescuela
   * @param direccion direccion de la autoescuella
   * @param encargado persona encargada de la autoescuela de tipo profesor
   * @param profesores lista de los profesores que trabajan en la autoescuela
   * @param alumnos lista de los alumnos que vna a esa autoescuela
   */
	public Autoescuela(int codigo, String nombre, String direccion, Profesor encargado, Profesor[] profesores, Alumno[] alumnos){
	  	this.codigo = codigo;
      this.nombre = nombre;
      this.direccion = direccion;
      this.encargado = encargado;
      this.profesores = profesores;
      this.alumnos = alumnos;
  	}

  	/**
   * Imprime por pantalla las caracteristicas de la autoescuela
   * @author Victoria Pelayo e Ignacio Rabunnal
   * @return cadena de caracteres formada por los datos correspondientes
   */
  	public String toString(){
  		String autoescuela = "";

  		 autoescuela = autoescuela + "Autoescuela de nombre: " + nombre + " y direccion: " + direccion +
       " y codigo " + codigo + " y encargado: " + encargado + "\n"+ "Profesores: " ;

       for(int i = 0; i < 100; i++){
        //Comprobamos que esa posicion no sea null, si lo es que pare el bucle
          if(profesores[i] == null){
            i = 100;
          }else{
            autoescuela = autoescuela + profesores[i].getNombre()+ "  ";
          }
        
       }

       autoescuela = autoescuela + "\nAlumnos: ";
       //Comprobamos que esa posicion no sea null, si lo es que pare el bucle
       for(int i = 0; i < 100; i++){
        if(alumnos[i] == null){
            i = 100;
          }else{
            autoescuela = autoescuela + alumnos[i].getNombre()+ "  ";
          }
       }

       autoescuela = autoescuela + "\n";
       return autoescuela;
  	}

  	/**
   * Devuelve nombre de la autoescuela
   * @author Victoria Pelayo e Ignacio Rabunnal
   * @return nombre que es el nombre de la autoescuela
   */
    public String getNombre(){
      return nombre;
    }

    /**
   * Devuelve codigo de la autoescuela
   * @author Victoria Pelayo e Ignacio Rabunnal
   * @return codigo que es el codigo de la autoescuela
   */
    public int getCodigo(){
      return codigo;
    }

    /**
   * Devuelve la direccion de la autoescuela
   * @author Victoria Pelayo e Ignacio Rabunnal
   * @return direccion que es el direccion de la autoescuela
   */
    public String getDireccion(){
      return direccion;
    }

    /**
   * Devuelve el encargado de la autoescuela
   * @author Victoria Pelayo e Ignacio Rabunnal
   * @return encargado que es el encargado de la autoescuela
   */
    public Profesor getEncargado(){
      return encargado;
    }

    /**
   * Devuelve los profesores de la autoescuela
   * @author Victoria Pelayo e Ignacio Rabunnal
   * @return profesores que son los profesores de la autoescuela
   */
    public Profesor[] getProfesores(){
      return profesores;
    }

     /**
   * Devuelve los alumnos de la autoescuela
   * @author Victoria Pelayo e Ignacio Rabunnal
   * @return alumnos que son los alumnos de la autoescuela
   */
    public Alumno[] getAlumnos(){
      return alumnos;
    }

    /**
   * Cambia nombre de la autoescuela
   * @param nombre nuevo nombre de la autoescuela
   * @author Victoria Pelayo e Ignacio Rabunnal
   */
    public void setNombre(String nombre){
      this.nombre = nombre;
    }

    /**
   * Cambia codigo de la autoescuela
   * @param codigo nuevo codigo de la autoescuela
   * @author Victoria Pelayo e Ignacio Rabunnal
   */
    public void setCodigo(int codigo){
      this.codigo = codigo;
    }

    /**
   * Cambia direccion de la autoescuela
   * @param direccion nueva direccion de la autoescuela
   * @author Victoria Pelayo e Ignacio Rabunnal
   */
    public void setDireccion(String direccion){
      this.direccion = direccion;
    }

    /**
   * Cambia el encargado de la autoescuela
   * @param encargado nuevo encargado de la autoescuela
   * @author Victoria Pelayo e Ignacio Rabunnal
   */
    public void setEncargado(Profesor encargado){
      this.encargado = encargado;
    }

    /**
   * Cambia el conjunto de profesores que trabajan en la autoescuela
   * @param profesores nuevos profesores de la autoescuela
   * @author Victoria Pelayo e Ignacio Rabunnal
   */
    public void setProfesores(Profesor[] profesores){
      this.profesores = profesores;
    }

    /**
   * Cambia el conjunto de alumnos que estudian en la autoescuela
   * @param alumnos nuevos alumnos de la autoescuela
   * @author Victoria Pelayo e Ignacio Rabunnal
   */
    public void setAlumnos(Alumno[] alumnos){
      this.alumnos = alumnos;
    }

    //Para el apartado opcional hemos decidido crear algunas funciones extra

    /**
    *Comprueba si un profesor pertenece a la autoescuela
    *
    * @param p1 profesor que buscamos
    * @return true si pertenece y false si no es asi
    * @author Victoria Pelayo e Ignacio Rabunnal
    * grupo 2101
    */

    public Boolean profesorInAutoescuela(Profesor p1){
      for(int i = 0; profesores[i]!= null && i <= 100; i++ ){
        //el dni es unico para cada persona
        if(profesores[i].getDni() == p1.getDni()){
          return true;
        }
      }

      return false;
    }

    /**
    *Comprueba si un alumno pertenece a la autoescuela
    *
    * @param a1 alumno que buscamos
    * @return true si pertenece y false si no es asi
    * @author Victoria Pelayo e Ignacio Rabunnal
    * grupo 2101
    */

    public Boolean alumnoInAutoescuela(Alumno a1){
      for(int i = 0; alumnos[i] != null && i <= 100; i++ ){
        //el dni es unico para cada persona
        if(alumnos[i].getDni() == a1.getDni()){
          return true;
        }
      }

      return false;
    }

}