package Individuo;

import java.util.List;

import inodo.INodo;
import inodo.funcion.Function;
import inodo.terminal.Terminal;

public interface IIndividuo {
	public INodo getExpresion();
	public void setExpresion(INodo expresion);
	public double getFitness();
	public void setFitness(double fitness);
	public void crearIndividuoAleatorio(int profundidad, List<Terminal> terminales, List<Function> funciones);
	public double calcularExpresion();
	public int getNumeroNodos();
	public void writeIndividuo();
	public void etiquetaNodos(); 
}
