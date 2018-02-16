public class Alumno{

	private String nombre;
	private String apellido;
	private Fecha matriculacion;
	private String dni;
	private String permiso;

	public Alumno(String dni,String nombre, String apellido,int anio, int mes, int dia, String permiso){
		this.nombre = nombre;
		this.apellido = apellido;
		this.dni = dni;
		this.permiso = permiso;

		matriculacion = new Fecha(dia,mes,anio);
		this.matriculacion = matriculacion;

	}

	public String toString(){
  		String alumno = "";

  		return alumno +"\n\t"+ "Nombre: " + nombre+ "\n" +
  			"\t"+ "Apellido: " + apellido+ "\n"+
  			"\t"+ "DNI: " + dni+ "\n"+
  			"\t"+ "Fecha Matricula: " + matriculacion+ "\n"+
  			"\t"+ "Permiso: " + permiso;
  	}

	public Fecha getFechaMatr(){
		return matriculacion;
	}

	public String getNombre(){
		return nombre;
	}

	public String getApellido(){
		return apellido;
	}

	public String getDni(){
		return dni;
	}

	public String getPermiso(){
		return permiso;
	}

}