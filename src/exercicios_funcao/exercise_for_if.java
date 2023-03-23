package remembering_exercises;
import java.util.Scanner;

//8) Leia a idade de 20 pessoas e exiba quantas pessoas são maiores de idade.

public class exercise_for_if {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int idade = 0;
        int maiorIdade = 0;
        int i;
        for (i = 1; i <= 5; i ++) {
            System.out.println("Idade: ");
            idade = scan.nextInt();
            if (idade >= 18) {
                maiorIdade += 1;
            }
        }
        System.out.println("Pessoas maiores de idade: " + maiorIdade);
    }
}