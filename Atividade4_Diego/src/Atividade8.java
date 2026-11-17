import java.util.Locale;
import java.util.Scanner;

public class Atividade8 {
    public static void main(String[] args) {
        Locale brasil = Locale.forLanguageTag("pt-BR");
        Scanner sc = new Scanner(System.in).useLocale(brasil);

        double[] notas = new double[10];
        int aprovados = 0;
        int emRecuperacao = 0;
        int reprovados = 0;

        for (int i = 0; i < notas.length; i++) {
            System.out.print("Digite a nota do aluno " + (i + 1) + ": ");
            notas[i] = sc.nextDouble();

            if (notas[i] >= 6) {
                aprovados++;
            } else if (notas[i] >= 4) {
                emRecuperacao++;
            } else {
                reprovados++;
            }
        }

        System.out.println("Aprovados: " + aprovados);
        System.out.println("Em recuperação: " + emRecuperacao);
        System.out.println("Reprovados: " + reprovados);
    }
}