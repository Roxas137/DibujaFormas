package main;

import formas.*;

public class Main {

	public static void main(String[] args) {

		//Creacion de la forma principal
		FormaComponent formaPrin = new Forma("Principal");
		formaPrin.anade(new Rectangulo(10,10,20,20));
		formaPrin.anade(new Circulo(10,10,20));
		
		//Creacion de la forma interior
		FormaComponent formaInt = new Forma("Interior");
		FormaComponent r1 = new Rectangulo(2, 2, 3, 3);
		FormaComponent r2 = new Rectangulo(3, 3, 4, 4);
		formaInt.anade(r1);
		formaInt.anade(r2);
		formaInt.anade(new Circulo(1, 1, 20));
		
		//Se añade la forma interior a la forma principal
		formaPrin.anade(formaInt);
		
		//Mostramos en pantalla la posicion inicial
		System.out.println("-------------------------\n");
		System.out.println("Dibujo inicial: \n");
		System.out.println("-------------------------\n");
		formaPrin.dibuja();
		
		//Desplazamos y mostramos el resultado
		System.out.println("\n-------------------------\n");
		System.out.println("Dibujo tras desplazar: \n");
		System.out.println("-------------------------\n");
		formaPrin.desplazaRelativo(100, 100);
		formaPrin.dibuja();
		
		//Mostramos el dibujo despues de eliminar los rectangulos de formaInt
		System.out.println("\n-------------------------\n");
		System.out.println("Dibujo tras eliminar: \n");
		System.out.println("-------------------------\n");
		formaInt.elimina(r1);
		formaInt.elimina(r2);
		formaPrin.dibuja();
		
		
		System.out.println("Prueba finalizada");
		System.exit(0);
		
	}

}
