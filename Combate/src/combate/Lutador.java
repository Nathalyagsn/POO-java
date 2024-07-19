package combate;
public class Lutador {
//Atributos
    private String nome;
    private String nacionaldiade;
    private int idade;
    private float altura;
    private float peso;
    private String categoria;
    private int vitoria;
    private int derrota;
    private  int empate;

//Metodos Publicos
   public void apresentar() {
       System.out.println("Lutador: " + nome);
        System.out.println("Nacionalidade: " + nacionaldiade);
        System.out.println("Idade: " + idade);
        System.out.println("Altura: " + altura);
        System.out.println("Peso: " + peso);
        System.out.println("Categoria: " + categoria);
        System.out.println("Vitórias: " + vitoria);
        System.out.println("Derrotas: " + derrota);
        System.out.println("Empates: " + empate);
        System.out.println("==================================");
   }

   public void status() {
        System.out.print(nome);
        System.out.println(" é um peso " + categoria + ".");
        System.out.println(vitoria + " vitórias.");
        System.out.println(derrota + " derrotas.");
        System.out.println(empate + " empate.");
        System.out.println("==================================");
   }

   public void ganharLuta() {
       this.setVitoria(getVitoria() + 1);
   }

   public void perderLuta() {
       this.setDerrota(getDerrota() + 1);
   }

   public void empatarLuta() {
       this.setEmpate(getEmpate() + 1);
   }

//Metodos Especiais
   public Lutador(String nome, String nacionaldiade, int idade, float altura, float peso, int vitoria, int derrota, int empate) {
        this.nome = nome;
        this.nacionaldiade = nacionaldiade;
        this.idade = idade;
        this.altura = altura;
        this.setPeso(peso);
        this.vitoria = vitoria;
        this.derrota = derrota;
        this.empate = empate;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNacionaldiade() {
        return nacionaldiade;
    }

    public void setNacionaldiade(String nacionaldiade) {
        this.nacionaldiade = nacionaldiade;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
        this.setCategoria();
    }

    public String getCategoria() {
        return categoria;
    }

     private void setCategoria() {
        if (peso < 52.2) {
            categoria = "Inválido";
        } else if (peso <= 70.3) {
            categoria = "Leve";
        } else if (peso <= 83.9) {
            categoria = "Médio";
        } else if (peso <= 120.2) {
            categoria = "Pesado";
        } else {
            categoria = "Inválido";
        }
    }
     
    public int getVitoria() {
        return vitoria;
    }

    public void setVitoria(int vitoria) {
        this.vitoria = vitoria;
    }

    public int getDerrota() {
        return derrota;
    }

    public void setDerrota(int derrota) {
        this.derrota = derrota;
    }

    public int getEmpate() {
        return empate;
    }

    public void setEmpate(int empate) {
        this.empate = empate;
    }


}
