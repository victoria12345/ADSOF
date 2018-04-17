package dominio;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.*;
import inodo.terminal.*;
import inodo.funcion.*;
import Individuo.*;
import excepciones.*;

/**
 * Descripcion de la interfaz IDominio
 *
 */
public interface IDominio {
	/**
	 * @param terminales string de los nombres de terminales
	 * @return lista con los terminales creados a partir de los argumentos
	 */
	public List<Terminal> definirConjuntoTerminales(String... terminales);
	
	/**
	 * @param argumentos String de enteros que indica numero de argumentos
	 * @param funciones array de funciones
	 * @return lista de funciones creadas a partir de los datos
	 * @throws ArgsDistintosFuncionesException
	 */
	public List<Function> definirConjuntoFunciones(int[] argumentos, String... funciones) throws ArgsDistintosFuncionesException;
	
	/**
	 * Define los valores de prueba
	 * @param ficheroDatos fuchero donde estan los valores de prueba
	 * @throws FileNotFoundException
	 * @throws IOException
	 */
	public void definirValoresPrueba(String ficheroDatos) throws FileNotFoundException, IOException;
	
	/**
	 * Calcula fitness de un individuo a partir de los valores de prueba
	 * @param individuo individuo que se quiere calcular su fitnes
	 * @return fitnes del individuo
	 */
	public double calcularFitness(IIndividuo individuo);
} 

