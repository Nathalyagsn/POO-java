package polimorfismo;
public class Arara extends Ave{

    @Override
    public void locomover(){
        System.out.println("Voando no Zoologico");
    }
    
    @Override
    public void emitirSom(){
        System.out.println("Gritando");
    }
}
