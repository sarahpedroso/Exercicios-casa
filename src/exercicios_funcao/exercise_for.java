package remembering_exercises;
import java.util.Scanner;

//13) Faça um algoritmo que leia 20 números e, ao final, escreva quantos estão entre 0 e 100.
public class exercise_for {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int entre0e100 = 0;
        int i;
        for (i = 0; i <= 20; i++) {
            System.out.println("Digite um número: ");
            int numero = scan.nextInt();
            if (numero > 0 && numero < 100) {
                entre0e100 = entre0e100 + 1;
            }
        }
        System.out.println("Numeros entre 0 e 100: " + entre0e100);
    }
}
