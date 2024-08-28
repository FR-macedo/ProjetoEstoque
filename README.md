# EstoquePOO

## Visão Geral

O sistema de gestão de estoque é um software simples de controle de estoque, desenvolvido como parte de um projeto de Programação Orientada a Objetos (POO). O sistema permite gerenciar a entrada e saída de produtos, controlar o estoque de cada item e realizar outras funções de gestão de estoque. Este projeto foi solicitado pelo professor Gerivan em 24/10/2023.

### Entidades Principais

1. **Produto** (id, código, nome, descrição, fornecedor, dataCadastro…)
   - Cadastrar Produto
   - Buscar Produto por Nome
   - Listar Produtos
   - Deletar Produto

2. **Pessoa - Fornecedor** (id, Nome, CNPJ, logradouro, bairro, cidade, estado, cep, cpf, rg, telefone, email, dataCadastro, dataNascimento…)
   - Cadastrar Fornecedor
   - Buscar Fornecedor por Nome
   - Listar Fornecedores
   - Deletar Fornecedor

3. **Estoque** (produto, quantidade, armazém, prateleira…)
   - Atualizar Estoque de produtos
   - Adicionar Estoque de produtos
   - Remover Estoque de produtos
   - Listar Produtos Disponíveis

### Principais Conceitos de POO Utilizados

- **Encapsulamento:** Propriedades e métodos de cada entidade são encapsulados em suas respectivas classes.
- **Herança:** A classe `Fornecedor` é uma subclasse da classe `Pessoa`, promovendo a reutilização de código.
- **Polimorfismo:** Métodos com o mesmo nome, mas comportamentos diferentes, como o método "buscar".
- **Abstração:** As classes representam abstrações de conceitos reais, com atributos e métodos que refletem essas características.

## Requisitos

- Deve conter um menu navegável.
- Data de entrega: 07/11/2023

## Integrantes do Grupo

- Francisco Macedo
- Samuel Alexandre
- Luigi Mendes

## Como Configurar o Ambiente

### Instalação do Java

Para executar este projeto, você precisará do Java Development Kit (JDK) instalado na sua máquina. Siga as instruções abaixo para instalar o JDK:

1. **Windows/MacOS/Linux:**
   - Acesse a [página de downloads do JDK](https://www.oracle.com/java/technologies/javase-jdk11-downloads.html).
   - Selecione o instalador adequado para o seu sistema operacional.
   - Siga as instruções de instalação.

2. **Verifique a Instalação:**
   - Abra o terminal ou prompt de comando.
   - Execute o comando `java -version` para verificar se o Java foi instalado corretamente.

### Clonando o Repositório

Para clonar o repositório do projeto, siga os passos abaixo:

1. **Abra o terminal.**
2. **Navegue até o diretório onde deseja clonar o repositório.**
3. **Execute o comando:**

   ```bash
   git clone https://github.com/FR-macedo/EstoquePOO.git
