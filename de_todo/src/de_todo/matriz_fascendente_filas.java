package de_todo;

import java.util.Scanner;

public class matriz_fascendente_filas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*	Dada una matriz de 5x5, en donde el usuario ingrese los datos,
 * escribir un programa que la ordene en forma ascendente (de menor a mayor) por filas,en java*/
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

	        //Ordenamos la matriz en forma ascendente por filas
	        for(int i=0; i<5; i++) {
	            for(int j=0; j<4; j++) {
	                for(int k=j+1; k<5; k++) {
	                    if(matriz[i][j] > matriz[i][k]) {
	                        int temp = matriz[i][j];
	                        matriz[i][j] = matriz[i][k];
	                        matriz[i][k] = temp;
	                    }
	                }
	            }
	        }

	        //Mostramos la matriz ordenada en pantalla
	        System.out.println("La matriz ordenada en forma ascendente por filas es:");
	        for(int i=0; i<5; i++) {
	            for(int j=0; j<5; j++) {
	                System.out.print(matriz[i][j] + " ");
	            }
	            System.out.println();
	        }
	}

}
