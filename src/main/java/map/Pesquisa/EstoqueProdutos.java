package main.java.map.Pesquisa;

import java.util.HashMap;
import java.util.Map;

public class EstoqueProdutos {
    private Map<Long, Produto> estoqueProdutosMap;

    public EstoqueProdutos() {
        this.estoqueProdutosMap = new HashMap<>();
    }

    public void adicionarProduto(long cod, String nome, double preco, int quantidade) {
        estoqueProdutosMap.put(cod, new Produto(nome, preco, quantidade));
    }

    public void exibirProdutos() {
        System.out.println(estoqueProdutosMap);
    }

    public double calcularValorTotalEstoque() {
        double valorTotalEstoque = 0;
        if (!estoqueProdutosMap.isEmpty()) {
            for (Produto p : estoqueProdutosMap.values()) {
                valorTotalEstoque += p.getQuantidade() * p.getPreco();
            }
        }
        return valorTotalEstoque;
    }

    public Produto obterProdutoMaisCaro() {
        Produto produtoMaisCaro = null;
        double maiorPreco = Double.MIN_VALUE;
        if (!estoqueProdutosMap.isEmpty()) {
            for (Produto p : estoqueProdutosMap.values()) {
                if (p.getPreco() > maiorPreco) {
                    produtoMaisCaro = p;
                }
            }
        }
        return produtoMaisCaro;
    }

    public static void main(String[] args) {
        EstoqueProdutos estoqueProdutos = new EstoqueProdutos();

        estoqueProdutos.adicionarProduto(1l,"Produto A", 5, 10);
        estoqueProdutos.adicionarProduto(2l,"Produto B", 10, 5);
        estoqueProdutos.adicionarProduto(3l,"Produto C", 15, 2);
        estoqueProdutos.adicionarProduto(4l,"Produto D", 20, 2);

        estoqueProdutos.exibirProdutos();

        System.out.println("Valor total do Estoque: " + estoqueProdutos.calcularValorTotalEstoque());
        System.out.println("Produto mais caro: " + estoqueProdutos.obterProdutoMaisCaro());
    }
}
