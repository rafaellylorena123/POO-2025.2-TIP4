package br.edu.principal;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Digite o primeiro número: ");
        double num1 = input.nextDouble();

        System.out.print("Digite o segundo número: ");
        double num2 = input.nextDouble();

        System.out.print("Digite o terceiro número: ");
        double num3 = input.nextDouble();

        double multiplicacao = num1 * num2 * num3;
        System.out.println("A multiplicação dos três números é: " + multiplicacao);

    }
}