package exercicios_repeticao;

import java.util.Scanner;

public class Exercicio20 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Nome: ");
        String nome = scan.next();
        System.out.println("Número: ");
        String numero = scan.next();
        for (int i = 1; i <= 2; i++) {
            System.out.println(nome + " - " + numero);
        }
    }
}
