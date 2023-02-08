package exercicios_ifElse_switchCase;

import java.util.Scanner;

public class Exercicio14 {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        System.out.println("Primeiro valor: ");
        int n1 = scan.nextInt();
        System.out.println("Segundo valor: ");
        int n2 = scan.nextInt();
        System.out.println("Terceiro valor: ");
        int n3 = scan.nextInt();
        if (n1 > n2 && n1 > n3) {
            System.out.println("Maior número: " + n1);
        } else if (n2 > n1 && n2 > n3) {
            System.out.println("Maior número: " + n2);
        } else {
            System.out.println("Maior número: " + n3);
        }
    }
}
