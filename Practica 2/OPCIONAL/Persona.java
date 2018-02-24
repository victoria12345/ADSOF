/**
 * Aqui definimos la clase Persona y su clase hija Alumno
 * @author Victoria Pelayo e Ignacio Rabuñal
 * grupo 2101
 */

import java.util.*;

public class Persona{
	private String nombre; //Nombre 
	private String apellido; //Apellido 
	private String dni;  //Dni 
	private Fecha nacimiento; //Fecha de nacimiento
	private int telefono; //numero de telefono


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
   * Imprime por pantalla los datos principales de una persona
   * @author Victoria Pelayo e Ignacio Rabunnal
   * @return cadena de caracteres formada por los datos principales
   */
	public String toString(){
		String alumno = "";

		//La fecha de nacimiento y el numero de telefono no se imprimiran de manera predeterminada
  		return alumno +"\n\t"+ "Nombre: " + nombre+ "\n" +
  			"\t"+ "Apellido: " + apellido+ "\n"+
  			"\t"+ "DNI: " + dni+ "\n";

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
   * Cambia el nombre de una persona
   * @param nombre nevo nombre de la persona
   * @author Victoria Pelayo e Ignacio Rabunnal
   */
	public void setNombre(String nombre){
		this.nombre = nombre;
	}

	/**
   * Cambia el apellido de una persona
   * @param apellido nevo apellido de la persona
   * @author Victoria Pelayo e Ignacio Rabunnal
   */
	public void setApellido(String apellido){
		this.apellido = apellido;
	}

	/**
   * Cambia el dni de una persona
   * @param dni nevo dni de la persona
   * @author Victoria Pelayo e Ignacio Rabunnal
   */
	public void setDni(String dni){
		this.dni = dni;
	}

	/**
   * Cambia la fecha de nacimiento de una persona
   * @param fecha nueva fecha de nacimiento de la persona
   * @author Victoria Pelayo e Ignacio Rabunnal
   */
	public void setNacimiento(Fecha fecha){
		if(fecha.isFechaValida() == true){
			this.nacimiento = fecha;
		}
	}

	/**
   * Cambia el telefono de una persona
   * @param telefono nevo telefono de la persona
   * @author Victoria Pelayo e Ignacio Rabunnal
   */
	public void setTelefono(int telefono){
		this.telefono = telefono;
	}
}

/**
 * Aqui definimos la clase hija Alumno
 * @author Victoria Pelayo e Ignacio Rabuñal
 * grupo 2101
 */
 class Alumno extends Persona{	
	private Fecha matriculacion; //Fecha de matriculacion en la autoescuela
	private String permiso; //permiso en el que esta matriculado
	private String carnet; //carnet que posee previamente
	private Fecha teorico; //fecha en el que aprueba el teorico
	private Fecha practico; //fecha en el que aprueba el practico
	private int descuento; //descuento del alumno

	/**
   * Constructor de la clase alumno. 
   * @param dni el dni de la persona
   * @param nombre nombre de la persona
   * @param apellido apellido de la persona
   * @param anio año de matriclacion
   * @param mes mes de matriculacion
   * @param dia dia de matriculacion
   * @param permiso permiso de matriculacion
   * @author Victoria Pelayo e Ignacio Rabunnal
   */
	public Alumno(String dni,String nombre, String apellido,int anio, int mes, int dia, String permiso){
		super(dni, nombre, apellido);
		this.permiso = permiso;
		matriculacion = new Fecha(dia,mes,anio);
		this.matriculacion = matriculacion;
		//Valores predeterminados al crear un alumno
		this.carnet = null;
		this.teorico = null;
		this.practico = null;
		this.descuento = 0;

	}

	/**
   * Imprime por pantalla los datos principales de un alumno
   * @author Victoria Pelayo e Ignacio Rabunnal
   * @return cadena de caracteres formada por los datos principales
   */
	public String toString(){
  		String alumno = "";

  		//Se imprimen los datos principales de una persona mas los de un alumno
  		return super.toString()+
  			"\t"+ "Fecha Matricula: " + matriculacion+ "\n"+
  			"\t"+ "Permiso: " + permiso;
  	}

  	/**
   * Devuelve una fecha que es la fecha de matriculacion de un alumno
   * @author Victoria Pelayo e Ignacio Rabunnal
   * @return matriculacion fecha de matriculacion del alumno
   */
	public Fecha getFechaMatr(){
		return matriculacion;
	}

	/**
   * Devuelve una cadena de caracteres que es el permiso de un alumno
   * @author Victoria Pelayo e Ignacio Rabunnal
   * @return permiso el permiso del alumno
   */
	public String getPermiso(){
		return permiso;
	}

	/**
   * Devuelve la fecha en la que el alumno aprobo el teorico
   * @author Victoria Pelayo e Ignacio Rabunnal
   * @return teorico fecha en la que se aprobo el teorico
   */
	public Fecha getTeorico(){
		return teorico;
	}

	/**
   * Devuelve la fecha en la que el alumno aprobo el Practico
   * @author Victoria Pelayo e Ignacio Rabunnal
   * @return Practico fecha en la que se aprobo el Practico
   */
	public Fecha getPractico(){
		return practico;
	}

	/**
   * Devuelve una cadena de caracteres que es el permiso que ya poseía un alumno
   * @author Victoria Pelayo e Ignacio Rabunnal
   * @return permiso el permiso del alumno
   */
	public String getCarnet(){
		return carnet;
	}

	/**
   * Devuelve un un entero que es el descuento de un alumno
   * @author Victoria Pelayo e Ignacio Rabunnal
   * @return descuento el descuento que posee un alumno
   */
	public int getDecuento(){
		return descuento;
	}

	/**
   * Cambia un una Fecha que es la fecha del teorico de un alumno
   * @param fecha nueva fecha en la que aprobo el teorico
   * @author Victoria Pelayo e Ignacio Rabunnal
   */
	public void setTeorico(Fecha fecha){
		if(fecha.isFechaValida() == true){
			this.teorico = fecha;
		}
	}

	/**
   * Cambia un una Fecha que es la fecha del practico de un alumno
   * @param fecha nueva fecha en la que aprobo el practico
   * @author Victoria Pelayo e Ignacio Rabunnal
   */
	public void setPractico(Fecha fecha){
		if(fecha.isFechaValida() == true){
			this.practico = fecha;
		}
	}

	/**
   * Cambia un el permiso en el que esta matriculado
   * @param permiso nuevo permiso en el que se matricula
   * @author Victoria Pelayo e Ignacio Rabunnal
   */
	public void setPermiso(String permiso){
		this.permiso = permiso;
	}

	/**
   * Cambia un el carnet que poseia
   * @param carnet nuevo tipo de carnet que ya posee
   * @author Victoria Pelayo e Ignacio Rabunnal
   */
	public void setCarnet(String carnet){
		this.carnet = carnet;
	}
}

/**
 * Aqui definimos la clase hija Profesor
 * @author Victoria Pelayo e Ignacio Rabuñal
 * grupo 2101
 */
 class Profesor extends Persona{	
	private int nSegSocial; //numero de la seguridad social
	private double sueldo; //carnet que posee previamente
	private List<String> categorias = new ArrayList<String>(); //Lista de categorias que puede impartir
	private Fecha iniActividad; //fecha en el que aprueba el practico
	private Fecha finActividad; //descuento del alumno
	private String autoescuela;

	/**
   * Constructor de la clase alumno. 
   * @param dni el dni 
   * @param nombre nombre 
   * @param apellido apellido 
   * @param social numero de la seguridad social
   * @param categorias categorias que puede impartir el profesor
   * @param inicio primer dia que trabajo en la autoescuela
   * @param fin ultimo dia que trabajo en la autoescuela
   * @author Victoria Pelayo e Ignacio Rabunnal
   */
	public Profesor(String dni,String nombre, String apellido,int social,  List<String> categorias,Fecha inicio, Fecha fin){
		super(dni, nombre, apellido);
		this.nSegSocial = social;
		this.sueldo = 900;
		this.categorias = categorias;
		this.iniActividad = inicio;
		this.finActividad = fin;


	}

	/**
   * Imprime por pantalla los datos principales de un profesor
   * @author Victoria Pelayo e Ignacio Rabunnal
   * @return cadena de caracteres formada por los datos principales
   */
	public String toString(){
  		String alumno = "";

  		//Se imprimen los datos principales de una persona mas los de un alumno
  		return super.toString()+
  			"\t"+ "Numero seguridad social: " + nSegSocial+ "\n"+
  			"\t"+ "Sueldo: " + sueldo + "\n"+ 
  			"\t" + "Categorias: " + categorias + "\n" +
  			"\t" + "Fecha Ini: " + iniActividad + "\n"+
  			"\t" + "Fecha Fin: " + finActividad + "\n";
  	}

  	/**
   * Devuelve numero de la seguridad social de un profesor
   * @author Victoria Pelayo e Ignacio Rabunnal
   * @return nSegSocial numero de la seguridad social
   */
	public int getNSegSocial(){
		return nSegSocial;
	}

	/**
   * Devuelve sueldo de un profesor
   * @author Victoria Pelayo e Ignacio Rabunnal
   * @return sueldo sueldo de un profesor
   */
	public double getSueldo(){
		return sueldo;
	}

	/**
   * Devuelve categorias que puede impartir un profesor
   * @author Victoria Pelayo e Ignacio Rabunnal
   * @return categorias que puede impartir un profesor
   */
	public List<String> getCategorias(){
		return categorias;
	}

	/**
   * Devuelve la fecha en la que el profesor empezo a trabajr en la autoescuela
   * @author Victoria Pelayo e Ignacio Rabunnal
   * @return fechaIni fecha de inicio de trabajar
   */
	public Fecha getFechaIni(){
		return iniActividad;
	}

	/**
   * Devuelve la fecha en la que el profesor paro de trabajr en la autoescuela
   * @author Victoria Pelayo e Ignacio Rabunnal
   * @return fechaFin fecha de fin de trabajar
   */
	public Fecha getFechaFin(){
		return finActividad;
	}

	/**
   * Cambia el numero de la seguridad social de un profesor
   * @author Victoria Pelayo e Ignacio Rabunnal
   * @param numero nuevo numero de la seguridad social
   */
	public void setNSegSocial(int numero){
		this.nSegSocial = numero;
	}

	/**
   * Cambia el sueldo de un profesor
   * @author Victoria Pelayo e Ignacio Rabunnal
   * @param sueldo nuevo sueldo que se le asigna
   */
	public void setSueldo(double sueldo){
		if(sueldo >= 900){
			this.sueldo  = sueldo;
			return;
		}

		System.out.println("El sueldo minimo es 900.");
	}

	/**
   * Cambia las categorias de un profesor
   * @author Victoria Pelayo e Ignacio Rabunnal
   * @param categorias lista de las categorias que puede impartir
   */
	public void setCategorias(List<String> categorias){
		this.categorias = categorias;
	}

	/**
   * Cambia la fecha de inicio
   * @author Victoria Pelayo e Ignacio Rabunnal
   * @param fechaIni nueva fecha de inicio
   */
	public void setIniActividad(Fecha fechaIni){
		this.iniActividad = fechaIni;
	}

	/**
   * Cambia la fecha de fin
   * @author Victoria Pelayo e Ignacio Rabunnal
   * @param fechaFin nueva fecha de fin
   */
	public void setFinActividad(Fecha fechaFin){
		this.finActividad = fechaFin;
	}

	
}