package exercicios_repeticao;

import java.util.Scanner;

public class Exercicio25 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String menorNome = "";
        int menorIdade = 1000;
        for (int i = 1; i <= 3; i++) {
            System.out.println("Digite seu nome: ");
            String nome = scan.next();
            System.out.println("Digite sua idade: ");
            int idade = scan.nextInt();
            if (idade < menorIdade) {
                menorIdade = idade;
                menorNome = nome;
            }
        }
        System.out.println("A pessoa mais nova é: " + menorNome+ ", e sua idade é de " + menorIdade + " anos.");
    }
}
