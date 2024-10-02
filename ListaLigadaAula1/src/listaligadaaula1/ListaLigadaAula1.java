package listaligadaaula1;
public class ListaLigadaAula1 {

    
    public static void main(String[] args) {
        
        LIstaLigada<String> lista = new LIstaLigada<String>();
        lista.adicionar("AC");
        lista.adicionar("BA");
        lista.adicionar("CE");
        lista.adicionar("DF");
        System.out.println("Tamanho: " + lista.getTamanho());
        System.out.println("Primeiro: " + lista.getPrimeiro().getValor());
        System.out.println("Ultimo: " + lista.getUltimo().getValor());
        System.out.println("============");
        
        lista.adicionar("SP");
        lista.remover("AC");
        lista.remover("BA");
        lista.remover("CE");
        lista.remover("DF");
        lista.remover("SP");
        lista.adicionar("PE");
        
        System.out.println("Tamanho da lista: " + lista.getTamanho());
        
        for(int i=0; i< lista.getTamanho(); i++){
            System.out.println(lista.get(i).getValor());
            }
        
        
        
        
    }

}
