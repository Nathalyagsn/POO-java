package expessoa;
public class ExPessoa {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Nathalya");
        pessoa.setIdade(24);
        pessoa.setAltura(1.48f);
        pessoa.status();
        
        System.out.println("====================");
        
        Pessoa pessoa2 = new Pessoa();
        pessoa2.setNome("Cláudia");
        pessoa2.setIdade(25);
        pessoa2.setAltura(1.75f);
        pessoa2.status();
    }

}
