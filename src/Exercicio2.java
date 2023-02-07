public class Exercicio2 {
    public static void main(String[] args) {
        int n1 = 8;
        int n2 = 9;
        int n3 = 7;
        int n4 = 4;
        int n5 = 5;
        int n6 = 6;
        double mediaAritmetica= ((n1 + n2 + n3) / 3);
        System.out.println("Media dos numeros: " + mediaAritmetica);
        double mediaAritmetica2 = ((n4 + n5 + n6) / 3);
        System.out.println("Media dos numeros: " + mediaAritmetica2);
        double somaDasMedias = (mediaAritmetica + mediaAritmetica2);
        System.out.println("Soma das medias: " + somaDasMedias);
        double mediaDasMedias = (somaDasMedias / 2);
        System.out.println("Media das medias: " + mediaDasMedias);
    }
}
