package aula09;
public class Aula09 {
    public static void main(String[] args) {
        Pessoa [] p = new Pessoa[2];
        Livro [] l = new Livro[3];
        

        p [0] = new Pessoa("Pedro", 22, "M");
        p [1] = new Pessoa("Maria", 25, "F");
        
        
        l [0] = new Livro("O Chamado do Cuco", "JKR", 500, p[1]);
        l [1] = new Livro("Turma da Monica", "Mauricio de Souza", 80, p[0]);
        l [2] = new Livro("Gideon a Nona", "Tamsyn Muir", 500, p[1]);
        
        l[0].abrir();
        l[0].folhear(100);
        l[0].avancarPag();
        System.out.println(l[0].detalhes());
        
    }

}
