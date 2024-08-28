https://github.com/FR-macedo/EstoquePOO

Projeto de Programação Orientada a Objetos.
Solicitado no dia 24/10/2023 pelo professor Gerivan.

Integrantes do grupo: Francisco Macedo, Samuel Alexandre, Luigi Mendes

Requisitos: 

Deve conter um menu navegável (entrega para o dia 7/11/23)

Visão geral:

O sistema de gestão de estoque é um software que gerencia o controle de estoque de uma
empresa. O sistema é composto por três entidades principais: Produto, Fornecedor e
Estoque. O sistema permite que os usuários possam gerenciar a entrada e saída de
produtos, controlar o estoque de cada produto, além de realizar outras funções de gestão
de estoque.

Produto (id, código, nome, descrição, fornecedor, dataCadastro…)
- Cadastrar Produto
- Buscar Produto por Nome
- Listar Produtos
- Deletar Produto
  
Pessoa - Fornecedor (id, Nome, CNPJ, logradouro, bairro, cidade, estado, cep, cpf,
rg, telefone, email, dataCadastro, dataNascimento…)
- Cadastrar Fornecedor
- Buscar Fornecedor por Nome
- Listar Fornecedor
- Deletar Fornecedor
  
Estoque (produto, quantidade, armazen, prateleira…)
- Atualizar Estoque de produtos
- Adicionar Estoque de produtos
- Remover Estoque de produtos
- Listar Produtos Disponíveis
  
Principais conceitos de POO utilizados:
Encapsulamento: Todas as propriedades e métodos de cada entidade (Produto,
Fornecedor e Estoque) são encapsulados dentro de sua respectiva classe, garantindo que
as informações sejam protegidas e acessadas apenas pelos métodos definidos dentro da
classe.

Herança: A classe fornecedor é uma subclasse da classe Pessoa (classe base). Isso
permite a reutilização de código e a criação de hierarquias de classes, tornando o sistema
mais organizado e fácil de manter.

Polimorfismo: As classes Produto, Forncedor e Estoque possuem métodos com o mesmo
nome, mas com comportamentos diferentes. Por exemplo, o método "buscar" na classe
Produto realiza uma busca pelo nome do produto, enquanto o método "buscar" na classe
Fornecedor realiza uma busca pelo nome do fornecedor. Isso permite que o mesmo método
seja utilizado de formas diferentes em cada classe.

Abstração: As classes Produto, Fornecedor e Estoque são abstrações de conceitos reais, e
seus atributos e métodos representam características e comportamentos que esses
conceitos possuem na vida real

# EstoquePOO
