import java.text.DecimalFormat;
import java.util.Scanner;

public class ex8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar as três notas do aluno
        System.out.print("Digite a primeira nota: ");
        double nota1 = scanner.nextDouble();

        System.out.print("Digite a segunda nota: ");
        double nota2 = scanner.nextDouble();

        System.out.print("Digite a terceira nota: ");
        double nota3 = scanner.nextDouble();

        // Calcular a média das notas
        double media = (nota1 + nota2 + nota3) / 3;

        DecimalFormat df = new DecimalFormat("#.00");
        String mediaFormatada = df.format(media);

        // Verificar o status do aluno com base na média
        if (media >= 7.0) {
            System.out.println("Aluno aprovado com média: " + mediaFormatada);
        } else if (media >= 5.0) {
            System.out.println("Aluno em recuperação com média: " + mediaFormatada);
        } else {
            System.out.println("Aluno reprovado com média: " + mediaFormatada);
        }

        scanner.close();
    }
}
