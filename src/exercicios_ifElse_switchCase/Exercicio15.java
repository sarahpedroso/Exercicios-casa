package exercicios_ifElse_switchCase;

import java.util.Scanner;

public class Exercicio15 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Primeira medida do lado do triângulo: ");
        int primeiraMedida = scan.nextInt();
        System.out.println("Segunda medida do lado do triângulo: ");
        int segundaMedida = scan.nextInt();
        System.out.println("Terceira medida do lado do triângulo: ");
        int terceiraMedida = scan.nextInt();
        if (primeiraMedida == segundaMedida && primeiraMedida == terceiraMedida) {
            System.out.println("Triângulo EQUILÁTERO. ");
        } else if (primeiraMedida == segundaMedida || primeiraMedida == terceiraMedida) {
            System.out.println("Triângulo ISÓSCELE. ");
        } else {
            System.out.println("Triângulo ESCALENO. ");
        }
    }
}
