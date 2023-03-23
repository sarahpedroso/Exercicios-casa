package remembering_exercises;
import java.util.Scanner;

//5. Criar um algoritmo em PORTUGOL que informe a quantidade total de calorias
//        de uma refeição a partir do usuário que deverá informar o prato, a sobremesa
////        e a bebida.
public class exercise_switch_case {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Prato: ");
        String prato = scan.next();
        System.out.println("Sobremesa: ");
        String sobremesa = scan.next();
        System.out.println("Bebida: ");
        String bebida = scan.next();
        int caloriaPrato = 0;
        int caloriaSobremesa = 0;
        int caloriaBebida = 0;
        switch (prato) {
            case "Vegetariano":
                caloriaPrato = 180;
                break;
            case "Peixe":
                caloriaPrato = 230;
                break;
            case "Frango":
                caloriaPrato = 250;
                break;
            case "Carne":
                caloriaPrato = 350;
                break;
        }
        switch (sobremesa) {
            case "Abacaxi":
                caloriaSobremesa = 75;
                break;
            case "Sorvete Diet":
                caloriaSobremesa = 110;
                break;
            case "Mouse Diet":
                caloriaSobremesa = 170;
                break;
            case "Mouse Chocolate":
                caloriaSobremesa = 200;
                break;
        }
        switch (bebida) {
            case "Chá":
                caloriaBebida = 20;
                break;
            case "Suco de Laranja":
                caloriaBebida = 70;
                break;
            case "Suco de Melao":
                caloriaBebida = 100;
                break;
            case "Refrigerante Diet":
                caloriaBebida = 65;
                break;
        }
        System.out.println("Total de calorias ingeridas: " + (caloriaPrato+caloriaSobremesa+caloriaBebida));
    }
}
