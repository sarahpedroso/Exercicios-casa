package exercicios_basicos;

import java.util.Scanner;
public class Exercicio7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite seu ano de nascimento: ");
        int anoNascimento = scan.nextInt();
        if (anoNascimento <= 2004) {
            System.out.println("Você poderá votar neste ano!");
        } else {
            System.out.println("Você ainda não completou 18 anos e não poderá votar neste ano.");
        }

    }
}
