package dominio;

import java.io.*;
import java.util.*;

import Individuo.IIndividuo;
import excepciones.ArgsDistintosFuncionesException;
import inodo.funcion.Function;
import inodo.terminal.Terminal;
import inodo.terminal.TerminalAritmetico;

/**
 * Descripcion de la clase DominioAritmetico
 * 
 * @author Victoria Pelayo e Ignacio Rabunnal
 */
public class DominioAritmetico implements IDominio{

	private Map<Double, Double> valores = new TreeMap<>();
	private List<Double> val = new ArrayList<>();

	/**
	 * Constructor de la clase DominioAritmetico
	 * 
	 * @author Victoria Pelayo e Ignacio Rabunnal
	 */
	public DominioAritmetico() {

	}

	/**
	 * @return lista de los valores de prueba del dominio aritmetico
	 * 
	 * @author Victoria Pelayo e Ignacio Rabunnal
	 */
	public List<Double> getVal() {
		return val;
	}

	/**
	 * Cambia los valores de prueba del dominio aritmetico
	 * @param val nueva lista con los valores de prueba
	 * 
	 * @author Victoria Pelayo e Ignacio Rabunnal
	 */
	public void setVal(List<Double> val) {
		this.val = val;
	}

	/**
	 * @return valores del dominio Artimetico
	 * 
	 * @author Victoria Pelayo e Ignacio Rabunnal
	 */
	public Map<Double, Double> getValores() {
		return valores;
	}

	/**
	 * Cambia los valores del dominio
	 * @param valores nuevo mapa con los valores
	 * 
	 * @author Victoria Pelayo e Ignacio Rabunnal
	 */
	public void setValores(Map<Double, Double> valores) {
		this.valores = valores;
	}

	@Override
	/**
	 * Crea una lista de terminales
	 * @param terminales Array de string con los nombres de los terminales
	 * @return lista con los terminales creados
	 * 
	 * @author Victoria Pelayo e Ignacio Rabunnal
	 */
	public List<Terminal> definirConjuntoTerminales(String... terminales) {
		List<Terminal> tm = new ArrayList<Terminal>();

		for(String s: terminales) {
			tm.add(new TerminalAritmetico(s));
		}
		return tm;
	}

	@Override
	/**
	 * Crea una lista de funciones a partir de los parametros
	 * @param argumentos array de enteros que es el numero de argumentos de las funciones
	 * @param funciones array de las funciones 
	 * @return lista con las funciones creadas 
	 * 
	 * @author Victoria Pelayo e Ignacio Rabunnal
	 */
	public List<Function> definirConjuntoFunciones(int[] argumentos, String... funciones)
			throws ArgsDistintosFuncionesException {
		List<Function> fns = new ArrayList<>();

		int i = 0;
		int j = argumentos.length;

		for(String f:funciones) {
			i++;
			if(j < i) {
				throw new ArgsDistintosFuncionesException();
			}
			fns.add(new Function(f, argumentos[i]));
		}

		if(j != i) {
			throw new ArgsDistintosFuncionesException();
		}
		return fns;
	}
 
	@Override
	/**
	 * Define los valores de prueba del dominio
	 * @param nombre del fichero donde estan los datos
	 * @throws FileNotFoundException
	 * @throws IOException
	 * 
	 * @author Victoria Pelayo e Ignacio Rabunnal
	 */
	public void definirValoresPrueba(String ficheroDatos) throws FileNotFoundException, IOException {
		BufferedReader buffer = new BufferedReader(new InputStreamReader(new FileInputStream(ficheroDatos)));
		String linea;
		double valor, resultado;

		while((linea = buffer.readLine()) != null) {
			String trozos[] = linea.split("\t");

			valor = Double.valueOf(trozos[0]).doubleValue();
			resultado = Double.valueOf(trozos[1]).doubleValue();

			valores.put(valor,resultado);
			val.add(valor);
		}

		buffer.close();
	}

	@Override
	/**
	 * Calcula el fitness de un individuoç
	 * @param individuo individuo sobre el que se quiere calcular el fitness
	 * @return fitness del individuo
	 * 
	 * @author Victoria Pelayo e Ignacio Rabunnal
	 */
	public double calcularFitness(IIndividuo individuo) {
		if(val.size() == 0) {
			return 0;
		}

		double real, aprox, valor;
		int fitness = 0;

		for(int i = 0; i < val.size(); i++) {
			valor = val.get(i);
			Terminal.setValor(valor);
			real = valores.get(val.get(i));

			aprox = individuo.calcularExpresion();

			if(real -1 <= aprox && real +1 >= aprox) {
				fitness++;
			}
		}
		return fitness;
	}

}
