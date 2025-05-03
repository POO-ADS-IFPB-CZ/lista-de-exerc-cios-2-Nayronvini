[![Review Assignment Due Date](https://classroom.github.com/assets/deadline-readme-button-22041afd0340ce965d47ae6ef1cefeee28c7c493a6346c4f15d667ab976d596c.svg)](https://classroom.github.com/a/zaY_p4dR)


***Questão 1***

Por três motivos, sendo eles:

**Encapsulamento**
Você esconde os detalhes internos da classe e expõe apenas o que for necessário. Isso protege os dados de serem acessados ou modificados de forma indevida.

**Validação**
Com um setter, você pode controlar como e quando os dados podem ser modificados. Por exemplo, você pode impedir valores inválidos, como saldo negativo, idade menor que zero, etc.

**Flexibilidade**
Se no futuro quiser mudar a lógica interna, você pode alterar o comportamento do getter/setter sem afetar quem usa a classe, desde que a assinatura continue igual.

**EX sem setter**
Nesse exemplo o usuario poderia colocar um valor negativo, pois sem o setter não há algo que impessa isso na classe Pessoa

public class Pessoa {
    public int idade;
}

public class Main {
    public static void main(String[] args) {
        Pessoa julia = new Pessoa();
        julia.idade = -5;
        System.out.println("Idade: " + p.idade);
    }
}

**EX com setter**
Já com o setter implementado podemos impedir que um erro assim aconteça

public class Pessoa {
    private int idade;

    public void setIdade(int novaIdade) {
        if (novaIdade >= 0) {
            idade = novaIdade;
        } else {
            System.out.println("Erro: idade não pode ser negativa.");
        }
    }

    public int getIdade() {
        return idade;
    }
}

public class Main {
    public static void main(String[] args) {
        Pessoa p = new Pessoa();
        p.setIdade(-5);  
        System.out.println("Idade: " + p.getIdade());
    }
}

***Questão 2***
**A**
• Nome
• Codigo
• Autor
• Gênero
• Editora
• Tipo (consulta ou empréstimo)

**B**
Abstração significa representar os aspectos essenciais de um objeto real e ignorar os detalhes que não são relevantes para o contexto, ou seja, você cria uma versão digital simplificada de um livro, isso permite que o sistema lide com muitos livros de forma uniforme, sem se preocupar com suas diferenças físicas.

**C**
• Cadastrar
• Emprestar
• Devolver
• Exibir Informações
• Pesquisar
• Filtar