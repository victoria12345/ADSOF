/**
 * Aqui definimos la clase Fecha
 * @author Victoria Pelayo e Ignacio Rabuñal
 * grupo 2101
 */
public class Fecha{

	private int dia; //Dia de la fecha
	private int mes; //mes de la fecha
	private int anio; //anio de la fecha

  /**
   * Guarda en las variables privadas los valores pasados a la funcion
   * @param dia dia de la fecha
   * @param mes mes de la fecha
   * @param anio anio de la fecha
   */
	public Fecha(int dia, int mes, int anio){
	  	this.dia = dia;
	  	this.mes = mes;
	  	this.anio = anio;
  	}

  	/**
   * Imprime por pantalla la fecha
   * @author Victoria Pelayo e Ignacio Rabunnal
   * @return cadena de caracteres formada por "anio-mes-dia"
   */
  	public String toString(){
  		String fecha = "";

  		return fecha + anio + "-" + mes + "-" + dia;
  	}

  	/**
   * Devuelve si una fecha es valida o no
   * @author Victoria Pelayo e Ignacio Rabunnal
   * @return true si lo es y false si no es asi
   */
  	public Boolean isFechaValida(){
  		if (anio < 0 || mes < 0 || dia < 0 || mes > 12){
  			return false;
  		}

  		if (mes % 2 == 1 || mes == 8){
  			if (dia > 31){
  				return false;
  			}


  		}else if (mes != 2){
  			if (dia > 30){
  				return false;
  			}
  		}else {
  			if (anio % 4 != 0 || anio % 400 != 0){
  				if (dia > 28){
  					return false;
  				}
  			}else {
  				if (dia > 29){
  					return false;
  				}
  			}	
  		}

  		return true;
 	}

 	/**
   * Devuelve un int que es dia de la fecha
   * @author Victoria Pelayo e Ignacio Rabunnal
   * @return dia dia de la fecha
   */
	public int getDia(){
		return dia;
	}

	/**
   * Devuelve un int que es mes de la fecha
   * @author Victoria Pelayo e Ignacio Rabunnal
   * @return mes mes de la fecha
   */
	public int getMes(){
		return mes;
	}

	/**
   * Devuelve un int que es anio de la fecha
   * @author Victoria Pelayo e Ignacio Rabunnal
   * @return anio anio de la fecha
   */
	public int getAnio(){
		return anio;
	}

	/**
   * Cambia el dia de una fecha
   * @param dia entero dia de la nueva fecha
   * @author Victoria Pelayo e Ignacio Rabunnal
   */
	public void setDia(int dia){
		this.dia = dia;
	}

	/**
   * Cambia el mes de una fecha
   * @param mes entero mes de la nueva fecha
   * @author Victoria Pelayo e Ignacio Rabunnal
   */
	public void setMes(int mes){
		this.mes = mes;
	}

	/**
   * Cambia el anio de una fecha
   * @param anio entero anio de la nueva fecha
   * @author Victoria Pelayo e Ignacio Rabunnal
   */
	public void setAnio(int anio){
		this.anio = anio;
	}

}