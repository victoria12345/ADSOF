package grafos;

import java.util.*;

public class GrafoNoDirigido<T> extends Grafo<T>{

	/**
	 * Annade un arco al grafo
	 * @param v1 primer extremo del arco
	 * @param v2 segundo extremo
	 * @param peso peso del arco
	 */
	public void addArco(Vertice<T>v1, Vertice<T>v2, double peso) {
		if(existeArco(v1,v2) == true) {
			double aux = aristas.get(Arrays.asList(v1,v2));
			aristas.put(Arrays.asList(v1,v2), aux + peso);
		}else if(existeArco(v2,v1) == true) {
			double aux = aristas.get(Arrays.asList(v2,v1));
			aristas.put(Arrays.asList(v2,v1), aux + peso);
		}else {
			this.nAristas++;
			aristas.put(Arrays.asList(v1, v2),peso);
		}
		
	}

	/**
	 * Devuelve el peso de un arco
	 * @param v1 primer vertice del arco
	 * @param v2 segundo vertice de arco
	 * @return peso del arco, 0 en caso de error
	 */
	public double getPesoDe(Vertice<T> v1, Vertice<T> v2) {
		if(existeArco(v1,v2) == true) {
			return aristas.get(Arrays.asList(v1,v2));
		}else if(existeArco(v2,v1) == true) {
			return aristas.get(Arrays.asList(v2,v1));
		}else {
			return 0;
		}
	}

	/**
	 * Devuelve los verticesque tienen un arco con v
	 * @param v vertice origen o destino
	 * @return lista de vertices o null en caso de error
	 */
	public List<Vertice<T>> getVecinosDe(Vertice<T> v) {
		if(v == null) {
			return null;
		}
		
		List<Vertice<T>> vecinos = new ArrayList<>();
		
		for(Vertice<T> tmp: this.getVertices()) {
			if(this.existeArco(v,tmp) == true || this.existeArco(tmp,v) == true) {
				vecinos.add(tmp);
			}
		}
		return vecinos;
	}
}
