package banco;
public class Conta {
    private int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean situacao;
    
    public void Construtor() {
       saldo = 0;
       situacao = false;
   }
    
   public void abrirConta() {
       tipo = tipo;
       situacao = true;
       if (tipo.equals("CC")){
           saldo = 50;
           System.out.println("Conta corrente aberta com sucesso. Saldo inicial de R$50,00.");
           System.out.println("===============================================================");
       } else if (tipo.equals("CP")) {
           saldo = 150;
           System.out.println("Conta poupança aberta com sucesso. Saldo inicial de R$150,00.");
           System.out.println("===============================================================");
       }
   }
   
        
    // getter and setter
    public int getNumConta() {
        return numConta;
    }
    
    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }
    
    public String getTipo() {
        return tipo;
    }
    
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    public String getDono() {
        return dono;
    }
    
    public void setDono(String dono) {
        this.dono = dono;
    }
    
    public float getSaldo() {
        return saldo;
    }
    
    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }
    
    public boolean getSituacao() {
        return situacao;
    }
    
    public void setSituacao(boolean situacao) {
        this.situacao = situacao;
    }
    
    // depositar 
    public void depositar(double valor) {
        this.saldo += valor;
    }
    
    //sacar 
    public void sacar(double valor) {
        if(this.saldo >= valor) {
            this.saldo -= valor;
        } else {
            System.out.println("Sacando..." + valor);
            System.out.println("Saldo Insuficiente!");
        }
    }
    
    
    
    public void exibirInfo() {
        System.out.println("Número da Conta: " + this.numConta);
        System.out.println("Tipo de Conta: " + this.tipo);
        System.out.println("Dono da Conta: " + this.dono);
        System.out.println("Saldo: " + this.saldo);
    }
    
}
