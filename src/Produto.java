//criado dia 31/10/23 -Francisco
//Produto (id, código, nome, descrição, fornecedor, dataCadastro…)
//        - Cadastrar Produto
//        - Buscar Produto por Nome
//        - Listar Produtos
//        - Deletar Produto
public class Produto {
    private int id, codigo;
    private String nome, descricao, fornecedor, dtCad;

    public Produto() {
    }

    public Produto(int id, int codigo, String nome, String descricao, String fornecedor, String dtCad) {
        this.id = id;
        this.codigo = codigo;
        this.nome = nome;
        this.descricao = descricao;
        this.fornecedor = fornecedor;
        this.dtCad = dtCad;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescrição(String descricao) {
        this.descricao = descricao;
    }

    public String getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(String fornecedor) {
        this.fornecedor = fornecedor;
    }

    public String getdtCad() {
        return dtCad;
    }

    public void setdtCad(String dtCad) {
        this.dtCad = dtCad;
    }
}
