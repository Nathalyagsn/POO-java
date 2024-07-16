package contabancaria;
public class Banco {
    public int numeroConta;
    public double saldo;
    public String titular;
    
    public int getNumeroConta() {
        return numeroConta; 
    }
    
    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }
    
    public double getSaldo() {
        return saldo;
    }
    
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    public String getTitular() {
        return titular;
    }
    
    public void setTitular(String titular) {
        this.titular = titular;
    }
    
    //metodo para depositar
    public void depositar(double valor) { 
        this.saldo += valor;
    }
    
    public void sacar (double valor) {
        if(this.saldo >= valor) {
            this.saldo -= valor;
        } else {
            System.out.println("Sacando... " + valor);
            System.out.println("Saldo Insuficiente!");
        }
    }
    
    public void status() {
        System.out.println("Nome do títular: " + this.getTitular());
        System.out.println("Número da conta: " + this.getNumeroConta());
        System.out.println("Saldo Dispnível:R$" + this.getSaldo());
    }
}
