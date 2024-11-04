# Exercício 2: Representação de uma Classe em Java

## Pergunta
Como posso representar uma classe na linguagem de programação Java?

## Resposta
Em Java, uma classe é representada usando a palavra-chave `class`, seguida do nome da classe e do corpo da classe entre chaves `{ }`. Exemplo:

```java
public class Pessoa {
    // Atributos
    private String nome;
    private int idade;

    // Construtor
    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    // Métodos
    public void apresentar() {
        System.out.println("Olá, meu nome é " + nome + " e tenho " + idade + " anos.");
    }
}
