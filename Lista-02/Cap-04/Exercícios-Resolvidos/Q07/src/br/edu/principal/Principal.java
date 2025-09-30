package br.edu.principal;

import java.util.Scanner;

public class Principal {

    public static double calcula_media(double n1, double n2, double n3, char letra) {
        double media = 0;
        
        if (letra == 'A') {
            media = (n1 + n2 + n3) / 3.0;
        } else if (letra == 'P') {
            media = (n1 * 5 + n2 * 3 + n3 * 2) / (5 + 3 + 2);
        }
        
        return media;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double nota1, nota2, nota3, m;
        char letra;
        String entrada;

        System.out.print("Digite a primeira nota: ");
        nota1 = scanner.nextDouble();
        
        System.out.print("Digite a segunda nota: ");
        nota2 = scanner.nextDouble();
        
        System.out.print("Digite a terceira nota: ");
        nota3 = scanner.nextDouble();

        do {
            System.out.print("Digite 'A' para média aritmética ou 'P' para média ponderada: ");
            entrada = scanner.next();
            letra = entrada.charAt(0);
        } while (letra != 'A' && letra != 'P');

        m = calcula_media(nota1, nota2, nota3, letra);

        if (letra == 'A') {
            System.out.println("A média aritmética é: " + m);
        } else {
            System.out.println("A média ponderada é: " + m);
        }

    }
}