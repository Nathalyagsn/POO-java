package polimorfismo;
public class Cachorro extends Mamifero {

    @Override
    public void locomover(){
        System.out.println("Andando euforico");
    }
    
    @Override
    public void emitirSom(){
        System.out.println("Latindo");
    }
}
