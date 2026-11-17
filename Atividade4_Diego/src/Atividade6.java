import java.util.Locale;
import java.util.Scanner;

public class Atividade6 {
    public static void main(String[] args) {
        Locale brasil = Locale.forLanguageTag("pt-BR");
        Scanner sc = new Scanner(System.in).useLocale(brasil);

        System.out.print("digite o valor do empréstimo: R$ ");
        double valor = sc.nextDouble();

        System.out.print("digite a taxa de juros mensal em porcentagem: ");
        double taxa = sc.nextDouble();

        double[] valoresDevidos = new double[12];

        for (int i = 0; i < valoresDevidos.length; i++) {
            int mes = i + 1;
            valoresDevidos[i] = valor + valor * taxa / 100 * mes;
        }

        for (int i = 0; i < valoresDevidos.length; i++) {
            System.out.printf(brasil, "mês %d: R$ %.2f%n", i + 1, valoresDevidos[i]);
        }
    }
}
