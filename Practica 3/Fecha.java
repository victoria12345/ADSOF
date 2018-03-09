public class Fecha{

	private int dia;
	private int mes;
	private int anio;

  /**
   * Guarda en las variables privadas los valores pasados a la funcion
   */
	public Fecha(int dia, int mes, int anio){
	  	this.dia = dia;
	  	this.mes = mes;
	  	this.anio = anio;
  	}

  	/**
   * Imprime por pantalla los datos de la fecha
   * @author Victoria Pelayo e Ignacio Rabunnal
   * @return cadena de caracteres formada por los datos
   */
  	public String toString(){
  		String fecha = "";

  		return fecha + dia + "-" + mes + "-" + anio;
  	}

  	/**
   * Comprueba si la fecha es valida
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

}