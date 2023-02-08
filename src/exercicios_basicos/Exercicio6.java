package exercicios_basicos;

import java.util.Scanner;
public class Exercicio6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int numero = scan.nextInt();
        System.out.println("Seu antecessor é: " + (numero-1));
        System.out.println("Seu sucessor é: " + (numero+1));
    }
}
