import java.math.BigDecimal;

public class Livro extends Produto{
    public Livro(String nome, BigDecimal preço) {
        super(nome, preço);
    }

    @Override
    public String toString() {
        return "Livro{} " + super.toString();
    }
}
