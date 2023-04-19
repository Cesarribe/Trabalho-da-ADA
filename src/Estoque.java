import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Estoque<T extends Produto> {

    private List<T> listaDeProdutos = new ArrayList<>();

    public void adicionar(T produto) {
        listaDeProdutos.add(produto);
    }

    public void deletar(int id) {
        Optional<T> produto = listaDeProdutos.stream().filter(p -> p.getId() == id).findFirst();
        produto.ifPresent(p -> listaDeProdutos.remove(p));
    }

    public List<T> getLista() {
        return listaDeProdutos;
    }

    public Optional<T> pesquisar(int id) {
        return listaDeProdutos.stream()
                .filter(produto -> produto.getId() == id).findFirst();
    }

    public Optional<T> pesquisar(String nome) {
        return listaDeProdutos.stream()
                .filter(produto -> produto.getNome().equals(nome)).findFirst();
    }
}
