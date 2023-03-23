package remembering_exercises;
import java.util.Scanner;
public class exercise_function_2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Grade de funcionarios: ");
        int numFuncionarios = scan.nextInt();
        double mediaDeSalarios = mediaDeSalarios(numFuncionarios);
        System.out.println("Media de salarios: " + mediaDeSalarios);
    }
    static double mediaDeSalarios(int numFuncionarios){
        double salarioTotal = 0;
        for (int i = 1; i <= numFuncionarios; i++) {
            Scanner scan = new Scanner(System.in);
            System.out.println("Salario " + i);
            double salario = scan.nextDouble();
            salarioTotal = salario + salarioTotal;
        }
        return salarioTotal / numFuncionarios;
    }
}
