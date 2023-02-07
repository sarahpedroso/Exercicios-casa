/*
bem-vindo a pizzaria! o usuario tera direito a escolher uma de nossas 6 pizzas.
segue o menu abaixo:
1. calabresa / 2. frango com catupiry / 3. quatro queijos / 4. portuguesa / 5. chocolate / 6. morango
Caso o usuario digite qualquer numero diferente de um desses, o sistema deve emitir uma mensagem de "opção invalida".
 */
import java.util.Scanner;
public class Exercicio8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Bem-vindo cliente! Escolha uma de nossas pizzas: ");
        int numero = scan.nextInt();
        switch (numero) {
            case 1:
                System.out.println("Você escolheu a de Calabresa.");
                break;
            case 2:
                System.out.println("Você escolheu a de Frango com Catupiry.");
                break;
            case 3:
                System.out.println("Você escolheu a de Quatro Queijos.");
                break;
            case 4:
                System.out.println("Você escolheu a de Portuguesa.");
                break;
            case 5:
                System.out.println("Você escolheu a de Chocolate.");
                break;
            case 6:
                System.out.println("Você escolheu a de Morango.");
                break;
            default:
                System.out.println("Ops... Opção invalida!");
        }
    }
}