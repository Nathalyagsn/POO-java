package banco;
public class Banco {
    public static void main(String[] args) {
       Conta c1 = new Conta();
       c1.setDono("João");
       c1.setNumConta(8627);
       
    
       c1.setTipo("CC");
       c1.abrirConta();
       c1.sacar(50);
       c1.pagarMensal();
       c1.exibirInfo();
    }

}
