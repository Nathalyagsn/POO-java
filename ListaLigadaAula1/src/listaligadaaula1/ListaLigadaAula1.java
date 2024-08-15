package listaligadaaula1;
public class ListaLigadaAula1 {

    
    public static void main(String[] args) {
        
        LIstaLigada lista = new LIstaLigada();
        lista.adicionar("PE");
        lista.adicionar("PB");
        lista.adicionar("CE");
        lista.adicionar("RN");
        System.out.println("Tamanho: " + lista.getTamanho());
        System.out.println("Primeiro: " + lista.getPrimeiro().getValor());
        System.out.println("Ultimo: " + lista.getUltimo().getValor());
        System.out.println(lista.get(0).getValor());
        System.out.println(lista.get(1).getValor());
        System.out.println(lista.get(2).getValor());
        System.out.println(lista.get(3).getValor());
    }

}
