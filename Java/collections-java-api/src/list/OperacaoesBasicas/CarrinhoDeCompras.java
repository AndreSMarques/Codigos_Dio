package list.OperacaoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {

    private List<Item> carrinhoCompras;

    public CarrinhoDeCompras() {
        this.carrinhoCompras = new ArrayList<>();
    }

    public void adicionarItem(String nome, double preco, int quantidade) {
        carrinhoCompras.add(new Item(nome, preco, quantidade));
    }

    public void removerItem(String nome) {
        List<Item> intensParaRemover = new ArrayList<>();
        for (Item i : carrinhoCompras) {
            if(i.getNome().equalsIgnoreCase(nome)){
                intensParaRemover.add(i);
            }
        }
        carrinhoCompras.removeAll(intensParaRemover);
    }

    public double calcularValorTotal() {
    //Calcula e retorna o valor total do carrinho, levando em consideração o preço e a quantidade de cada item.
        double total = 0.0;
        for (Item i : carrinhoCompras) {
            total += i.getPreco() * i.getQuantidade();
        }
        return total;
    }

    public void exibirItens() {
        System.out.println(carrinhoCompras);
    }

    public static void main(String[] args) {
        CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();

        carrinhoDeCompras.adicionarItem("Blusa", 24.0, 3);
        carrinhoDeCompras.adicionarItem("Cuica", 14.0, 4);
        carrinhoDeCompras.adicionarItem("Casaco", 84.0, 1);
        carrinhoDeCompras.adicionarItem("Calça", 54.0, 2);
        carrinhoDeCompras.exibirItens();
        System.out.println(carrinhoDeCompras.calcularValorTotal());
//        carrinhoDeCompras.removerItem("calça");
//        carrinhoDeCompras.exibirItens();
    }

}
