package algoritmo;

import inodo.terminal.*;
import excepciones.*;
import Individuo.*;
import dominio.*;
import inodo.funcion.*;
import java.util.*;

public interface IAlgoritmo {
	public void defineConjuntoTerminales(List<Terminal> terminales);
	public void defineConjuntoFunciones(List<Function> funciones) throws ArgsDistintosFuncionesException;
	public void crearPoblacion();
	public List<IIndividuo> cruce(IIndividuo prog1, IIndividuo prog2) throws CruceNuloException;
	public void crearNuevaPoblacion();
	public void ejecutar(IDominio dominio);
} 
