package SistemaProdutos;

public class Categoria {
    private String nome;
    private String descricao;

    public Categoria(String nome, String descricao) {
        if (nome == null || nome.isEmpty()) {
            throw new IllegalArgumentException("Nome da categoria não pode ser vazio");
        }
        this.nome = nome;
        this.descricao = descricao;
    }

    public String getNome() {
        return nome;
    }

    public String getDescricao() {
        return descricao;
    }
}
