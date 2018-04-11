package dominio;

import java.io.*;
import java.util.*;

import Individuo.IIndividuo;
import excepciones.ArgsDistintosFuncionesException;
import inodo.funcion.Function;
import inodo.terminal.Terminal;
import inodo.terminal.TerminalAritmetico;

public class DominioAritmetico implements IDominio{

	private Map<Double, Double> valores = new TreeMap<>();
	private List<Double> val = new ArrayList<>();
	
	public DominioAritmetico() {
			
	}

	public List<Double> getVal() {
		return val;
	}

	public void setVal(List<Double> val) {
		this.val = val;
	}


	public Map<Double, Double> getValores() {
		return valores;
	}

	public void setValores(Map<Double, Double> valores) {
		this.valores = valores;
	}

	@Override
	public List<Terminal> definirConjuntoTerminales(String... terminales) {
		List<Terminal> tm = new ArrayList<Terminal>();
		
		for(String s: terminales) {
			tm.add(new TerminalAritmetico(s));
		}
		return tm;
	}

	@Override
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
