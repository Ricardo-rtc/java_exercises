# Exercício 6: Importância do Encapsulamento

## Pergunta
Qual é a importância do encapsulamento na programação orientada a objetos? Como podemos representar o encapsulamento na linguagem de programação Java?

## Resposta
O encapsulamento é importante porque protege os dados internos de um objeto, permitindo o acesso apenas por meio de métodos públicos e controlados. Isso promove segurança, modularidade e facilita a manutenção do código. Em Java, o encapsulamento é implementado usando modificadores de acesso como `private`, `protected` e `public`.

Exemplo de encapsulamento em Java:

```java
public class Pessoa {
    private String nome; // Atributo privado

    public String getNome() { // Método público para acesso controlado
        return nome;
    }

    public void setNome(String nome) { // Método público para modificar o valor
        this.nome = nome;
    }
}
