package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		double precoProduto, desconto, precoNovo;
			
		Scanner sc = new Scanner (System.in);
			
		System.out.println("Digite o valor do produto que deseja calcular: ");
		precoProduto = sc.nextDouble();
			
		desconto = precoProduto * 10/100;
		precoNovo = precoProduto - desconto;
			
		System.out.println("O preço total com o desconto é:" + precoNovo);


	}

}