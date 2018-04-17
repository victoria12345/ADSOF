package inodo;
import java.util.*;

/**
 * Descripcion de la interfaz INodo
 *
 *@author Victoria Pelayo e Ignacio Rabunnal
 */
public interface INodo {
	/**
	 * @return cadena de caracteres que es la raiz
	 */
	public String getRaiz();
	
	/**
	 * @return lista de los descendientes de un INodo
	 */
	public List<INodo> getDescendientes();
	
	/**
	 * annade un descendiente a un INodo
	 * @param nodo nuevo descendiente
	 */
	public void incluirDescendiente(INodo nodo);
	
	/**
	 * @return valor de un INodo
	 */
	public double calcular();
	
	/**
	 * @return copia de un INodo
	 */
	public INodo copy();
	
	/**
	 * Cambia los descendientes de un INodo
	 * @param desc lista con los nuevos descendientes de un INodo
	 */
	public void setDescendientes(List<INodo> desc);
	
	/**
	 * Cambia el padre de un INodo
	 * @param nodo nuevo nodo padre
	 */
	public void setPadre(INodo nodo); 
	
	/**
	 * Devuelve el nodo padre de un INodo
	 * @return INodo que es el padre del Inodo
	 */
	public INodo getPadre();
	
	/**
	 * Cambia la etiqueta de un INodo
	 * @param etiqueta entero que sera la nueva etiqueta
	 */
	public void setEtiqueta(int etiqueta);
	
	/**
	 * @return la etiqueta de un INodo
	 */
	public int getEtiqueta();
}
