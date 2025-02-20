package SistemaProdutos;

public class Estoque {
    private Produto produto;
    private int quantidade;

    public Estoque(Produto produto, int quantidade) {
        if (quantidade < 0) {
            throw new IllegalArgumentException("Quantidade não pode ser negativa");
        }
        this.produto = produto;
        this.quantidade = quantidade;
    }

    public Produto getProduto() {
        return produto;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void adicionarEstoque(int quantidade) {
        if (quantidade < 0) {
            throw new IllegalArgumentException("Quantidade a ser adicionada não pode ser negativa");
        }
        this.quantidade += quantidade;
    }

    public void removerEstoque(int quantidade) {
        if (quantidade < 0) {
            throw new IllegalArgumentException("Quantidade a ser removida não pode ser negativa");
        }
        if (this.quantidade < quantidade) {
            throw new IllegalStateException("Quantidade em estoque insuficiente");
        }
        this.quantidade -= quantidade;
    }
}
