package dominio;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.*;
import inodo.terminal.*;
import inodo.funcion.*;
import Individuo.*;
import excepciones.*;


public interface IDominio {
	public List<Terminal> definirConjuntoTerminales(String... terminales);
	public List<Function> definirConjuntoFunciones(int[] argumentos, String... funciones) throws ArgsDistintosFuncionesException;
	public void definirValoresPrueba(String ficheroDatos) throws FileNotFoundException, IOException;
	public double calcularFitness(IIndividuo individuo);
} 

