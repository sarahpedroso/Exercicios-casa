package exercicios_ifElse_switchCase;

import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Quantidade de maçãs: ");
        double qtdMacas =  scan.nextDouble();
        if (qtdMacas < 12) {
            System.out.println("Valor total: R$ " + qtdMacas * 0.30);
        } else if (qtdMacas >= 12) {
            System.out.println("Valor total: R$ " + qtdMacas * 0.25);
        }
    }
}
