import java.math.BigDecimal;

public class Brinquedo extends Produto {
    public Brinquedo(String nome, BigDecimal preço) {
        super(nome, preço);
    }

    @Override
    public String toString() {
        return "Brinquedo{} " + super.toString();
    }
}
