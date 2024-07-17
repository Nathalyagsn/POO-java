package banco;
public class Banco {
    public static void main(String[] args) {
       Conta c1 = new Conta();
       c1.setDono("João");
       c1.setNumConta(8627);
       
    
       c1.setTipo("CP");
       c1.abrirConta();
       c1.exibirInfo();
    }

}
