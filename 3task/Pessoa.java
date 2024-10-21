public class Pessoa {
    private String nome;
    private int idade;

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void exibirInformacoes() {
        System.out.println("Nome" + nome);
        System.out.println("Idade" + idade);
    }

    public void isAdult() {
        if (idade >= 18) {
            System.out.println("Voce é maior de idade");
        } else {
            System.out.println("Voce não é maior de idade");
        }
    }
}

class Main {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa("Guilherme", 17);
        System.out.println("Nova pessoa cadastrada:" + pessoa);
        pessoa.isAdult();
    }
}