package exercicios_repeticao;

import java.util.Scanner;

public class Exercicio21 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int soma = 0;
        for (int i = 1; i <= 10; i++) {
            System.out.println("Digite um numero: ");
            int n = scan.nextInt();
            soma = soma + n;
        }

        System.out.println("Soma: "+ soma);
    }
}
