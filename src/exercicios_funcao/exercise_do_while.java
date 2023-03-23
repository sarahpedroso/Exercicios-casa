package remembering_exercises;
import java.util.Scanner;
//12) Escreva um algoritmo que leia 20 números do usuário e exiba quantos números são
////        pares

public class exercise_do_while {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int quantNumeros =10;
        int quantImpares = 0;
        int contador = 0;
        do {
            System.out.println("Numero: ");
            int numero = scan.nextInt();
            if (numero % 2 != 0) {
                quantImpares = quantImpares + 1;
            }
            contador++;
        } while (contador < quantNumeros);
        System.out.println("Quantidade de números ímpares: " + quantImpares );
    }
}
