package de_todo;

import java.util.Scanner;

public class operadores_caracteres {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scan = new Scanner(System.in);

	        System.out.print("Ingrese el primer número: ");
	        double num1 = scan.nextDouble();

	        System.out.print("Ingrese el segundo número: ");
	        double num2 = scan.nextDouble();

	        System.out.print("Ingrese la operación (+, -, *, /): ");
	        char operador = scan.next().charAt(0);

	        double resultado;

	        switch(operador) {
	            case '+':
	                resultado = num1 + num2;
	                System.out.println(num1 + " + " + num2 + " = " + resultado);
	                break;
	            case '-':
	                resultado = num1 - num2;
	                System.out.println(num1 + " - " + num2 + " = " + resultado);
	                break;
	            case '*':
	                resultado = num1 * num2;
	                System.out.println(num1 + " * " + num2 + " = " + resultado);
	                break;
	            case '/':
	                if(num2 == 0) {
	                    System.out.println("No se puede dividir por cero.");
	                } else {
	                    resultado = num1 / num2;
	                    System.out.println(num1 + " / " + num2 + " = " + resultado);
	                }
	                break;
	            default:
	                System.out.println("Operación no válida.");
	        }
	}

}
