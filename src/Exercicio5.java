import java.util.Scanner;
public class Exercicio5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Salário mínimo: ");
        double salarioMinimo = scan.nextDouble();
        System.out.println("Salário do usuário: ");
        double salarioUsuario = scan.nextDouble();
        double qtdSalarioMinimo = salarioUsuario / salarioMinimo;
        System.out.println("Você recebe " + qtdSalarioMinimo + " salários mínimos");
    }
}