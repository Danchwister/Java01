package projeto;

public class Classes {
    // atributos
    private int idade;
    private String nome;

    // construtor
    public Classes (int idade, String nome) {
        this.idade = idade;
        this.nome = nome;
    }

    // métodos
    public void imprimirNome() {
        System.out.println("O nome é " + nome);
    }

    public void imprimirIdade() {
        System.out.println("A idade é " + idade);
    }

    // método main
    public static void main(String[] args) {
        Classes objeto = new Classes(30, "João");
        objeto.imprimirNome();
        objeto.imprimirIdade();
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}