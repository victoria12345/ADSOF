/**
* Testdel apartado opcional de la P2
* @author Victoria Pelayo e Ignacio Rabunnal
*/

import java.util.*;

public class Test {

 /**
 *Test de prueba para probar funcionalidades sobre la clase autoescuela
 */
 public static void main(String[] args) {

 	List<String> categorias = new ArrayList<String>();
 	categorias.add("A");

	Alumno a1=new Alumno("3141243T","Jose", "Jimenez",2016,10,3,"A");
	Alumno a2=new Alumno("8251262D","Sandra", "Goya",2016,22,3,"C");
	Alumno a3=new Alumno("9282258G","Carlos","Pascual",2015,2,29,"E");
	Alumno a4=new Alumno("31434423T","Jaun", "Jimenez",2016,10,3,"A");

	Fecha c1= new Fecha(1,2,3);
	Fecha c2= new Fecha(1,2,20);
	Fecha c3= new Fecha(1,2,67);
	
	Profesor p1=new Profesor("9681755T","Juan", "Jimenez",5187465,categorias,c1,c2);
	Profesor p2=new Profesor("8226871T","Maria", "Goya",518617425,categorias,c1,null);
	Profesor p3=new Profesor("6987415T","Carla","Pascual",69817286,categorias,c2,c3);

	Profesor profesores[]= new Profesor[3];
	profesores[0] = p1;
	profesores[1] = p2;

	Alumno alumnos[]= new Alumno[5];
	alumnos[0] = a1;
	alumnos[1] = a2;
	alumnos[2] = a3;

	Alumno alumnos2[] = new Alumno[4];
	alumnos2[0] = a1;
	alumnos2[1] = a4;

	Autoescuela au1 = new Autoescuela(3645,"Arenal","calle Antonio Lopez", p1, profesores,alumnos);


	//Vamos a buscar si un profesor trabaja en la autoescuela Arenal

	if(au1.profesorInAutoescuela(p1) == true){
		String cadena = "";

		cadena = cadena + "El profesor: " + p1.getNombre() + " cuyo Dni es: " + p1.getDni() + " ha trabajado en la Autoescuela Arenal "+
		" desde "+ p1.getFechaIni()+ " hasta "+ p1.getFechaFin() + "\n"; // Si la fecha fin es null significa que sigue trabajando

		System.out.println(cadena);
	}

	// Vamos a ver si todos los alumnos de la segunda cadena van a esa autoescuela


	String cadena2 = "";
	for(int i = 0; i < 4 && alumnos2[i]!= null ; i++){

		if(au1.alumnoInAutoescuela(alumnos2[i]) == true){
			
			cadena2 = cadena2 + "El alumno "+ alumnos2[i].getNombre() + " va a la autoescuela Arenal. \n";
		}else{
			cadena2 = cadena2 + "El alumno "+ alumnos2[i].getNombre() + " no va a la autoescuela Arenal. \n";
		}
	}

	System.out.println(cadena2);

	//Imprimimos todos los datos principales de la autoescuela para comprobar
	System.out.println(au1);
 }

}