package combate;

import java.util.Random;

public class Luta {

    private Lutador desafiado;
    private Lutador desafiante;
    private int rounds;
    private boolean aprovada;
    
    public Luta() {
        this.aprovada = false;
    }

    public Lutador getDesafiado() {
        return desafiado;
    }

    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }

    public Lutador getDesafiante() {
        return desafiante;
    }

    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }

    public int getRounds() {
        return rounds;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    public boolean isAprovada() {
        return aprovada;
    }

    public void setAprovada(boolean aprovada) {
        this.aprovada = aprovada;
    }
    
    //especiais
    
    public void marcarLuta(Lutador l1, Lutador l2) {
        if(l1.getCategoria().equals(l2.getCategoria()) && l1 != l2){
            this.aprovada = true;
            this.desafiado = l1;
            this.desafiante = l2;
        } else {
            this.aprovada = false;
            this.desafiado = null;
            this.desafiante = null;
        }
    }
    
    
    public void lutar() {
        if (this.aprovada) {
            System.out.println("======= DESAFIADO =======");
            desafiado.apresentar();
            System.out.println("======= DESAFIANTE =======");
            desafiante.apresentar();
            
            Random random = new Random();
            int resultado = random.nextInt(3);
            
            System.out.println("======= RESULTADO DA LUTA =======");
            
            switch(resultado) {
                case 0:
                    System.out.println("EMPATE.");
                    desafiado.empatarLuta();
                    desafiante.empatarLuta();
                    break;
                    
                case 1:
                    System.out.println("Vitória do: " + desafiado.getNome());
                    desafiado.ganharLuta();
                    desafiante.perderLuta();
                    break;
                    
                case 2:
                    System.out.println("Vitória do: " + desafiante.getNome());
                    desafiado.perderLuta();
                    desafiante.ganharLuta();
                    break;
            }
            System.out.println("===================================");
        } else {
            System.out.println("A luta não pode acontecer.");
        }   
    } 
}
