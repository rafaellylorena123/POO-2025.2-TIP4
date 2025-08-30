package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		double deposito, taxa, rendimento, total;
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Digite o valor do depósito: ");
		deposito = sc.nextDouble();
		
		System.out.println("Digite o valor da taxa de juros: ");
		taxa = sc.nextDouble();
		
		rendimento = deposito * taxa/100;
		total = deposito + rendimento;
		
		System.out.println("O valor do rendimento é: " + rendimento);
		System.out.println("O valor total é: " + total);

	}

}
