package exlivraria;
public class Livraria {
    private String titulo;
    private String autor;
    private float preco;
    private boolean dispEstoq;
    
    
    public String getTitulo() {
        return titulo;
    }
    
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    
    public String getAutor() {
        return autor;
    }
    
    public void setAutor(String autor) {
        this.autor = autor;
    }
    
    public float getPreco() {
        return preco;
    }
    
    public void setPreco(float preco) {
        this.preco = preco;
    }
    
    public boolean getdispEstoq() {
        return dispEstoq;
    }
    
    public void setdisEstoq( boolean dispEstoq) {
        this.dispEstoq = dispEstoq;
    }
    
    public void comprar() {
        if (dispEstoq) {
            System.out.println("Disponivel em estoque");
        } else {
            System.out.println("Indisponivel para compra.");
        }
    }
    
    
    public void disponivel() {
        this.dispEstoq = true;
    }
    
    public void indisponivel() {
        this.dispEstoq = false;
    }
    
    public void status() {
        System.out.println("Título: " + this.titulo);
        System.out.println("Autor: " + this.autor);
        System.out.println("Preço: R$" + this.preco);
        System.out.println("Em estoque: " + (this.dispEstoq ? "Sim" : "Não"));
    }
}
