package de_todo;

import java.util.Scanner;

public class sum_fil_sum_col {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*	Dada una matriz de 4x4, con datos ingresados por el usuario,escribir un programa
 * que calcule la suma de cada fila y la suma de cada columna,en java*/
		 int[][] matriz = new int[4][4];
	        Scanner scan = new Scanner(System.in);

	        //Llenamos la matriz con los valores ingresados por el usuario
	        System.out.println("Ingrese los elementos de la matriz de 4x4:");
	        for(int i=0; i<4; i++) {
	            for(int j=0; j<4; j++) {
	                System.out.print("Elemento ["+i+"]["+j+"]: ");
	                matriz[i][j] = scan.nextInt();
	            }
	        }

	        //Calculamos la suma de cada fila
	        int[] sumaFila = new int[4];
	        for(int i=0; i<4; i++) {
	            for(int j=0; j<4; j++) {
	                sumaFila[i] += matriz[i][j];
	            }
	        }

	        //Calculamos la suma de cada columna
	        int[] sumaColumna = new int[4];
	        for(int j=0; j<4; j++) {
	            for(int i=0; i<4; i++) {
	                sumaColumna[j] += matriz[i][j];
	            }
	        }

	        //Mostramos la suma de cada fila y cada columna en pantalla
	        System.out.println("La suma de cada fila es:");
	        for(int i=0; i<4; i++) {
	            System.out.println("Fila "+i+": "+sumaFila[i]);
	        }
	        System.out.println();

	        System.out.println("La suma de cada columna es:");
	        for(int j=0; j<4; j++) {
	            System.out.println("Columna "+j+": "+sumaColumna[j]);
	        }
	}

}
