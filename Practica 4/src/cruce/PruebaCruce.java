package cruce;

import java.util.*;
import Individuo.*;
import excepciones.CruceNuloException;
import inodo.*;

public class PruebaCruce {
	public List<IIndividuo> cruce(IIndividuo i1, IIndividuo i2) throws CruceNuloException{
		List<IIndividuo> individuos = new ArrayList<>();
		List<INodo> nodos1 = ((Individuo) i1).getEtiquetados();
		List<INodo> nodos2 = ((Individuo) i2).getEtiquetados();
		IIndividuo ii1, ii2;
		INodo aux1, aux2;
		
		int a1 = 7, a2 = 3;
		
		if(a1 == 1 && a2 == 1) {
			throw new CruceNuloException();
		}
		
		aux1 = nodos1.get(a1 -1);
		aux2 = nodos2.get(a2-2);
		swap(aux1, aux2);
				
		ii1 = new Individuo();
		ii1.setExpresion(nodos1.get(0));
		individuos.add(ii1);
		
		ii2 = new Individuo();
		ii2.setExpresion(nodos2.get(0));
		individuos.add(ii2);
		
		return individuos;
	}
	
	
	
	private void swap( INodo n1, INodo n2) {
		INodo aux;
		aux = n2; 
		n2 = n1;
		n1 = aux;
	}
}
