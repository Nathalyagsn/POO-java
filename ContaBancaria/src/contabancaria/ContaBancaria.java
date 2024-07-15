package contabancaria;
public class ContaBancaria {
    public static void main(String[] args) {
        Banco c1 = new Banco();
        c1.setTitular("José");
        c1.setNumeroConta(433215);
        c1.setSaldo(100);
        c1.status();
        System.out.println("=====================");
        
        //deposito funcional
        
        //c1.depositar(50);
        //System.out.println("Novo depósito detectado...");
        //System.out.println("Novo saldo: " + c1.saldo);
        
        //saque funcional
        //c1.sacar(50);
        //System.out.println("Novo saque detectado...");
        //System.out.println("Novo saldo:R$" + c1.saldo);
        
        c1.sacar(200);
    }

}
