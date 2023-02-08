package exercicios_ifElse_switchCase;

import java.util.Scanner;

public class Exercicio9 {
    //switch case:
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite a senha: ");
        String senha = scan.next();
        switch (senha) {
            case "1234":
                System.out.println("ACESSO PERMITIDO");
                break;
            case "5678":
                System.out.println("ACESSO PERMITIDO A GERENTE");
                break;
            case "9090":
                System.out.println("ACESSO PERMITIDO A ADMINISTRADOR");
                break;
            default:
                System.out.println("ACESSO NEGADO");
        }

// if/else:
//        if (senha == 1234) {
//            System.out.println("ACESSO PERMITIDO");
//        } else if (senha == 5678) {
//            System.out.println("ACESSO PERMITIDO A GERENTE");
//        } else if (senha == 9090) {
//            System.out.println("ACESSO PERMITIDO A ADMINISTRADOR");
//        } else {
//            System.out.println("ACESSO NEGADO");
//        }
    }
}
