# Exercício 7: Importância da Sobrecarga de Métodos

## Pergunta
Qual é a importância da técnica de ‘sobrecarregar‘ os métodos na programação orientada a objetos?

## Resposta
A sobrecarga de métodos permite definir múltiplas versões do mesmo método dentro de uma classe, utilizando o mesmo nome, mas com diferentes parâmetros. Isso aumenta a flexibilidade e a reutilização do código, pois o método pode se adaptar a diferentes necessidades sem que seja necessário criar novos nomes de métodos.

Exemplo de sobrecarga:

```java
public class Calculadora {
    public int somar(int a, int b) {
        return a + b;
    }

    public double somar(double a, double b) { // Sobrecarga com parâmetros diferentes
        return a + b;
    }

    public int somar(int a, int b, int c) { // Outra sobrecarga com número de parâmetros diferente
        return a + b + c;
    }
}
