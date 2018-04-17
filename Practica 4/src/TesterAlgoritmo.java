import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.*;

import algoritmo.Algoritmo;
import algoritmo.IAlgoritmo;
import dominio.DominioAritmetico;
import dominio.IDominio;
import excepciones.ArgsDistintosFuncionesException;
import inodo.funcion.FuncionMultiplicacion;
import inodo.funcion.FuncionResta;
import inodo.funcion.FuncionSuma;
import inodo.funcion.Function;
import inodo.terminal.Terminal;
import inodo.terminal.TerminalAritmetico;

/**
 * Descripcion de la clase TesterAlgoritmo
 * @author Victoria Pelayo e Ignacio Rabunnal
 *
 */
public class TesterAlgoritmo {

	/**
	 * main para probar el apartado 4
	 * @param args
	 * 
	 * @author Victoria Pelayo e Ignacio Rabunnal
	 * @throws IOException 
	 * @throws FileNotFoundException 
	 * @throws ArgsDistintosFuncionesException 
	 */
	public static void main(String[] args) throws FileNotFoundException, IOException, ArgsDistintosFuncionesException {
		List<Terminal> terminales = new ArrayList<>();
		List<Function> funciones = new ArrayList<>();
		IDominio domAritm;
		
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

		domAritm = new DominioAritmetico();
		domAritm.definirValoresPrueba("valores.txt");
		
		terminales.add(x);
		
		funciones.add(suma);
		funciones.add(resta);
		funciones.add(multi);
		
		IAlgoritmo algoritmo = new Algoritmo(10, 10,0.9,3,6);
		
		System.out.println(algoritmo);
		
		algoritmo.defineConjuntoFunciones(funciones);
		algoritmo.defineConjuntoTerminales(terminales);
		
		algoritmo.ejecutar(domAritm);

	}

}
