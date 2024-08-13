package vetoraula1;
public class VetorAula1 {

    
    public static void main(String[] args) {
        int [] vetorzao = new int[10];
        vetorzao[0] = 3;
        vetorzao[1] = 4;
        vetorzao[2] = 9;
        vetorzao[3] = 13;
        vetorzao[4] = 51;
        vetorzao[5] = 22;
        vetorzao[6] = 33;
        System.out.println("Imprimindo...");
        
        
        for(int i = 0; i < vetorzao.length; i++){
            System.out.println(vetorzao[i]);
        }
        
        System.out.println("Acabou!");
    }

}
