/**
 * Aqui definimos la clase Persona y su clase hija Alumno
 * @author Victoria Pelayo e Ignacio Rabuñal
 * grupo 2101
 */

public class Persona{
	private String nombre;
	private String apellido;
	private String dni;
	private Fecha nacimiento;
	private int telefono;


	/**
   * Constructor de la clase persona. Los unicos atributos necesarios para una persona son los
   * que se pasan, aunque esta clase tambien tiene los atributos privados telefono y nacimiento
   * @param dni el dni de la persona
   * @param nombre nombre de la persona
   * @param apellido apellido de la persona
   * @author Victoria Pelayo e Ignacio Rabunnal
   */
	public Persona(String dni, String nombre, String apellido){
		this.nombre = nombre;
		this.apellido = apellido;
		this.dni = dni;
		//Valores por defecto
		this.nacimiento = null;
		this.telefono = -1;
		
	}

	/**
   * Devuelve una cadena de caracteres que es el nombre de la persona
   * @author Victoria Pelayo e Ignacio Rabunnal
   * @return nombre el nombre de la persona
   */
	public String getNombre(){
		return nombre;
	}

	/**
   * Devuelve una cadena de caracteres que es el apellido de la persona
   * @author Victoria Pelayo e Ignacio Rabunnal
   * @return apellido el apellido de la persona
   */
	public String getApellido(){
		return apellido;
	}

	/**
   * Devuelve una cadena de caracteres que es el dni de la persona
   * @author Victoria Pelayo e Ignacio Rabunnal
   * @return dni el dni de la persona
   */
	public String getDni(){
		return dni;
	}

	/**
   * Devuelve una Fecha que es la fecha de nacimiento de la persona
   * @author Victoria Pelayo e Ignacio Rabunnal
   * @return nacimiento la fecha de nacimiento de la persona
   */
	public Fecha getNacimiento(){
		return nacimiento;
	}

	/**
   * Devuelve un entero que es el telefono de la persona
   * @author Victoria Pelayo e Ignacio Rabunnal
   * @return telefono el telefono de la persona
   */
	public int getTelefono(){
		return telefono;
	}

	/**
   * Devuelve una cadena de caracteres que es el nombre de la persona
   * @author Victoria Pelayo e Ignacio Rabunnal
   * @return nombre el nombre de la persona
   */
	public void setNombre(String nombre){
		this.nombre = nombre;
	}

	public void setApellido(String apellido){
		this.apellido = apellido;
	}

	public void setDni(String dni){
		this.dni = dni;
	}

	public void setNacimiento(Fecha fecha){
		if(fecha.isFechaValida() == true){
			this.nacimiento = fecha;
		}
	}

	public void setTelefono(int telefono){
		this.telefono = telefono;
	}

	public String toString(){
		String alumno = "";

		//La fecha de nacimiento y el numero de telefono no se imprimiran de manera predeterminada
  		return alumno +"\n\t"+ "Nombre: " + nombre+ "\n" +
  			"\t"+ "Apellido: " + apellido+ "\n"+
  			"\t"+ "DNI: " + dni+ "\n";

	}
}

 class Alumno extends Persona{

	
	private Fecha matriculacion;
	
	private String permiso;

	public Alumno(String dni,String nombre, String apellido,int anio, int mes, int dia, String permiso){
		super(dni, nombre, apellido);
		this.permiso = permiso;
		matriculacion = new Fecha(dia,mes,anio);
		this.matriculacion = matriculacion;

	}

	public String toString(){
  		String alumno = "";

  		return super.toString()+
  			"\t"+ "Fecha Matricula: " + matriculacion+ "\n"+
  			"\t"+ "Permiso: " + permiso;
  	}

	public Fecha getFechaMatr(){
		return matriculacion;
	}


	public String getPermiso(){
		return permiso;
	}

	public void setFechaMatr(Fecha fecha){
		if(fecha.isFechaValida() == true){
			this.matriculacion = fecha;
		}
	}


	public void getPermiso(String permiso){
		this.permiso = permiso;
	}

}