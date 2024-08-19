package polimorfismo;
public class Tartaruga extends Reptil {
    
    @Override
    public void locomover(){
        System.out.println("Andando devagar");
    }
    
    @Override
    public void alimentar(){
        System.out.println("Comendo alface");
    }
    
    public void esconder(){
        System.out.println("Se esconde no casco");
    }

}
