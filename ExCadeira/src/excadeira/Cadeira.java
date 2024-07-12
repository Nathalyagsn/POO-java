package excadeira;


public class Cadeira {
String cor;
String modelo;
float altura;
boolean conforto;

void status() {
    System.out.println("A cor da cadeira é: " + this.cor);
    System.out.println("O modelo da cadeira é: " + this.modelo);
    System.out.println("A altura da cadeira é: " + this.altura + "cm");
    System.out.println("A cadeira é " + this.conforto);
    }

void sentar() {
    if (conforto) {
        System.out.println("Confortável, pode sentar."); 
    } else {
        System.out.println("Desconfortável, impossível sentar.");
    }
}
    
    
void confortavel() {
    this.conforto = true;
    }

void desconfortavel() {
    this.conforto = false;
    }
}


