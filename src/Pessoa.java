//criado dia 31/10/23 -Francisco

// Pessoa - Fornecedor (id, Nome, CNPJ, logradouro, bairro, cidade, estado, cep, cpf,
// rg, telefone, email, dataCadastro, dataNascimento…)
// - Cadastrar Fornecedor
// - Buscar Fornecedor por Nome
// - Listar Fornecedor
// - Deletar Fornecedor

//a classe fornecedor vai conter um extend da classe Pessoa
//afim de explorar a ideia de abstração

public class Pessoa {
    private int id;
    private char tipoPessoa;
    private String nome, dtNasc, dtCad;
    private String telefone, email, rgRPC, cpfCNPJ;
    private String logradouro, numero, cep, bairro, cidade, estado;


    public Pessoa(int id, char tipoPessoa, String nome, String dtNasc, String dtCad, String telefone, String email, String rgRPC, String cpfCNPJ, String logradouro, String numero, String cep, String bairro, String cidade, String estado) {
        this.id = id;
        this.tipoPessoa = tipoPessoa;
        this.nome = nome;
        this.dtNasc = dtNasc;
        this.dtCad = dtCad;
        this.telefone = telefone;
        this.email = email;
        this.rgRPC = rgRPC;
        this.cpfCNPJ = cpfCNPJ;
        this.logradouro = logradouro;
        this.numero = numero;
        this.cep = cep;
        this.bairro = bairro;
        this.cidade = cidade;
        this.estado = estado;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public char getTipoPessoa() {
        return tipoPessoa;
    }

    public void setTipoPessoa(char tipoPessoa) {
        this.tipoPessoa = tipoPessoa;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDtNasc() {
        return dtNasc;
    }

    public void setDtNasc(String dtNasc) {
        this.dtNasc = dtNasc;
    }

    public String getDtCad() {
        return dtCad;
    }

    public void setDtCad(String dtCad) {
        this.dtCad = dtCad;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getRgRPC() {
        return rgRPC;
    }

    public void setRgRPC(String rgRPC) {
        this.rgRPC = rgRPC;
    }

    public String getCpfCNPJ() {
        return cpfCNPJ;
    }

    public void setCpfCNPJ(String cpfCNPJ) {
        this.cpfCNPJ = cpfCNPJ;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}
