package exproduto;
public class Produto {
    public String nome;
    public float preco;
    public int quantidade;
    
    public String getNome() {
        return nome;
    }
    
    public void setNome(String Nome) {
        this.nome = Nome;
    }
    
    public float getPreco() {
        return preco;
    }
    
    public void setPreco(float Preco) {
        this.preco = Preco;
    }
    
    public int getQuantidade() {
        return quantidade;
    }
    
    public void setQuantidade(int Quantidade) {
        this.quantidade = Quantidade;
    }
    
    public void status() {
        System.out.println("LISTA DE COMPRAS");
        System.out.println("");
        System.out.println("Nome do produto: " + this.getNome());
        System.out.println("Valor pago:R$" + this.getPreco() );
        System.out.println("Quantidade: " + this.getQuantidade());
    }
}
