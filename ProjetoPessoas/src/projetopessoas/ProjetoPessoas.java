package projetopessoas;


public class ProjetoPessoas {

    
    public static void main(String[] args) {
        // TODO code application logic here
        Pessoa p1 = new Pessoa();
        Aluno p2 = new Aluno();
        Professor p3 = new Professor();
        Funcionario p4 = new Funcionario();
        
        p1.setNome("Claudia");
        p2.setNome("Nathalya");
        p3.setNome("Raio");
        p4.setNome("Joca");
        
        p1.setSexo("M");
        p4.setSexo("F");
        
        
        p2.setIdade(24);
        
        p2.setCurso("ADS");
        
        p3.setSalario(2364.54f);
        
        p4.setSetor("Estoque");
        
        p3.receberAum(550);
        
        p4.mudarTrabalho();
        
        p2.cancelarMatr();
        
        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p3.toString());
        System.out.println(p4.toString());
    }

}
