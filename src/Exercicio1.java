import java.util.Scanner;

    public class Exercicio1 {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            System.out.println("Idade: ");
            int idade = scan.nextInt();
            System.out.println("Meses: ");
            int meses = scan.nextInt();
            System.out.println("Dias: ");
            int dias = scan.nextInt();
            int qtdDiasNoMes = 30;
            int qtdDiasNoAno = 365;
            int totalDeDias = ((qtdDiasNoMes * meses) + (qtdDiasNoAno * idade) + dias);
            System.out.println("Total de dias: " + totalDeDias);
        }
    }
