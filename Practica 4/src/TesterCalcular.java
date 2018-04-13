import inodo.funcion.*;
import inodo.terminal.*;
import Individuo.*;

public class TesterCalcular {

	public static void main(String[] args) {
		Terminal x = new TerminalAritmetico("x");
		Terminal y = new TerminalAritmetico("y");
		Terminal.setValor(10);
		Function suma = new FuncionSuma("+", 2);
		Function resta = new FuncionResta("-", 2);
		Function multi = new FuncionMultiplicacion("*", 2);
		multi.incluirDescendiente(x);
		multi.incluirDescendiente(y);
		suma.incluirDescendiente(multi);
		suma.incluirDescendiente(y);
		resta.incluirDescendiente(suma);
		resta.incluirDescendiente(multi); 

		System.out.println("Valor de la multi: "+multi+ multi.calcular() + "\n");
		System.out.println("Valor de la suma: "+suma+ suma.calcular() + "\n");
		System.out.println("Valor de la resta: "+resta+ resta.calcular() + "\n");

		IIndividuo indiv = new Individuo();
		indiv.setExpresion(resta);
		System.out.println();
		System.out.println("INDIVIDUO");
		indiv.writeIndividuo();

		System.out.println("\n Calcular de individuo: " + indiv.calcularExpresion());

	}

}
