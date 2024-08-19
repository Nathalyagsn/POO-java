package polimorfismo;
public class Goldfish extends Peixe {
    @Override
    public void locomover() {
        System.out.println("Nadando no aquário");
    }
    
    @Override
    public void alimentar(){
        System.out.println("Comendo ração premium");
    }
}
