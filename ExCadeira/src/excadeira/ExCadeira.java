package excadeira;

public class ExCadeira {

   
    public static void main(String[] args) {
        Cadeira c1 = new Cadeira();
        c1.cor = "Azul";
        c1.modelo = "Gamer";
        c1.altura = 1.45f;
        c1.desconfortavel();
        c1.sentar();
        c1.status();
        
    }

}
