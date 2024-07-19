package exaula06;
public class Pagamento implements Pagador {
    
    public String nome;
    public String tipoPag;
    public float valor;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipoPag() {
        return tipoPag;
    }

    public void setTipoPag(String tipoPag) {
        this.tipoPag = tipoPag;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }
    
    

    @Override
    public void processarPagamentoPix() {
        System.out.println("Processando pagamento Pix...");  
        if("Pix".equals(tipoPag)) {
            float valorDesconto = valor - 2.0f;
            System.out.println("Pagamento via Pix para o valor R$" + valorDesconto + " concluido.");
        }
    }

    @Override
    public void processarPagamentoBoleto() {
        System.out.println("Processando pagamento Boleto...");
        if("Boleto".equals(tipoPag)) {
            System.out.println("Pagamento via Boleto para o valor R$" + valor + " concluido.");
    
        }
        
    }

    @Override
    public void processarPagamentoCredito() {
        System.out.println("Processando pagamento Credito");
        if("Credito".equals(tipoPag)) {
            float valorTaxa = valor + 5.0f;
            System.out.println("Pagamento via Credito para o valor R$" + valorTaxa + " concluido");
        }
        
    }
    
    public void status() {
        System.out.println("====================================================");
        System.out.println("Nome: " + nome);
        System.out.println("Tipo de pagamento: " + tipoPag);
        System.out.println("Valor: " + valor);
    }

}
