package exercicios_repeticao;

import java.util.Scanner;

public class Exercicio23 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int soma = 0;
        for (int i = 1; i <= 20; i++) {
            System.out.println("Idade: ");
            int idade = scan.nextInt();
            soma = soma + idade;
        }
        double media = soma / 20;
        System.out.println("Media: " + media);
    }
}
