package exercicios_ifElse_switchCase;

import java.util.Scanner;

public class Exercicio12 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Sexo: ");
        String sexo = scan.next();
        System.out.println("Altura: ");
        double altura = scan.nextDouble();
        if (sexo == "feminino") {
            System.out.println("Seu peso ideal é: " + ((altura * 62.1) - 44.7));
        } else {
            System.out.println("Seu peso ideal é: " + ((altura * 72.7) - 58));
        }
    }
}
