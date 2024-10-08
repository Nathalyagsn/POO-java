package listaligadaaula1;


public class Cliente {
    private String cpf;
    private String nome;

    public Cliente(String novoCpf, String novoNome) {
        this.cpf = novoCpf;
        this.nome = novoNome;
    }
    

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Cliente{" + "cpf=" + cpf + ", nome=" + nome + '}';
    }
}
