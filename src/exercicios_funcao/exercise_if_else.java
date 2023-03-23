package remembering_exercises;

import java.util.Scanner;

////4. Crie um algoritmo em PORTUGOL que leia a idade de uma pessoa e informe a sua classe eleitoral:
//         não eleitor (abaixo de 16 anos);
//         eleitor obrigatório (entre a faixa de 18 e menor de 65 anos);
//         eleitor facultativo (de 16 até 18 anos e maior de 65 anos, inclusive).
public class exercise_if_else {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Idade: ");
        int idade = scan.nextInt();
        if (idade < 16) {
            System.out.println("Não eleitor!");
        } else if (idade >= 18 && idade < 65) {
            System.out.println("Eleitor obrigatorio!");
        } else {
            System.out.println("Eleitor facultativo!");
        }
    }
}