//criado dia 31/10/23 -Francisco
import java.util.*;
public class Main {
    private static List<Fornecedor> fornecedores = new ArrayList<>();
    private static List<Produto> produtos = new ArrayList<>();
    private static List<Estoque> estoques = new ArrayList<>();

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int menuOP;
        do {
            System.out.println("\n \n \n ");
            System.out.println("MENU PRINCIPAL");
            System.out.println("1. Estoque");
            System.out.println("2. Produto");
            System.out.println("3. Fornecedor");
            System.out.println("4. Sair");
            System.out.print("Escolha uma opção: ");

            menuOP = scan.nextInt();

            switch (menuOP) {
                case 1:
                    int estoqueOP;
                    do {
                        System.out.println("\n \n \n \n");
                        System.out.println("MENU ESTOQUE");
                        System.out.println("1. Cadastrar Estoque");
                        System.out.println("2. Listar Estoque");
                        System.out.println("3. Buscar Estoque");
                        System.out.println("4. Sair");
                        System.out.print("Escolha uma opção: ");

                        estoqueOP = scan.nextInt();

                        switch (estoqueOP) {
                            case 1:
                                cadastrarEstoque(estoques, produtos);
                                break;
                            case 2:
                                listarEstoque(estoques);
                                break;
                            case 3:
                                buscarEstoque(estoques, produtos);
                                break;
                            case 4:
                                System.out.println("Voltando ao menu principal!");
                                break;
                            default:
                                System.out.println("Opção inválida. Por favor, escolha uma opção válida.");
                        }
                    } while (estoqueOP != 4);
                    break;

                case 2:
                    int produtoOP;
                    do {
                        System.out.println("\n \n \n \n");
                        System.out.println("MENU PRODUTO");
                        System.out.println("1. Cadastrar produto");
                        System.out.println("2. Listar produto");
                        System.out.println("3. Buscar produto");
                        System.out.println("4. Sair");
                        System.out.print("Escolha uma opção: ");

                        produtoOP = scan.nextInt();

                        switch (produtoOP) {
                            case 1:
                                cadastrarProduto(produtos);
                                break;
                            case 2:
                                listarProdutos(produtos);
                                break;
                            case 3:
                                buscarProduto(produtos);
                                break;
                            case 4:
                                System.out.println("Voltando ao menu principal!");
                                break;
                            default:
                                System.out.println("Opção inválida. Por favor, escolha uma opção válida.");
                        }
                    } while (produtoOP != 4);
                    break;

                case 3:
                    int fornecedorOP;
                    do {
                        System.out.println("\n \n \n \n");
                        System.out.println("MENU FORNECEDOR");
                        System.out.println("1. Cadastrar fornecedor");
                        System.out.println("2. Listar fornecedor");
                        System.out.println("3. Buscar fornecedor");
                        System.out.println("4. Sair");
                        System.out.print("Escolha uma opção: ");

                        fornecedorOP = scan.nextInt();

                        switch (fornecedorOP) {
                            case 1:
                                cadastrarFornecedor();
                                break;
                            case 2:
                                listarFornecedores();
                                break;
                            case 3:
                                buscarFornecedorPorNome();
                                break;
                            case 4:
                                System.out.println("Voltando ao menu principal!");
                                break;
                            default:
                                System.out.println("Opção inválida. Por favor, escolha uma opção válida.");
                        }
                    } while (fornecedorOP != 4);
                    break;

                case 4:
                    System.out.println("Saindo do programa. Adeus!");
                    break;
                default:
                    System.out.println("Opção inválida. Por favor, escolha uma opção válida.");
            }
        } while (menuOP != 4);
    }

    private static Produto encontrarProdutoPorCodigo(List<Produto> produtos, int codigoProduto) {
        for (Produto produto : produtos) {
            if (produto.getCodigo() == codigoProduto) {
                return produto;
            }
        }
        return null;
    }

    public static void cadastrarEstoque(List<Estoque> estoques, List<Produto> produtos) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o Código do Produto: ");
        int codigoProduto = scanner.nextInt();
        scanner.nextLine();

        Produto produtoEncontrado = encontrarProdutoPorCodigo(produtos, codigoProduto);

        if (produtoEncontrado != null) {
            System.out.print("Digite o Armazém: ");
            int armazem = scanner.nextInt();
            scanner.nextLine();

            System.out.print("Digite a Prateleira: ");
            int prateleira = scanner.nextInt();
            scanner.nextLine();

            System.out.print("Digite a Quantidade: ");
            int quantidade = scanner.nextInt();
            scanner.nextLine();

            Estoque estoque = new Estoque(
                    produtoEncontrado.getId(),
                    produtoEncontrado.getCodigo(),
                    produtoEncontrado.getNome(),
                    produtoEncontrado.getDescricao(),
                    produtoEncontrado.getFornecedor(),
                    produtoEncontrado.getdtCad(),
                    armazem,
                    prateleira,
                    quantidade
            );

            estoques.add(estoque);

            System.out.println("Estoque cadastrado com sucesso!");
        } else {
            System.out.println("Produto não encontrado.");
        }
    }

    public static void listarEstoque(List<Estoque> estoques) {
        System.out.println("Lista de Estoques: \n");
        for (Estoque estoque : estoques) {
            System.out.println("Código do Produto: " + estoque.getCodigo());
            System.out.println("Nome do Produto: " + estoque.getNome());
            System.out.println("Armazém: " + estoque.getArmazem());
            System.out.println("Prateleira: " + estoque.getPrateleira());
            System.out.println("Quantidade: " + estoque.getQuantidade());
            System.out.println("------------------------------");
        }
    }

    public static void buscarEstoque(List<Estoque> estoques, List<Produto> produtos) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Digite o código do produto: ");
        int codigoProduto = scan.nextInt();

        for (Estoque estoque : estoques) {
            if (estoque.getCodigo() == codigoProduto) {
                System.out.println("Informações do Estoque:");
                System.out.println("Código do Produto: " + estoque.getCodigo());
                System.out.println("Quantidade em Estoque: " + estoque.getQuantidade());
                System.out.println("Local de Armazenamento - Armazém: " + estoque.getArmazem());
                System.out.println("Local de Armazenamento - Prateleira: " + estoque.getPrateleira());
                System.out.println("------------------------------");
                return;
            }
        }
        System.out.println("Estoque não encontrado para o produto com código " + codigoProduto + ".");
    }

    public static void cadastrarProduto(List<Produto> produtos) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o ID: ");
        int id = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Digite o Código: ");
        int codigo = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Digite o Nome: ");
        String nome = scanner.nextLine();

        System.out.print("Digite a Descrição: ");
        String descricao = scanner.nextLine();

        System.out.print("Digite o Fornecedor: ");
        String fornecedor = scanner.nextLine();

        System.out.print("Digite a Data de Cadastro: ");
        String dtCadastro = scanner.nextLine();

        Produto produto = new Produto(id, codigo, nome, descricao, fornecedor, dtCadastro);
        produtos.add(produto);

        System.out.println("Produto cadastrado com sucesso!");
    }

    public static void listarProdutos(List<Produto> produtos) {
        System.out.println("Lista de Produtos: \n");
        for (Produto produto : produtos) {
            System.out.println("ID: " + produto.getId());
            System.out.println("Código: " + produto.getCodigo());
            System.out.println("Nome: " + produto.getNome());
            System.out.println("Descrição: " + produto.getDescricao());
            System.out.println("Fornecedor: " + produto.getFornecedor());
            System.out.println("Data de Cadastro: " + produto.getdtCad());
            System.out.println("------------------------------");
        }
    }

    public static void buscarProduto(List<Produto> produtos) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Digite o nome do produto: ");
        String nomeProduto = scan.next();

        for (Produto produto : produtos) {
            if (produto.getNome().equalsIgnoreCase(nomeProduto)) {
                System.out.println("Produto encontrado:");
                System.out.println("ID: " + produto.getId());
                System.out.println("Código: " + produto.getCodigo());
                System.out.println("Nome: " + produto.getNome());
                System.out.println("Descrição: " + produto.getDescricao());
                System.out.println("Fornecedor: " + produto.getFornecedor());
                System.out.println("Data de Cadastro: " + produto.getdtCad());
                System.out.println("------------------------------");
                return;
            }
        }
        System.out.println("Produto não encontrado.");
    }

    public static void cadastrarFornecedor() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o ID: ");
        int id = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Digite o tipo de pessoa ('j' para jurídico, 'f' para físico): ");
        char tipoPessoa = scanner.next().charAt(0);
        scanner.nextLine();

        System.out.print("Digite o nome: ");
        String nome = scanner.nextLine();

        System.out.print("Digite a data de nascimento: ");
        String dtNasc = scanner.nextLine();

        System.out.print("Digite a data de cadastro: ");
        String dtCad = scanner.nextLine();

        System.out.println("Digite o telefone: ");
        String telefone = scanner.nextLine();

        System.out.println("Digite o email: ");
        String email = scanner.nextLine();

        System.out.println("Digite o RG, caso seja pessoa fisica e o RPC, caso seja pessoa juridica: ");
        String rgRPC = scanner.nextLine();

        System.out.println("Digite o CPF, caso seja pessoa fisica e o CNPJ, caso seja pessoa juridica: ");
        String cpfCNPJ = scanner.nextLine();

        System.out.println("*ENDEREÇO*");
        System.out.println("Digite o logradouro: ");
        String logradouro = scanner.nextLine();

        System.out.println("*ENDEREÇO*");
        System.out.println("Digite o numero: ");
        String numero = scanner.nextLine();

        System.out.println("*ENDEREÇO*");
        System.out.println("Digite o CEP: ");
        String cep = scanner.nextLine();

        System.out.println("*ENDEREÇO*");
        System.out.println("Digite o bairro: ");
        String bairro = scanner.nextLine();

        System.out.println("*ENDEREÇO*");
        System.out.println("Digite o cidade: ");
        String cidade = scanner.nextLine();

        System.out.println("*ENDEREÇO*");
        System.out.println("Digite o estado: ");
        String estado = scanner.nextLine();

        Fornecedor fornecedor = new Fornecedor(id, tipoPessoa, nome, dtNasc, dtCad,telefone, email, rgRPC, cpfCNPJ, logradouro, numero, cep, bairro, cidade, estado);
        fornecedores.add(fornecedor);

        System.out.println("Fornecedor cadastrado com sucesso!");
    }

    public static void listarFornecedores() {
        System.out.println("Lista de Fornecedores: \n");
        for (Fornecedor fornecedor : fornecedores) {
            System.out.println("ID: " + fornecedor.getId());
            System.out.println("Tipo de Pessoa: " + fornecedor.getTipoPessoa());
            System.out.println("Nome: " + fornecedor.getNome());
            System.out.println("Data de Nascimento: " + fornecedor.getDtNasc());
            System.out.println("Data de Cadastro: " + fornecedor.getDtCad());
            System.out.println("Telefone: " + fornecedor.getTelefone());
            System.out.println("Email: " + fornecedor.getEmail());
            System.out.println("RG/RPC: " + fornecedor.getRgRPC());
            System.out.println("CPF/CNPJ: " + fornecedor.getCpfCNPJ());
            System.out.println("*ENDEREÇO*");
            System.out.println("Logradouro: " + fornecedor.getLogradouro());
            System.out.println("Número: " + fornecedor.getNumero());
            System.out.println("CEP: " + fornecedor.getCep());
            System.out.println("Bairro: " + fornecedor.getBairro());
            System.out.println("Cidade: " + fornecedor.getCidade());
            System.out.println("Estado: " + fornecedor.getEstado());
            System.out.println("------------------------------");
        }
    }

    public static void buscarFornecedorPorNome() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Digite o nome do fornecedor: ");
        String nomeFornecedor = scan.next();

        for (Fornecedor fornecedor : fornecedores) {
            if (fornecedor.getNome().equalsIgnoreCase(nomeFornecedor)) {
                System.out.println("Fornecedor encontrado:");
                System.out.println("ID: " + fornecedor.getId());
                System.out.println("Tipo de Pessoa: " + fornecedor.getTipoPessoa());
                System.out.println("Nome: " + fornecedor.getNome());
                System.out.println("Data de Nascimento: " + fornecedor.getDtNasc());
                System.out.println("Data de Cadastro: " + fornecedor.getDtCad());
                System.out.println("Telefone: " + fornecedor.getTelefone());
                System.out.println("Email: " + fornecedor.getEmail());
                System.out.println("RG/RPC: " + fornecedor.getRgRPC());
                System.out.println("CPF/CNPJ: " + fornecedor.getCpfCNPJ());
                System.out.println("*ENDEREÇO*");
                System.out.println("Logradouro: " + fornecedor.getLogradouro());
                System.out.println("Número: " + fornecedor.getNumero());
                System.out.println("CEP: " + fornecedor.getCep());
                System.out.println("Bairro: " + fornecedor.getBairro());
                System.out.println("Cidade: " + fornecedor.getCidade());
                System.out.println("Estado: " + fornecedor.getEstado());
                System.out.println("------------------------------");
                return;
            }
        }
        System.out.println("Fornecedor não encontrado.");
    }



}

