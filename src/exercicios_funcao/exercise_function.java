package remembering_exercises;
import java.util.Scanner;

public class exercise_function {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double celsius = scan.nextDouble();
        String tipoConversao = scan.next();
        chooseConversor(tipoConversao, celsius);
    }
    static void chooseConversor(String tipoConversao, double celsius) {
        switch (tipoConversao) {
            case "K":
                System.out.println(conversorTemperaturaKelvin(celsius));
                break;
            case "F":
                System.out.println(conversorTemperaturaFahrenheit(celsius));
                break;
            case "Re":
                System.out.println(conversorTemperaturaReaumur(celsius));
                break;
            case "Ra":
                System.out.println(conversorTemperaturaRankine(celsius));
                break;
        }
    }
     static double conversorTemperaturaKelvin(double celsius) {
         return celsius + 273.15;
     }
     static double conversorTemperaturaFahrenheit(double celsius) {
        return (celsius * 1.8) + 32;
     }
     static double conversorTemperaturaReaumur(double celsius) {
        return celsius * 0.8;
     }
     static double conversorTemperaturaRankine(double celsius) {
        return (celsius * 1.8) + 32 + 459.67;
     }
}
