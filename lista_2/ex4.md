# Exercício 4: Finalidade e Assinatura do Método Construtor

## Pergunta
Qual a finalidade do método construtor? Qual é a assinatura do método construtor na linguagem de programação Java?

## Resposta
O método construtor tem como finalidade inicializar um objeto ao criar uma instância da classe, atribuindo valores iniciais aos atributos. Em Java, a assinatura do construtor é definida pelo nome da classe seguido de parênteses, sem especificação de tipo de retorno. Exemplo:

```java
public class Pessoa {
    private String nome;
    
    public Pessoa(String nome) { // Assinatura do construtor
        this.nome = nome;
    }
}
