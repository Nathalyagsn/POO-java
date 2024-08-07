package aula011;
public class Tecnico extends Pessoa{
    protected int registroPro;
    
    public void praticar(){
        System.out.println("Praticando...Conluído.");
    }

    public int getRegistroPro() {
        return registroPro;
    }

    public void setRegistroPro(int registroPro) {
        this.registroPro = registroPro;
    }
}
