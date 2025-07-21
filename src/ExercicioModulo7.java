/**
 * @author Ernandes Oliveira
 *
 * Exemplo de cadastro de alunos em discplinas ministradas por professores em um curso.
 */

public class ExercicioModulo7 {

    public static void main (String args[]){
        Aluno aluno = new Aluno();
        aluno.cadastrarAluno(123);
        aluno.setNome("João");
        aluno.imprimirNome();
        aluno.imprimirMatricula();
    }

}
