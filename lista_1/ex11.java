import java.util.Scanner;

public class ex11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita a temperatura em Celsius
        System.out.print("Digite a temperatura em Celsius: ");
        double celsius = scanner.nextDouble();

        // Converte Celsius para Fahrenheit
        double fahrenheit = (celsius * 9 / 5) + 32;

        // Exibe o resultado
        System.out.printf("A temperatura em Fahrenheit é: %.2f°F%n", fahrenheit);

        scanner.close();
    }
}
