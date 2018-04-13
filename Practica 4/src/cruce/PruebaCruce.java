package cruce;

import java.util.*;
import Individuo.*;
import excepciones.CruceNuloException;
import inodo.*;

public class PruebaCruce {
	public List<IIndividuo> cruce(IIndividuo i1, IIndividuo i2) throws CruceNuloException {
		List<IIndividuo> individuos = new ArrayList<>();
		IIndividuo ii1 = i1.copy(), ii2 = i2.copy();
		List<INodo> nodos1 = ((Individuo) i1).getEtiquetados();
		List<INodo> nodos2 = ((Individuo) i2).getEtiquetados();
		INodo aux1, aux2,tmp1, tmp2, raiz1, raiz2, padre1, padre2;
		
		int a1 = (int) (Math.random()*nodos1.size() + 1), a2 = (int) (Math.random()*nodos2.size() + 1);
		
		System.out.println("\nPunto de cruce del progenitor 1: "+ a1);
		System.out.println("Punto de cruce del progenitor 2: "+ a2);
		
		if(a1 == 1 && a2 == 1) {
			throw new CruceNuloException();
		}
		aux1 = nodos1.get(a1 -1).copy();
		aux2 = nodos2.get(a2 -1).copy();

		raiz1 = nodos1.get(0).copy();
		raiz2 = nodos2.get(0).copy();

		padre2 = buscar(aux2.getPadre().getEtiqueta(), raiz2);
		padre1 = buscar(aux1.getPadre().getEtiqueta(), raiz1);
		
		
		
		if(padre1.getDescendientes().get(0).getEtiqueta() == a1) {
			tmp1 = padre1.getDescendientes().get(1);
			padre1.setDescendientes(new ArrayList<INodo>());
			padre1.incluirDescendiente(aux2.copy());
			padre1.incluirDescendiente(tmp1.copy());
		}else {
			tmp1 = padre1.getDescendientes().get(0);
			padre1.setDescendientes(new ArrayList<INodo>());
			padre1.incluirDescendiente(tmp1.copy());
			padre1.incluirDescendiente(aux2.copy());
		}

		padre2 = buscar(aux2.getPadre().getEtiqueta(), raiz2);
		
		if(padre2.getDescendientes().get(0).getEtiqueta() == a2) {
			tmp2 = padre2.getDescendientes().get(1);
			padre2.setDescendientes(new ArrayList<INodo>());
			padre2.incluirDescendiente(aux1.copy());
			padre2.incluirDescendiente(tmp2.copy());
		}else {
			tmp2 = padre2.getDescendientes().get(0);
			padre2.setDescendientes(new ArrayList<INodo>());
			padre2.incluirDescendiente(tmp2.copy());
			padre2.incluirDescendiente(aux1.copy());
		}
		
		ii1 = new Individuo();
		ii1.setExpresion(raiz1);
		individuos.add(ii1);
		
		ii2 = new Individuo();
		ii2.setExpresion(raiz2);
		individuos.add(ii2);
		
		return individuos;
	}
	
	private INodo buscar(int etiqueta, INodo raiz) {
		INodo tmp;
		if(raiz.getEtiqueta() == etiqueta) {
			return raiz;
		}
		
		if(raiz.getDescendientes().size()== 0) {
			return null;
		}
		
			
		tmp = buscar(etiqueta, raiz.getDescendientes().get(0));
		if(tmp != null) {
			return tmp;
		}
		
		tmp = buscar(etiqueta, raiz.getDescendientes().get(1));
		if(tmp != null) {
			return tmp;
		}
		
		return null;
			
	}
	
	
}
