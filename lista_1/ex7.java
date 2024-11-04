import java.util.Scanner;

public class ex7 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o primeiro número (maior que 10): ");
        int num1 = scanner.nextInt();
        System.out.print("Informe o segundo número (maior que 10): ");
        int num2 = scanner.nextInt();

        if (num1 > 10 && num2 > 10) {
            System.out.println("Soma: " + (num1 + num2));
            System.out.println("Subtração: " + (num1 - num2));
            System.out.println("Multiplicação: " + (num1 * num2));
        } else {
            System.out.println("Ambos os números devem ser maiores que 10.");
        }

        scanner.close();
	}
}
		      