package exlivraria;
public class ExLivraria {
    public static void main(String[] args) {
        Livraria livro = new Livraria();
        livro.setTitulo("Harry Potter");
        livro.setAutor("JKR");
        livro.setPreco(89.99f);
        //livro.disponivel();
        livro.comprar();
        livro.status();
        
    }

}
