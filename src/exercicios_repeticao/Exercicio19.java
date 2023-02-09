package exercicios_repeticao;

import java.util.Scanner;

public class Exercicio19 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite seu nome: ");
        String nome = scan.next();
        for (int i = 1; i <= 10; i++) {
            System.out.println(nome);
        }
    }
}
