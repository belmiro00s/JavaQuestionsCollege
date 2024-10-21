import java.util.ArrayList;
import java.util.List;

class CompanhiaAerea {
    private String nome;
    private ArrayList<Voo> voos;

    public CompanhiaAerea(String nome) {
        this.nome = nome;
        this.voos = new ArrayList<Voo>();
    }

    public void adicionarVoo(Voo voo) {
        voos.add(voo);
    }

    public String getNome() {
        return nome;
    }

    public List<Voo> getVoos() {
        return voos;
    }
}

class Passagem {
    private Voo voo;
    private String nomePassageiro;
    private double preco;
    private String aeroportoOrigem;
    private String aeroportoDestino;

    public Passagem(Voo voo, String nomePassageiro, String aeroportoOrigem, String aeroportoDestino, double preco) {
        this.voo = voo;
        this.nomePassageiro = nomePassageiro;
        this.preco = preco;
        this.aeroportoOrigem = aeroportoOrigem;
        this.aeroportoDestino = aeroportoDestino;

    }

    // corrigido problema 2
    public double calcularPrecoTotal(double taxaEmbarque) {
        return preco + taxaEmbarque;
    }

    public String getNomePassageiro() {
        return nomePassageiro;
    }

    public String getOrigemAeroporto() {
        return aeroportoOrigem;
    }

    public String getDestinoAeroporto() {
        return aeroportoDestino;
    }
}

class Voo {
    private String codigo;
    private int totalAssentos;
    private int assentosOcupados;

    public Voo(String codigo, int totalAssentos) {
        this.codigo = codigo;
        this.totalAssentos = totalAssentos;
        this.assentosOcupados = 0;
    }

    // problema 1 corrigido
    public void reservarAssento(int assentos) {
        if (assentosOcupados >= totalAssentos) {
            System.err.println("Todos assentos estao ocupados");
        } else if (assentosOcupados + assentos > totalAssentos) {
            System.err.println("Não há assentos suficientes disponíveis");
        } else {
            assentosOcupados += assentos;
        }
    }

    // problema 3 corrigido
    public int getAssentosDisponiveis() {
        return totalAssentos - assentosOcupados;
    }

    public String getCodigo() {
        return codigo;
    }
}
