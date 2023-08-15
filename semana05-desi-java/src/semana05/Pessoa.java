package semana05;

public class Pessoa {

    public Pessoa(String cpf, String nome, String endereco, String telefone) {
        this.nome = nome;
        if (this.validaCPF(cpf)) {
            this.cpf = cpf;
        }
        this.endereco = endereco;
        this.telefone = telefone;

    }

    public String getCpf() {
        return cpf;
    }

    public String getNome() {
        return nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    private String nome;
    private String endereco;
    private String telefone;
    private String cpf;

    private boolean validaCPF(String cpf) {
        return true;
    }

}
