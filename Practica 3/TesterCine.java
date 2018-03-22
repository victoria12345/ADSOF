/**
* Test para probar la clase cine
* Dado que cine llama a funciones del resto de clases
* directa o indirectamente, este test servirá como prueba de integracion
* @author Victoria Pelayo e Ignacio Rabunnal
*/

public class TesterCine{

	/**
	* main para probar la clase cine
	* iremos mdificando sius atributos utilizando funciones suyas
	* e iremos comprobando su funcionamiento. 
	* A su vez se comprueba como trabajan todos los modulos juntos
	* @author Victoria Pelayo e Ignacio Rabunnal
	*/
	public static void main(String[] args) {
		Pelicula p1 = new Pelicula("titulo", "director", 1960, "sinopsis", Genero.DRAMA);
		Pelicula p2 = new Pelicula("titulo2", "director2", 1960, "sinopsis2", Genero.DRAMA);
		Fecha f = new Fecha(05,10,2011);
		Fecha f2 = new Fecha(25,10,2011);
		Sesion s1 = new Sesion(f,p1,10);
		Sesion s2 = new Sesion(f2,p1,10);
		Sala sal1 = new Sala(1,5);
		Sala sal2 = new Sala(2, 30);
		Sala sal3 = new Sala(3, 30);

		Cine c = new Cine("Cine Victoria", "Calle ola");

		System.out.println("Estado inicial: \n" + c);
	
		//Probamos a eliminar pelicula y sala cuando esta vacio
		c.removeSala(sal1);
		c.removePeliculaCartelera(p1);

		//Añadimos dos peliculas y dos salas
		c.addPelicula(p1);
		c.addPelicula(p2);
		c.addSala(sal1);
		c.addSala(sal2);
		System.out.println("\nEstado 1: \n" + c);

		//Probamos a introducir una sala y una pelicula que ya estaban
		c.addPelicula(p2);
		c.addSala(sal1);
		System.out.println("Salas: " + c.getSalas() + "\nPeliculas: "+ c.getPeliculas());
		//Comprobamos que no se han añadido

		System.out.println("\n-------------------------------------------------\n");

		//Probamos a añadir sesion en una sala que no existe
		if(c.addSesion(s1,sal3) == false){
			System.out.println("\n\tSe pasa el primer test de añadir sesion");
		}
		//Añadimos sesion a una sala que existe
		if(c.addSesion(s1,sal1) == true){
			System.out.println("\n\tSe pasa el segundo test de añadir sesion");
		}

		//Eliminamos la sala 1
		if(c.removeSala(sal1) == true){
			System.out.println("\n\tSe eliminan salas correctamente(1)");
		}

		//Eliminamos sala que no pertenece al cine
		if(c.removeSala(sal3) == false){
			System.out.println("\n\tSe elimina salas correctamente(2)");
		}

		c.addSesion(s1,sal2);
		if(c.delSesion(s1) == true){
			System.out.println("\n\tSe eliminan sesiones correctamente");
		}
		//Ya no pertenece al cine
		if(c.delSesion(s1) == false){
			System.out.println("\n\tSe eliminan sesiones correctamente");
		}

		System.out.println("\n-------------------------------------------------\n");

		//Imprimimos para saber como esta el cine en ese momento
		System.out.println("\nEstado2: "+ c);

		//Probamos a borrar pelicula sin estar en ninguna sesion, pero si en la lista
		if(c.removePeliculaCartelera(p1)== true){
			System.out.println("\n\tprueba 1 borrar peliculas pasada")	;
		}

		//Ahora sin estar ni en sesiones ni en la lista
		if(c.removePeliculaCartelera(p1)== false){
			System.out.println("\n\tprueba 1 borrar peliculas pasada")	;
		}

		//Añadimos una sesion con pelicula y borramos esa pelicula
		c.addSesion(s1,sal2);
		System.out.println("\nSalas(1): "+ c.getSalas());
		System.out.println("\nPeliculas(1): "+ c.getPeliculas());

		c.removePeliculaCartelera(p1);
		//Comprobamos si se ha borrado la sesion tambien
		System.out.println("\nSalas(2): "+ c.getSalas());
		System.out.println("\n Peliculas(2): "+ c.getPeliculas());

		System.out.println("\n-------------------------------------------------\n");

		System.out.println("\nEstado 3 : "+  c);

		//Comprobamos las ventas de entradas

		if(c.comprarEntrada(10,Dia.MIERCOLES, "hola") == null){
			System.out.println("\n\tPrueba 1 venta de entradas superada");
		}

		c.addSesion(s1,sal2);
		if(c.comprarEntrada(10,Dia.MIERCOLES, "titulo") == s1){
			System.out.println("\n\tPrueba 2 venta de entradas superada");
		}
		//Sabemos que es la sesion 1 porque se cumple el anterior if
		// por eso lo escribo directamente, porque la funcion funciona correctamente
		System.out.println("\n Informacion sobre la sesion de la entrada vendida: " + s1);

		if(c.comprarEntrada(10,Dia.LUNES, "titulo") == s1){
			System.out.println("\n\tPrueba 2 venta de entradas superada");
		}

		//Comprobamos que estan las dos entradas vendidas
		System.out.println("\nEntradas: " + c.getEntradas());

		//Calculamos la ganancia
		System.out.println("\nGanancia: "+ c.getBeneficios());

		//Se quieren eliminar todas las entradas, salas y peliculas
		c.borrarEntradas();
		c.borrarPeliculas();
		c.borrarSalas();
		System.out.println("\n-------------------------------------------------\n");
		System.out.println("Estado final: " + c);
	}
}