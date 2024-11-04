import java.util.Scanner;

public class ex9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita os três números ao usuário
        System.out.print("Digite o primeiro número: ");
        int num1 = scanner.nextInt();

        System.out.print("Digite o segundo número: ");
        int num2 = scanner.nextInt();

        System.out.print("Digite o terceiro número: ");
        int num3 = scanner.nextInt();

        int menor, medio, maior;

        // Determina o menor, o médio e o maior valor
        if (num1 <= num2 && num1 <= num3) {
            menor = num1;
            if (num2 <= num3) {
                medio = num2;
                maior = num3;
            } else {
                medio = num3;
                maior = num2;
            }
        } else if (num2 <= num1 && num2 <= num3) {
            menor = num2;
            if (num1 <= num3) {
                medio = num1;
                maior = num3;
            } else {
                medio = num3;
                maior = num1;
            }
        } else {
            menor = num3;
            if (num1 <= num2) {
                medio = num1;
                maior = num2;
            } else {
                medio = num2;
                maior = num1;
            }
        }

        // Exibe os números em ordem crescente
        System.out.println("Números em ordem crescente: " + menor + ", " + medio + ", " + maior);

        scanner.close();
    }
}
