import java.util.Locale;
import java.util.Scanner;

public class Atividade7 {
    public static void main(String[] args) {
        Locale brasil = Locale.forLanguageTag("pt-BR");
        Scanner sc = new Scanner(System.in).useLocale(brasil);

        double[] salarios = new double[6];

        for (int i = 0; i < salarios.length; i++) {
            System.out.print("Digite o salário do funcionário " + (i + 1) + ": R$ ");
            salarios[i] = sc.nextDouble();
        }

        double maior = salarios[0];
        double menor = salarios[0];
        double soma = 0;

        for (int i = 0; i < salarios.length; i++) {
            double salario = salarios[i];
            soma += salario;

            if (salario > maior) {
                maior = salario;
            }

            if (salario < menor) {
                menor = salario;
            }
        }

        double media = soma / salarios.length;
        int acimaDaMedia = 0;

        for (int i = 0; i < salarios.length; i++) {
            if (salarios[i] > media) {
                acimaDaMedia++;
            }
        }

        System.out.printf(brasil, "Maior salário: R$ %.2f%n", maior);
        System.out.printf(brasil, "Menor salário: R$ %.2f%n", menor);
        System.out.printf(brasil, "Média dos salários: R$ %.2f%n", media);
        System.out.println("acima da média: " + acimaDaMedia);
    }
}
