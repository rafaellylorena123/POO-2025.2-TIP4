package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
			
		double n1,n2,n3,peso1,peso2,peso3,mediap ;
		Scanner sc = new Scanner (System.in);
			
		System.out.println("Digite nota 1: ");
		n1= sc.nextDouble();
		System.out.println("Digite o peso da nota 1: ");
		peso1= sc.nextDouble();
		
		System.out.println("Digite uma nota 2: ");
		n2= sc.nextDouble();
		System.out.println("Digite o peso da nota 2: ");
		peso2= sc.nextDouble();
				
				
		System.out.println("Digite nota 3: ");			
		n3= sc.nextDouble();
		System.out.println("Digite o peso da nota 3: ");
		peso3= sc.nextDouble();
		
		mediap = (n1 * peso1 + n2 * peso2 + n3 * peso3) / (peso1 + peso2 + peso3);
		System.out.println("A média é: " + mediap);
	}

}