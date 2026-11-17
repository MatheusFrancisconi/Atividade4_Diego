import java.util.Locale;
import java.util.Scanner;

public class Atividade3 {
    public static void main(String[] args) {
        Locale brasil = Locale.forLanguageTag("pt-BR");
        Scanner sc = new Scanner(System.in).useLocale(brasil);

        double[] notas = new double[4];
        double soma = 0;

        for (int i = 0; i < notas.length; i++) {
            System.out.print("Digite a nota " + (i + 1) + ": ");
            notas[i] = sc.nextDouble();
            soma += notas[i];
        }

        double media = soma / notas.length;
        System.out.printf(brasil, "Média: %.2f%n", media);

        if (media >= 6) {
            System.out.println("situação: aprovado!!!");
        } else {
            System.out.println("situação: reprovado!!!");
        }
    }
}