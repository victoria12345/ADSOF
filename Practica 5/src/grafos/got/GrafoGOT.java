package grafos.got;

import grafos.GrafoNoDirigido;
import grafos.Vertice;

import java.io.*;
import java.util.List;
import java.util.stream.Collectors;

public class GrafoGOT extends GrafoNoDirigido<Persona>{

	/**
	 * Constructor del grafo de got
	 * @param ficheroVertices fchero donde estan los vertices
	 * @param ficheroArcos fichero donde estan los arcos
	 * @throws Exception excepcion que se lanza 
	 */
	public GrafoGOT(String ficheroVertices, String ficheroArcos) throws Exception { 
		BufferedReader buffer = new BufferedReader(new InputStreamReader(new FileInputStream(ficheroVertices)));
		
		String linea;
		
		while((linea = buffer.readLine()) != null){
			String trozos[] = linea.split(",");
			String nombre;
			String casa;
			int id;
			
			nombre = trozos[1];
			casa = trozos[2];
			id = Integer.parseInt(trozos[0]);
	
			this.addVertice(id,new Persona(nombre, casa));
		}
		buffer.close();
		
		buffer = new BufferedReader(new InputStreamReader(new FileInputStream(ficheroArcos)));
		
		while((linea = buffer.readLine()) != null){
			String trozos[] = linea.split(",");
			int id1 = Integer.parseInt(trozos[0]);
			int id2 = Integer.parseInt(trozos[1]);
			double peso = Double.parseDouble(trozos[2]);
			Vertice<Persona> v1 = vertices.get(id1);
			Vertice<Persona> v2 = vertices.get(id2);
			
			this.addArco(v1, v2, peso);	
		}
		buffer.close();
	}
	
	/**
	 * Devuelve un vertice del grafo con un nombre
	 * @param nombre nombre de la persona de got
	 * @return vertice correspondiente o null si no esta
	 */
	public Vertice<Persona> getVertice(String nombre){
		List<Vertice<Persona>> personas;
		
		personas =  getVertices().stream().filter(v->v.getDatos().getNombre().equals(nombre)).collect(Collectors.toList());
		
		if(personas.isEmpty() == true) {
			return null;
		}
		
		return personas.get(0);
	}
	
	/**
	 * @return lista del nombre de las casas ordenadas
	 */
	public List<String> casas(){
		//M HE QUEDADO AQUI
		return null;
	}
	
}
