# Envio_de_Email

Este projeto visa recriar uma hierarquia de classes abordada em aula, além de implementar o método `enviarEmail` que recebe o corpo da mensagem e insere uma saudação personalizada com base no tipo de objeto.

## 🚀 Começando

O objetivo é praticar conceitos de Programação Orientada a Objetos (POO), como herança e polimorfismo, desenvolvendo classes específicas para professores e alunos, cada uma com seu comportamento particular ao enviar um e-mail.

### Características

•⁠  ⁠Classe `Pessoa` com atributos: `nome` e `email`.  
•⁠  ⁠Classe `Aluno`, que herda de `Pessoa`, com atributos adicionais: `RA` (Registro Acadêmico).  
•⁠  ⁠Classe `Professor`, que herda de `Pessoa`, com atributo adicional: `disciplina`.  
•⁠  ⁠Método `enviarEmail` nas classes `Aluno` e `Professor` que recebe o corpo da mensagem e insere uma saudação personalizada:  
    - Para Professores: “Olá Prof. [nome]!”  
    - Para Alunos: “Olá Aluno [nome]!”

### Exemplo de Execução

1. Criar um objeto `Aluno` e um objeto `Professor`.
2. Utilizar o método `enviarEmail` para cada um, e observar a saudação personalizada:

- **Professor:**  
    Olá Prof. Alan Turing!  
    Mensagem...

- **Aluno:**  
    Olá Aluno Joseph!  
    Mensagem...

## 🔧 Instalação

1. Clone o repositório.
2. Abra o projeto na sua IDE favorita (Eclipse, IntelliJ, etc.).
3. Execute a classe `Main` para testar as funcionalidades.

## 🛠️ Construído com

•⁠  ⁠Linguagem: `Java`  
•⁠  ⁠IDE: `Eclipse`  

## 📌 Versão

Versão 1.0

**Autor:** Taynara Raquel
