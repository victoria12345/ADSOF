 
  public class Tartaglia{

  	private Combinatoria c;
	private int n;

  	public Tartaglia(Combinatoria c, int n){
	  	this.n = n;
	  	this.c = c;
  	}

  	public String toString(){

  		String s = "";

  		for(int i = 0; i < n; i++){
  			for(int j = 0; j<= i; j++){
  				s = s + c.combinaciones(i,j) + " ";
  			}

  			s = s + "\n";

  		}

  		return s;
  	}

  	public static void main(String[] args){

  		if (args.length!=1) {
    	  System.out.println("Se espera un argumento como parametro, el numero de filas.");
    	  System.out.println("  n = Número total de elementos ");
      }

      else {
    	  int n  = Integer.parseInt(args[0]);   // convertimos String a int
    	  Combinatoria c = new Combinatoria();

    	  System.out.println(new Tartaglia(c,n));
      }

  	}
  }
