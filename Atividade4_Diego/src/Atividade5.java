import java.util.Locale;
import java.util.Scanner;

public class Atividade5 {
    public static void main(String[] args) {
        Locale brasil = Locale.forLanguageTag("pt-BR");
        Scanner sc = new Scanner(System.in).useLocale(brasil);

        double[] precos = new double[5];
        double[] precosComDesconto = new double[5];

        for (int i = 0; i < precos.length; i++) {
            System.out.print("Digite o preço do produto " + (i + 1) + ": ");
            precos[i] = sc.nextDouble();
            precosComDesconto[i] = precos[i] * 0.90;
        }

        for (int i = 0; i < precos.length; i++) {
            System.out.printf(brasil,"Produto %d: Original R$ %.2f | Com desconto R$ %.2f%n",i + 1, precos[i], precosComDesconto[i]
            );
        }
    }
}