import java.util.List;

public class Impressora<T> {
    public <U extends T> void listarProdutos(List<U> lista) {
        lista.forEach(System.out::println);
    }
}
