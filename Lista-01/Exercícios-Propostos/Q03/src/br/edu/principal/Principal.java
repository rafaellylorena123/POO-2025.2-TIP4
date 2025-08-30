package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
	
		double n1,n2,resultado;
		
		 Scanner sc = new Scanner (System.in);
	        
	     System.out.print("Digite o primeiro número: ");
	     n1 = sc.nextDouble();
	        
	     System.out.print("Digite o segundo número: ");
	     n2 = sc.nextDouble();
	        
	     resultado = n1 / n2;
	        
	     System.out.println("O resultado da divisão de " + n1 + " por " + n2 + " é: " + resultado);
	        
	}

}