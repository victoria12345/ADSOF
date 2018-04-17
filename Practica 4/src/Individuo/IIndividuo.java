package Individuo;

import java.util.List;

import inodo.INodo;
import inodo.funcion.Function;
import inodo.terminal.Terminal;

/**
 * Descripcion de la interfaz IIndividuo
 * 
 * @author Victoria Pelayo e Ignacio Rabunnal
 */
public interface IIndividuo {
	/**
	 * @return el nodo raiz del individuo
	 */
	public INodo getExpresion();
	
	/**
	 * Cambia el nodo raiz
	 * @param expresion  nuevo nodo raiz
	 */
	public void setExpresion(INodo expresion);
	
	/**
	 * @return fitness del individuo
	 */
	public double getFitness();
	
	/**
	 * Cambia el fitness del individuo
	 * @param fitness nuevo fitness
	 */
	public void setFitness(double fitness);
	
	/**
	 * Crea un individuo aleatorio
	 * @param profundidad profundidad que tendra el individuo
	 * @param terminales lista de terminales entre los que se eligiran sus terminales
	 * @param funciones lista de funciones entre las que se eligiran sus funciones
	 */
	public void crearIndividuoAleatorio(int profundidad, List<Terminal> terminales, List<Function> funciones);
	
	/**
	 * @return el valor asociado al nodo raiz
	 */
	public double calcularExpresion();
	
	/**
	 * Imprime por pantalla caracteristicas del individuo
	 */
	public void writeIndividuo();
	
	/**
	 * Etiqueta los nodos de un individuo
	 */
	public void etiquetaNodos();
	
	/**
	 * HAce una copia del individuo
	 * @return copia del individuo
	 * 
	 * @author Victoria Pelayo e Ignacio Rabunnal
	 */
	public IIndividuo copy();
}
