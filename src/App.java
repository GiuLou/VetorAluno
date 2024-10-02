public class App {
    public static void main(String[] args) throws Exception {
        Aluno aluno1 = new Aluno();
        aluno1. setNome ("Giu");
        Aluno aluno2 = new Aluno();
        aluno2. setNome ("Gusta");
        Aluno aluno3 = new Aluno();
        aluno3. setNome ("Lele");
        
        System.out.println(aluno2.getNome());
        System.out.println(aluno1.equals(aluno2));
        System.out.println(aluno2.equals(aluno3));
        
        Vetor vetor = new Vetor();
        vetor.add(aluno1);
        vetor.add(3, aluno2);;
        System.out.println(vetor.toString());

        vetor.add(111, aluno3);
    }
}