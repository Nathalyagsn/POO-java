package exaula02;
public class Monitor {
    String marca;
    String cor;
    float tamanho;
    boolean ligado;
    
    void status() {
        System.out.println("Modelo:" + this.marca);
        System.out.println("Cor:" + this.cor);
        System.out.println("Tamanho:" + this.tamanho + "cm");
        System.out.println("O monitor está: " + this.ligado);
    }
    
    void usar() {
        if (this.ligado) {
            System.out.println("Estou estudando");
        } else {
            System.out.println("Monitor desligado. Ligue para estudar.");
        }
    }
    
    void desligar() {
        this.ligado = false;
    }

    void ligar() {
        this.ligado = true;
    }
}