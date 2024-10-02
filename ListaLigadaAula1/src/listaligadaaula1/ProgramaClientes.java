package listaligadaaula1;
public class ProgramaClientes {
    public static void main(String[] args) {
        LIstaLigada<Cliente> clientes = new LIstaLigada<Cliente>();
        clientes.adicionar(new Cliente("123", "Jose"));
        clientes.adicionar(new Cliente("456", "Joca"));
        clientes.adicionar(new Cliente("768", "Jabulani"));
        
        System.out.println("Tamanho da lista: " + clientes.getTamanho());
        
        for(int i=0; i< clientes.getTamanho(); i++){
            System.out.println(clientes.get(i).getValor());
            }


    }
}
