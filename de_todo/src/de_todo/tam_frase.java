package de_todo;

import java.util.Scanner;

public class tam_frase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		V scan = new Scanner(System.in);

        System.out.print("Ingrese una frase: ");
        String frase = scan.nextLine();

        int tamaño = frase.length();

        System.out.println("El tamaño de la frase ingresada es: " + tamaño + " caracteres.");

	}

}
