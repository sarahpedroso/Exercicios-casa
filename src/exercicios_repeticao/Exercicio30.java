package exercicios_repeticao;

import java.util.Scanner;

public class Exercicio30 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int entre0e100 = 0;
        int entre101e200 = 0;
        int acimaDe200 = 0;
        for (int i = 1; i <=10; i++) {
            System.out.println("Numero: ");
            int numero = scan.nextInt();
            if (numero >= 0 && numero <= 100) {
                entre0e100 = entre0e100 + 1;
            } else if (numero >= 101 && numero <= 200) {
                entre101e200 = entre101e200 + 1;
            } else {
                acimaDe200 = acimaDe200 + 1;
            }
        }
        System.out.println("Numeros entre 0 e 100: " + entre0e100);
        System.out.println("Numeros entre 101 e 200: " + entre101e200);
        System.out.println("Numeros acima de 200: " + acimaDe200);
    }
}
