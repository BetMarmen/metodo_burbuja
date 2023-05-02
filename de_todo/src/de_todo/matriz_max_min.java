package de_todo;

import java.util.Scanner;

public class matriz_max_min {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*	Dada una matriz de 5x5, en donde el usuario ingrese los datos, escribir un programa 
 * que encuentre el elemento máximo y el elemento mínimo,en java*/
		 int[][] matriz = new int[5][5];
	        Scanner scan = new Scanner(System.in);

	        //Llenamos la matriz con los valores ingresados por el usuario
	        System.out.println("Ingrese los elementos de la matriz de 5x5:");
	        for(int i=0; i<5; i++) {
	            for(int j=0; j<5; j++) {
	                System.out.print("Elemento ["+i+"]["+j+"]: ");
	                matriz[i][j] = scan.nextInt();
	            }
	        }

	        //Encontramos el elemento máximo y el elemento mínimo
	        int max = matriz[0][0];
	        int min = matriz[0][0];
	        for(int i=0; i<5; i++) {
	            for(int j=0; j<5; j++) {
	                if(matriz[i][j] > max) {
	                    max = matriz[i][j];
	                }
	                if(matriz[i][j] < min) {
	                    min = matriz[i][j];
	                }
	            }
	        }

	        //Mostramos el resultado en pantalla
	        System.out.println("El elemento máximo de la matriz es: "+max);
	        System.out.println("El elemento mínimo de la matriz es: "+min);
	}

}
