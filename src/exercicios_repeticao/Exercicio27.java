package exercicios_repeticao;

import java.util.Scanner;

public class Exercicio27 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int maiorQue8 = 0;
        for (int i = 0; i <= 5; i++) {
            System.out.println("Idade: ");
            int idade = scan.nextInt();
            if (idade > 8) {
                maiorQue8 = maiorQue8 + 1;
            }
        }
        System.out.println("Acima de 8 anos: " + maiorQue8);
    }
}
