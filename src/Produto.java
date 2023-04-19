import java.math.BigDecimal;

public abstract class Produto {

    private static int idCount = 1;
    private int id;
    private String nome;
    private BigDecimal preco;

    public Produto(String nome, BigDecimal preco) {
        this.id = idCount++;
        this.nome = nome;
        this.preco = preco;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public BigDecimal getPreco() {
        return preco;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", preço=" + preco +
                '}';
    }
}