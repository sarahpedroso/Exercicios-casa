package exercicios_repeticao;

import java.util.Scanner;

public class Exercicio31 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numero = 0;
        int soma = 0;
        do {
            soma = soma + numero;
            System.out.println("Numero: ");
            numero = scan.nextInt();
        } while (numero >= 0);
        System.out.println(soma);
    }
}
