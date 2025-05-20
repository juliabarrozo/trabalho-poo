public class App {
    public static void main(String[] args) throws Exception {
        Aluno aluno1 = new Aluno("Carol", 20527638);

        aluno1.exibirInformações();

        aluno1.setNome("Mariana");
        aluno1.setMatricula(12345678);

        aluno1.exibirInformações();
    }
}
