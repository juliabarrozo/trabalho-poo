public class Aluno {
    // declara atributos do tipo privado
    private String nome; 
    private int matricula; 

    // construtor da Classe: inicializa o objeto
    public Aluno (String nome, int matricula) {
        this.nome = nome;
        this.matricula = matricula;
    }

    // o metodo getter é publico e retorna uma String
    public String getNome() {
        return nome;
    }
    public int getMatricula() {
        return matricula;
    }

    // o metodo setter é publico e não retorna nada, ele recebe um parametro do tipo String
    public void setNome(String nome) {
        this.nome = nome; // substitui o atributo nome pelo parametro nome
    }
    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    // esse metodo revela informações retornadas nos getters.
    public void exibirInformações() {
        System.out.println("Nome: " + nome + "\nMatricula: " + matricula);
    }
}