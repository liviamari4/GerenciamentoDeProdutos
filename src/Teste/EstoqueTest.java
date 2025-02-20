package Teste;


import SistemaProdutos.Produto;
import SistemaProdutos.Estoque;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class EstoqueTest {
	
	

	    @Test
	    public void testCriarEstoqueComQuantidadeValida() {
	        Produto produto = new Produto("Produto 1", 10.0);
	        Estoque estoque = new Estoque(produto, 10);
	        assertNotNull(estoque);
	        assertEquals(10, estoque.getQuantidade());
	    }

	    @Test
	    public void testCriarEstoqueComQuantidadeNegativa() {
	        Produto produto = new Produto("Produto 1", 10.0);
	        assertThrows(IllegalArgumentException.class, () -> new Estoque(produto, -5));
	    }

	    @Test
	    public void testAdicionarEstoque() {
	        Produto produto = new Produto("Produto 1", 10.0);
	        Estoque estoque = new Estoque(produto, 10);
	        estoque.adicionarEstoque(5);
	        assertEquals(15, estoque.getQuantidade());
	    }

	    @Test
	    public void testAdicionarEstoqueQuantidadeNegativa() {
	        Produto produto = new Produto("Produto 1", 10.0);
	        Estoque estoque = new Estoque(produto, 10);
	        assertThrows(IllegalArgumentException.class, () -> estoque.adicionarEstoque(-5));
	    }

	    @Test
	    public void testRemoverEstoque() {
	        Produto produto = new Produto("Produto 1", 10.0);
	        Estoque estoque = new Estoque(produto, 10);
	        estoque.removerEstoque(5);
	        assertEquals(5, estoque.getQuantidade());
	    }

	    @Test
	    public void testRemoverEstoqueQuantidadeInsuficiente() {
	        Produto produto = new Produto("Produto 1", 10.0);
	        Estoque estoque = new Estoque(produto, 10);
	        assertThrows(IllegalStateException.class, () -> estoque.removerEstoque(15));
	    }

	    @Test
	    public void testRemoverEstoqueQuantidadeNegativa() {
	        Produto produto = new Produto("Produto 1", 10.0);
	        Estoque estoque = new Estoque(produto, 10);
	        assertThrows(IllegalArgumentException.class, () -> estoque.removerEstoque(-5));
	    }
	}
