package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		double base, altura, area;
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Digite o valor da base: ");
		base = sc.nextDouble();
		
		System.out.println("Digite o valor da altura: ");
		altura = sc.nextDouble();
		
		area = base * altura/2;
		
		System.out.println("O valor da área é: " + area);

	}

}
