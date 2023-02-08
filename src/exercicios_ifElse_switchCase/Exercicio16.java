package exercicios_ifElse_switchCase;

import java.util.Scanner;

public class Exercicio16 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Ângulo: ");
        int angulo = scan.nextInt();
        if (angulo == 90) {
            System.out.println("Triângulo Retângulo");
        } else if (angulo > 90) {
            System.out.println("Triângulo Obtusângulo");
        } else {
            System.out.println("Triângulo Acutângulo");
        }
    }
}