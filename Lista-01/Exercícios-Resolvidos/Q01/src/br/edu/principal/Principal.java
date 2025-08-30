package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		int n1,n2,n3,n4;
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Digite um número inteiro: ");
		n1= sc.nextInt();
		
		System.out.println("Digite um número inteiro: ");
		n2= sc.nextInt();
		
		System.out.println("Digite um número inteiro: ");
		n3= sc.nextInt();
		
		System.out.println("Digite um número inteiro: ");
		n4= sc.nextInt();
		
		System.out.println("O resltado da soma é: " + (n1+n2+n3+n4));
	}


}