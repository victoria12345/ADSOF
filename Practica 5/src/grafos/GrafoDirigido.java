package grafos;


import java.util.*;

public class GrafoDirigido<T> extends Grafo<T>{
	/**
	 * Constructor de un grafo dirigido
	 */
	public GrafoDirigido(){
		super();
	}

	@Override
	/**
	 * Annade un arco al grafo
	 * @param v1 primer extremo del arco
	 * @param v2 segundo extremo
	 * @param peso peso del arco
	 */
	public void addArco(Vertice<T> v1, Vertice<T> v2, double peso) {
		if(this.existeArco(v1, v2) == true) {
			double aux = aristas.get(Arrays.asList(v1,v2));
			aristas.put(Arrays.asList(v1,v2), aux + peso);
		}else {
			aristas.put(Arrays.asList(v1,v2), peso);
			this.nAristas++;
		}
		
	}

	@Override
	/**
	 * Devuelve el peso de un arco
	 * @param v1 primer vertice del arco
	 * @param v2 segundo vertice de arco
	 * @return peso del arco, 0 en caso de error
	 *
	 */
	public double getPesoDe(Vertice<T> v1, Vertice<T> v2) {
		if(v1 == null || v2 == null || existeArco(v1,v2) == false) {
			return 0;
		}
		return aristas.get(Arrays.asList(v1,v2));
	}

	@Override
	/**
	 * Devuelve los verticesque tienen un arco con v
	 * @param v vertice origen de las aristas
	 * @return lista de vertices o null en caso de error
	 */
	public List<Vertice<T>> getVecinosDe(Vertice<T> v) {
		if(v == null) {
			return null;
		}
		
		List<Vertice<T>> vecinos = new ArrayList<>();
		
		for(Vertice<T> tmp: this.getVertices()) {
			if(this.existeArco(v,tmp) == true) {
				vecinos.add(tmp);
			}
		}
		return vecinos;
	}
}
