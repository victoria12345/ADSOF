package inodo;
import java.util.*;

public interface INodo {
	public String getRaiz();
	public List<INodo> getDescendientes();
	public void incluirDescendiente(INodo nodo);
	public double calcular();
	public INodo copy();
	public void setDescendientes(List<INodo> desc);
	public void setPadre(INodo nodo); 
	public INodo getPadre();
	public void setEtiqueta(int etiqueta);
	public int getEtiqueta();
}
