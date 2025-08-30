package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		double salario, salreceber, imposto;
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Digite o valor do seu salário: ");
		salario = sc.nextDouble();
		
		imposto = salario * 10/100;
		salreceber = salario + 50 - imposto;
		
		System.out.println("O salario é: " + salreceber);

	}

}
