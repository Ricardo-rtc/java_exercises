import java.util.Scanner;

public class ex3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        System.out.print("Informe um número inteiro maior que zero: ");
        int numero = scanner.nextInt();

        if (numero > 0) {
            if (numero % 2 == 0) {
                System.out.println("O número " + numero + " é par.");
            } else {
                System.out.println("O número " + numero + " é ímpar.");
            }
        } else {
            System.out.println("Por favor, insira um número maior que zero.");
        }

        scanner.close();
	}
}
		      