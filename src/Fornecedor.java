//criado dia 31/10/23 -Francisco

import java.util.*;
// Pessoa - Fornecedor (id, Nome, CNPJ, logradouro, bairro, cidade, estado, cep, cpf,
// rg, telefone, email, dataCadastro, dataNascimento…)
// - Cadastrar Fornecedor
// - Buscar Fornecedor por Nome
// - Listar Fornecedor
// - Deletar Fornecedor

//a classe fornecedor vai conter um extend da classe Pessoa
//afim de explorar a ideia de abstração
public class Fornecedor extends Pessoa {


    public Fornecedor(int id, char tipoPessoa, String nome, String dtNasc, String dtCad, String telefone, String email, String rgRPC, String cpfCNPJ, String logradouro, String numero, String cep, String bairro, String cidade, String estado) {
        super(id, tipoPessoa, nome, dtNasc, dtCad, telefone, email, rgRPC, cpfCNPJ, logradouro, numero, cep, bairro, cidade, estado);
    }


    
}
