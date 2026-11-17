import java.util.Locale;
import java.util.Scanner;

public class Atividade4 {
    public static void main(String[] args) {
        Locale brasil = Locale.forLanguageTag("pt-BR");
        Scanner sc = new Scanner(System.in).useLocale(brasil);

        double[] precos = new double[5];
        double total = 0;

        for (int i = 0; i < precos.length; i++) {
            System.out.print("Digite o preço do produto " + (i + 1) + ": ");
            precos[i] = sc.nextDouble();
            total += precos[i];
        }

        for (int i = 0; i < precos.length; i++) {
            System.out.printf(brasil, "Produto %d: R$ %.2f%n", i + 1, precos[i]);
        }

        System.out.printf(brasil, "Total da compra: R$ %.2f%n", total);
    }
}