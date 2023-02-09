package exercicios_repeticao;

import java.util.Scanner;

public class Exercicio24 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int maiorIdade = 0;
        for (int i = 1; i <= 5; i++) {
            System.out.println("Idade: ");
            int idade = scan.nextInt();
            if (idade >= 18) {
                maiorIdade = maiorIdade+1;
            }
        }
        System.out.println("Qtd de maior de idade: " + maiorIdade);
    }
}
