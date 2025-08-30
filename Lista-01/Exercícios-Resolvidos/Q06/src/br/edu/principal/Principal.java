package br.edu.principal;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		double salarioBase, gratificacao, imposto, novoSalario;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o salário base: ");
        salarioBase = sc.nextDouble();

        gratificacao = salarioBase * 0.05;
        imposto = salarioBase * 0.07;

        novoSalario = salarioBase + gratificacao - imposto;

        System.out.println("Gratificação: " + gratificacao);
        System.out.println("Imposto: " + imposto);
        System.out.println("Novo Salário: " + novoSalario);

	}

}
