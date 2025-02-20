package SistemaProdutos;

public class Produto {
    private String nome;
    private double preco;
    private boolean status;

    public Produto(String nome, double preco) {
        if (nome == null || nome.isEmpty()) {
            throw new IllegalArgumentException("Nome não pode ser vazio");
        }
        if (preco < 0) {
            throw new IllegalArgumentException("Preço não pode ser negativo");
        }
        this.nome = nome;
        this.preco = preco;
        this.status = false;
    }

    public void ativarProduto() {
        if (preco == 0) {
            throw new IllegalStateException("Produto não pode ser ativado sem preço");
        }
        this.status = true;
    }

    public void desativarProduto() {
        this.status = false;
    }

    public boolean isAtivo() {
        return status;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }
}
