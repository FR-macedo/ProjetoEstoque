//criado dia 31/10/23 -Francisco
//Estoque (produto, quantidade, armazen, prateleira…)
//        - Atualizar Estoque de produtos
//        - Adicionar Estoque de produtos
//        - Remover Estoque de produtos
//        - Listar Produtos Disponíveis
public class Estoque extends Produto{
    private int armazem, prateleira, quantidade;

    public Estoque(int armazem, int prateleira, int quantidade) {
        this.armazem = armazem;
        this.prateleira = prateleira;
        this.quantidade = quantidade;
    }

    public Estoque(int id, int codigo, String nome, String descricao, String fornecedor, String dtCad, int armazem, int prateleira, int quantidade) {
        super(id, codigo, nome, descricao, fornecedor, dtCad);
        this.armazem = armazem;
        this.prateleira = prateleira;
        this.quantidade = quantidade;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public int getArmazem() {
        return armazem;
    }

    public void setArmazem(int armazem) {
        this.armazem = armazem;
    }

    public int getPrateleira() {
        return prateleira;
    }

    public void setPrateleira(int prateleira) {
        this.prateleira = prateleira;
    }
}
