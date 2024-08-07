package aula011;
public class Aula011 {

    public static void main(String[] args) {
        //Pessoa p1 = new Pessoa();
        Visitante V1 = new Visitante();
        V1.setNome("José");
        V1.setIdade(22);
        V1.setSexo("M");
        //System.out.println(V1.toString());
        
        Aluno A1 = new Aluno();
        A1.setNome("Raio");
        A1.setMatricula(8627);
        A1.setCurso("Come e Dorme II");
        A1.setIdade(1);
        A1.setSexo("F");
        //A1.pagarMensal();
        
        Bolsista B1 = new Bolsista();
        B1.setCurso("Culinaria");
        B1.setMatricula(14612);
        B1.setNome("Juca");
        B1.pagarMensal();
        
        Tecnico T1 = new Tecnico();
        T1.praticar();
    }

}
