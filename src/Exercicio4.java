import java.util.Scanner;
public class Exercicio4 {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            System.out.println("Imposto: ");
            double ipi = scan.nextDouble();
            System.out.println("Código da peça: ");
            String codigo1 = scan.next();
            System.out.println("Valor: ");
            double valor1 = scan.nextDouble();
            System.out.println("Quantidade: ");
            double qtd1 = scan.nextDouble();
            System.out.println("Código da peça: ");
            String codigo2 = scan.next();
            System.out.println("Valor: ");
            double valor2 = scan.nextDouble();
            System.out.println("Quantidade: ");
            double qtd2 = scan.nextDouble();
            double formula = (valor1 * qtd1 + valor2 * qtd2) * (ipi / 100 + 1);
            System.out.println("Total a ser pago: " + formula);

        }
    }
