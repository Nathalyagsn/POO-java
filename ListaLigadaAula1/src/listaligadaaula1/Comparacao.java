package listaligadaaula1;

import java.util.ArrayList;


public class Comparacao {
    public static void main(String[] args) {
        LIstaLigada<Integer> lista = new LIstaLigada<Integer>();
        
        ArrayList<Integer> vetor = new ArrayList<Integer>();
        
         int limite = 1000;
         long tempoInicial = System.currentTimeMillis();
         long tempoFinal;
         for(int i=0; i < limite; i++){
           vetor.add(i);
         }
         tempoFinal = System.currentTimeMillis();
         System.out.println("Adicionou " + limite + " elementos no vetor");
         System.out.println(tempoFinal - tempoInicial);
         
         tempoInicial = System.currentTimeMillis();
         for(int i=0; i < limite; i++){
           lista.adicionar(i);
         }
         tempoFinal = System.currentTimeMillis();
         System.out.println("\n\nAdicionou " + limite + " elementos na lista");
         System.out.println(tempoFinal - tempoInicial);
         
         tempoInicial = System.currentTimeMillis();
         for(int i = 0; i < vetor.size(); i++){
             vetor.get(i);
        }
        tempoFinal = System.currentTimeMillis();
        System.out.println("\n\nTempo de leitura do vetor");
        System.out.println(tempoFinal - tempoInicial);
        
        tempoInicial = System.currentTimeMillis();
        for(int i = 0; i < lista.getTamanho(); i++){
            lista.get(i);
        }
        tempoFinal = System.currentTimeMillis();
        System.out.println("\n\nTempo de leitura da lista");
        System.out.println(tempoFinal - tempoInicial);
    }
}
