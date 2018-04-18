package testers;
import java.io.IOException;

import dominio.DominioAritmetico;
import dominio.IDominio;
import inodo.terminal.*;
import inodo.funcion.*;
import Individuo.*;

/**
 * Descripcion de la clase TesterYLecturaFitness
 * @author profesores ADSOF
 *
 */
public class TesterLecturaYFitness {

	/**
	 * main de prueba del apartado2
	 * @param args
	 * @throws IOException
	 * @throws IOException
	 * 
	 * @author profesores ADSOF
	 */
	public static void main(String[] args) throws IOException, IOException {
		IDominio domAritm;
		double fitness;

		domAritm = new DominioAritmetico();
		domAritm.definirValoresPrueba("valoresReducido.txt");
		Terminal x = new TerminalAritmetico("x");
		Function suma = new FuncionSuma("+", 2);
		Function resta = new FuncionResta("-", 2);
		Function multi = new FuncionMultiplicacion("*", 2);
		multi.incluirDescendiente(x);
		multi.incluirDescendiente(x);
		suma.incluirDescendiente(multi);
		suma.incluirDescendiente(x);
		resta.incluirDescendiente(suma);
		resta.incluirDescendiente(multi);

		IIndividuo indiv = new Individuo();
		indiv.setExpresion(resta);
		System.out.println();
		System.out.println("INDIVIDUO");
		indiv.writeIndividuo();
		System.out.println();
		fitness = domAritm.calcularFitness(indiv);
		System.out.println("\nFITNESS= "+fitness);
	}
} 