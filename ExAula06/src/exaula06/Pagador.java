package exaula06;

public interface Pagador {
    public abstract void processarPagamentoPix();
    public abstract void processarPagamentoBoleto();
    public abstract void processarPagamentoCredito();
}
