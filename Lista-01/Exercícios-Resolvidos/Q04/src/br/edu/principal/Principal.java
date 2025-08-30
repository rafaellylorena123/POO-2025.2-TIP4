package br.edu.principal;

import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
		double salario, novoSalario;
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("digite o salário atual: ");
		salario = sc.nextDouble();
		
	    novoSalario = salario + (salario * 0.25);
		
		System.out.println("o novo salário é: " + novoSalario);
		
		 

	}

}
