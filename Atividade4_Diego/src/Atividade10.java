import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Locale;
import java.util.Scanner;

public class Atividade10 {
    public static void main(String[] args) {
        Locale brasil = Locale.forLanguageTag("pt-BR");
        Scanner sc = new Scanner(System.in).useLocale(brasil);

        System.out.print("Digite o número de itens da compra: ");
        int n = sc.nextInt();

        if (n < 1) {
            System.out.println("Quantidade inválida.");
            sc.close();
            return;
        }

        BigDecimal[] precos = new BigDecimal[n];
        int[] quantidades = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Preço unitário do item " + (i + 1) + ": R$ ");
            precos[i] = sc.nextBigDecimal();

            System.out.print("Quantidade do item " + (i + 1) + ": ");
            quantidades[i] = sc.nextInt();
        }

        BigDecimal total = BigDecimal.ZERO;

        for (int i = 0; i < n; i++) {
            BigDecimal subtotal = precos[i].multiply(BigDecimal.valueOf(quantidades[i]));
            total = total.add(subtotal);

            System.out.printf(brasil, "Subtotal do item %d: R$ %.2f%n", i + 1, subtotal);
        }

        BigDecimal desconto = BigDecimal.ZERO;

        if (total.compareTo(new BigDecimal("200.00")) > 0) {
            desconto = total.multiply(new BigDecimal("0.05"))
                    .setScale(2, RoundingMode.HALF_UP);
        }

        BigDecimal valorFinal = total.subtract(desconto);

        System.out.printf(brasil, "Total da compra: R$ %.2f%n", total);
        System.out.printf(brasil, "Desconto: R$ %.2f%n", desconto);
        System.out.printf(brasil, "Valor final a pagar: R$ %.2f%n", valorFinal);
    }
}
