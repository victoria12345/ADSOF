package algoritmo;

import inodo.terminal.*;
import inodo.funcion.*;

import java.util.*;

import Individuo.IIndividuo;
import dominio.IDominio;
import excepciones.ArgsDistintosFuncionesException;
import excepciones.CruceNuloException;

public class Algoritmo implements IAlgoritmo{
	private List<Terminal> terminales;
	private List<Function> funciones;
	private List<IIndividuo> poblacion;
	
	private int nIndividuos = 0;
	private int generacion = 0;
	

	@Override
	public void defineConjuntoTerminales(List<Terminal> terminales) {
		this.terminales = terminales;

	}
	@Override
	public void defineConjuntoFunciones(List<Function> funciones) throws ArgsDistintosFuncionesException {
		this.funciones = funciones;

	}
	@Override
	public void crearPoblacion() {


	}
	@Override
	public List<IIndividuo> cruce(IIndividuo prog1, IIndividuo prog2) throws CruceNuloException {

		return cruce(prog1, prog2);
	}
	@Override
	public void crearNuevaPoblacion() {


	}
	@Override
	public void ejecutar(IDominio dominio) {


	}
}
