package de_todo;

import java.util.Scanner;

public class matriz_multi_3x3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*Crear un programa que multiplique dos matrices de 3x3,con datos ingresados por el usuario en java*/
		int[][] matriz1 = new int[3][3];
        int[][] matriz2 = new int[3][3];
        int[][] resultado = new int[3][3];

        Scanner sc = new Scanner(System.in);

        //Llenamos la primera matriz con los valores ingresados por el usuario
        System.out.println("Ingrese los elementos de la primera matriz de 3x3:");
        for(int i=0; i<3; i++) {
            for(int j=0; j<3; j++) {
                System.out.print("Elemento ["+i+"]["+j+"]: ");
                matriz1[i][j] = sc.nextInt();
            }
        }

        //Llenamos la segunda matriz con los valores ingresados por el usuario
        System.out.println("Ingrese los elementos de la segunda matriz de 3x3:");
        for(int i=0; i<3; i++) {
            for(int j=0; j<3; j++) {
                System.out.print("Elemento ["+i+"]["+j+"]: ");
                matriz2[i][j] = sc.nextInt();
            }
        }

        //Multiplicamos las dos matrices
        for(int i=0; i<3; i++) {
            for(int j=0; j<3; j++) {
                for(int k=0; k<3; k++) {
                    resultado[i][j] += matriz1[i][k] * matriz2[k][j];
                }
            }
        }

        //Mostramos el resultado de la multiplicación en pantalla
        System.out.println("El resultado de la multiplicación de las dos matrices es:");
        for(int i=0; i<3; i++) {
            for(int j=0; j<3; j++) {
                System.out.print(resultado[i][j] + " ");
            }
            System.out.println();
        }

	}

}
