public class Exercicio3 {
    public static void main(String[] args) {
        double saldo = 1565;
        System.out.println("Seu saldo é de: " + saldo);
        double saldoComReajuste = (saldo * 0.01);
        double novoSaldo = (saldo + saldoComReajuste);
        System.out.println("Saldo com reajuste: " + novoSaldo);
    }
}

