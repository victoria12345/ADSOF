package Individuo;

import java.util.List;

import inodo.INodo;
import inodo.Nodo;
import inodo.funcion.Function;
import inodo.terminal.Terminal;


public class Individuo implements IIndividuo{

	private Nodo raiz;
	
	@Override
	/**
	 * @return el nodo raiz
	 */
	public INodo getExpresion() {
		
		return raiz;
	}

	@Override
	/**
	 * Cambia el nodo raiz
	 * @param expresion nuevo nodo raiz
	 */
	public void setExpresion(INodo expresion) {
		raiz = (Nodo)expresion;
		
	}

	@Override
	public double getFitness() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void setFitness(double fitness) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void crearIndividuoAleatorio(int profundidad, List<Terminal> terminales, List<Function> funciones) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public double calcularExpresion() {
		
		return raiz.calcular();
	}

	@Override
	public int getNumeroNodos() {
		// TODO Auto-generated method stub
		return raiz.getnNodos();
	}

	@Override
	public void writeIndividuo() {
		System.out.println(raiz);
		
	}


}
