package repasoGitHub;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner esc = new Scanner(System.in);
		System.out.println("Hola");
		System.out.println("Escribe tu nombre");
		String nombre = esc.next();
		saludar(nombre);
	}
	
	public static void saludar(String nombre) {
		
		System.out.println("Hola esto es un trabajo de Pablo bienvenido a cacaland Sr. " + nombre);
		
	}

}
