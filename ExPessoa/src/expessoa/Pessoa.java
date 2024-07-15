package expessoa;
public class Pessoa {
    public String nome;
    public int idade;
    public float altura;
    
    public String getNome() {
        return nome;
        
    }
    
    public void setNome(String Nome) {
       this.nome = Nome;
       
    }
    
    
    public int getIdade() {
        return idade;
        
    }
    
    public void setIdade(int Idade) {
        this.idade = Idade;
        
    }
    
    public float getAltura() {
        return altura;
        
    }
    
    public void setAltura(float Altura) {
        this.altura = Altura;
    }
    
    public void status() {
        System.out.println("Nome: " + this.getNome());
        System.out.println("Idade: " + this.getIdade());
        System.out.println("Altura: " + this.getAltura());
    }
}
