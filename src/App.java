public class App {
    public static void main(String[] args) throws Exception {

        // cria uma instancia de Aluno
        Aluno aluno1 = new Aluno("Carol", 20527638);

        // chama o metodo que exibe informações
        System.out.println("- Informações -");
        aluno1.exibirInformações();

        // chama os setters estabelecendo parametros e muda as informações estabelecidas inicialmente
        aluno1.setNome("Mariana");
        aluno1.setMatricula(12345678);

        // chama o metodo que exibe informações novamente
        System.out.println("- Informações Atualizadas -");
        aluno1.exibirInformações();
    }
}
