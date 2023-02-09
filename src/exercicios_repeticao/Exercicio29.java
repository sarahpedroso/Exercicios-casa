package exercicios_repeticao;

import java.util.Scanner;

public class Exercicio29 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int entre0e100 = 0;
        for (int i = 0; i <=5; i++) {
            System.out.println("Numero: ");
            int numero = scan.nextInt();
            if (numero > 0 && numero < 100) {
                entre0e100 = entre0e100 + 1;
            }
        }
        System.out.println("Numeros entre 0 e 100: " + entre0e100);
    }
}
