package exaula06;
public class ExAula06 {
    public static void main(String[] args) {
        Pagamento p1 = new Pagamento();
        p1.setNome("José");
        p1.setTipoPag("Boleto");
        p1.setValor(60);
        p1.status();
        p1.processarPagamentoBoleto();
        
        Pagamento p2 = new Pagamento();
        p2.setNome("Maria");
        p2.setTipoPag("Pix");
        p2.setValor(60);
        p2.status();
        p2.processarPagamentoPix();
        
        Pagamento p3 = new Pagamento();
        p3.setNome("Gideon");
        p3.setTipoPag("Credito");
        p3.setValor(60);
        p3.status();
        p3.processarPagamentoCredito();
        
        
    }

}
