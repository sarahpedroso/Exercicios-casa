package exercicios_ifElse_switchCase;

import java.util.Scanner;

public class Exercicio13 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o número de lados: ");
        int numeroLados =  scan.nextInt();

        //usando o switch case:

        switch (numeroLados) {
            case 3:
                System.out.println("É um triângulo.");
                break;
            case 4:
                System.out.println("É um quadrado.");
                break;
            case 5:
                System.out.println("É um pentágono.");
                break;
            default:
                if (numeroLados <3) {
                    System.out.println("Não é um polígono.");
                } else {
                    System.out.println("Polígono não identificado.");
                }

        }
//         Usando o IF/ ELSE:

//        if (numeroLados == 3) {
//            System.out.println("É um triângulo.");
//        } else if (numeroLados == 4) {
//            System.out.println("É um quadrado.");
//        } else if (numeroLados == 5) {
//            System.out.println("É um pentágono.");
//        } else if (numeroLados < 3) {
//            System.out.println("Não é um polígono.");
//        } else {
//            System.out.println("Polígono não identificado.");
//        }
    }
}
