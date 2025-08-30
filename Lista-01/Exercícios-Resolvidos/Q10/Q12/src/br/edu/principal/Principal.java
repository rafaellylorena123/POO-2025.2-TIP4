package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		/*DECLARE num1, num2, r1, r2 NUMÉRICO
LEIA num1, num2
r1 ← num1num2
r2 ← num2num1
ESCREVA r1, r2*/
		
		Scanner sc = new Scanner(System.in);
		int num1, num2, r1, r2;
		System.out.println("Digite um numero: ");
		num1 = sc.nextInt();
		System.out.println("Digite um outro numero: ");
		num2 = sc.nextInt();
		r1 = (int) Math.pow(num1, num2);
		r2 = (int) Math.pow(num2, num1);
		System.out.print("o resultado dessa equção é:" + r1 + " "+r2);
	}

}
