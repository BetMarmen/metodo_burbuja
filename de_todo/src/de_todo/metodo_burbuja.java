package de_todo;

import java.util.Arrays;
import java.util.Scanner;

public class metodo_burbuja {

	public static void main(String[] args) {
		// TODO Auto-generated method 
		 Scanner scan = new Scanner(System.in);
	        int[] arr = new int[10];

	        System.out.println("Ingrese 10 números:");
	        for (int i = 0; i < 10; i++) {
	            arr[i] = scan.nextInt();
	        }

	        // Ordenamiento ascendente
	        for (int i = 0; i < arr.length - 1; i++) {
	            for (int j = 0; j < arr.length - i - 1; j++) {
	                if (arr[j] > arr[j + 1]) {
	                    int temp = arr[j];
	                    arr[j] = arr[j + 1];
	                    arr[j + 1] = temp;
	                }
	            }
	        }

	        System.out.println("Vector ordenado de forma ascendente:");
	        
	          System.out.println(Arrays.toString(arr));
	        
	        System.out.println();

	        // Ordenamiento descendente
	        for (int i = 0; i < arr.length - 1; i++) {
	            for (int j = 0; j < arr.length - i - 1; j++) {
	                if (arr[j] < arr[j + 1]) {
	                    int temp = arr[j];
	                    arr[j] = arr[j + 1];
	                    arr[j + 1] = temp;
	                }
	            }
	        }

	        System.out.println("Vector ordenado de forma descendente:");
	      
	           System.out.println(Arrays.toString(arr));
	        
	        System.out.println();

	        scan.close();

	}

}
