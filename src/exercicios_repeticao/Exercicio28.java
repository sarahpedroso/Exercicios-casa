package exercicios_repeticao;

import java.util.Scanner;

public class Exercicio28 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int quantNumeros = 5;
        int quantPares = 0;
        int contador = 0;
        do {
            System.out.println("Número: ");
            int numero = scan.nextInt();
            // % significa resto da divisão, ou seja, 8/2 = 4, sendo assim % 0 (não sobra resto).
            if (numero % 2 == 0) {
                quantPares++;
            }
            contador++;
        } while (contador < quantNumeros);
        System.out.println("Quantidade de pares: " + quantPares);
    }
}
