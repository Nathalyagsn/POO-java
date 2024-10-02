package listaligadaaula1;


public class ProgramaInteiros {
     public static void main(String[] args) {
        LIstaLigada<Integer> numeros = new LIstaLigada<Integer>();
        numeros.adicionar(3);
        numeros.adicionar(4);
        numeros.adicionar(5);
        
        
        System.out.println("Tamanho da lista: " + numeros.getTamanho());
        
        for(int i=0; i< numeros.getTamanho(); i++){
            System.out.println(numeros.get(i).getValor());
            }
    }
}
