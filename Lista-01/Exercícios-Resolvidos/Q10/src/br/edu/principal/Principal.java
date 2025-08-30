package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		double area, raio;
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Digite o valor do raio: ");
		raio = sc.nextDouble();
		
		area = 3.1415 * (raio * raio);
		
		System.out.println("O valor da area é: " + area);
		

	}

}
