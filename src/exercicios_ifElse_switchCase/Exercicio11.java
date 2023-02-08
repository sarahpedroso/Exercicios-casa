package exercicios_ifElse_switchCase;

import java.util.Scanner;

public class Exercicio11 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o primeiro valor: ");
        int n1 = scan.nextInt();
        System.out.println("Digite o segundo valor: ");
        int n2 = scan.nextInt();
        System.out.println("Digite o terceiro valor: ");
        int n3 = scan.nextInt();

        // N1 sendo o menor numero
        if (n1 < n2 && n1 < n3) {
            if (n2 < n3) {
                System.out.println(n1 + ", " + n2 + ", " + n3);
            } else {
                System.out.println(n1 + ", " + n3 + ", " + n2);
            }
        }
        // N2 sendo o menor numero
        if (n2 < n1 && n2 < n3) {
            // se o n1 for o maior
            if (n1 > n3) {
                System.out.println(n2 + ", " + n3 + ", " + n1);
            } else {
                System.out.println(n2 + ", " + n1 + ", " + n3);
            }
        }
        // N3 sendo o menor numero
        if (n3 < n1 && n3 < n2) {
            // se o n1 for o maior
            if (n1 > n2) {
                System.out.println(n3 + ", " + n2 + ", " + n1);
            } else {
                System.out.println(n3 + ", " + n1 + ", " + n2);
            }
        }
    }
}
