public class Aluno {

    private String nome;

    private int matricula;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public void cadastrarAluno(int matricula){
        setMatricula(matricula);
    }

    // metodo para imprimir o nome declarado

    public void imprimirNome(){
        System.out.println("Nome = " + this.nome);
    }


    // metodo para imprimir a matricula declarada

    public void imprimirMatricula(){
        System.out.println("Matrícula = " + this.matricula);
    }
}
