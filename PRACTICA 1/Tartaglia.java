/**
 * Esta aplicación calcula el triangulo de Tartaglia
 * segun el numero de lineas introducido
 * Utiliza combinaciones definida en combinatoria.java para calcular
 * los numeros combinatorios
 *
 * @author Victoria Pelayo e Ignacio Rabuñal
*/

public class Tartaglia{

//Definicion de variables privadas
  private Combinatoria c;
  private int n;

  /**
   * Guarda en las variables privadas los valores pasados a la funcion
   * @param c de tipo combinatoria
   * @param n numero de lineas
   */
	public Tartaglia(Combinatoria c, int n){
  	this.n = n;
  	this.c = c;
	}

   /**
   * Se encarga de escribir el triangulo de tartaglia como una cadena
   * @return triangulo de tartaglia en forma de cadena
   */
	public String toString(){

		String tartaglia = "";

		for(int i = 0; i < n; i++){
			for(int j = 0; j<= i; j++){
        //Se va llamando a la funcion combinaciones para calcular el numero combinatorio
				tartaglia = tartaglia + c.combinaciones(i,j) + " ";
			}

			tartaglia = tartaglia + "\n";

		}

		return tartaglia;
	}

  /**
   * Punto de entrada a la aplicación.
   * 
   * Este método imprime el triangulo de tartaglia en funcion del parametro de entrada
   * @param args Los argumentos de la línea de comando. Se esperan un numero entero
   */

	public static void main(String[] args){

		if (args.length!=1) {
  	  System.out.println("Se espera un argumento como parametro, el numero de filas.");
  	  System.out.println("  n = Número total de elementos ");
    }

    else {
  	  int n  = Integer.parseInt(args[0]);   // convertimos de String a int

      //Comprobamos que el numero introducido no sea negativo
      if(n < 0){
        System.out.println("Error con el parametro introducido, se espera un entero positivo, el numero de filas.");
      }

  	  Combinatoria c = new Combinatoria();

  	  System.out.println(new Tartaglia(c,n));
    }

	}
}
