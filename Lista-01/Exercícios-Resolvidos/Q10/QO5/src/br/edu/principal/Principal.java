package br.edu.principal;

import java.util.Scanner;

public class Principal {


	public static void main(String[] args) {
		 double salario, porcentagemSalario, aumentoSalario, novoSalario;
		 
		 Scanner sc = new Scanner(System.in);
		 
		 System.out.print("Digite o salário atual: ");
	        salario = sc.nextDouble();
	        
	     System.out.print("Digite o percentual de aumento: ");
	        porcentagemSalario = sc.nextDouble();
	        
	        aumentoSalario = salario * (porcentagemSalario / 100);
	        novoSalario = salario + aumentoSalario;
	        
	        System.out.println("Valor do aumento: R$ " + aumentoSalario);
	        System.out.println("Novo salário: R$ " + novoSalario);

	}

}
