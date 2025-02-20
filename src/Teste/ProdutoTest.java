package Teste;

import SistemaProdutos.Produto;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ProdutoTest {
	
	    @Test
	    public void testCriarProdutoComNomeValido() {
	        Produto produto = new Produto("Produto 1", 10.0);
	        assertNotNull(produto);
	        assertEquals("Produto 1", produto.getNome());
	        assertEquals(10.0, produto.getPreco());
	    }

	    @Test
	    public void testCriarProdutoComNomeVazio() {
	        assertThrows(IllegalArgumentException.class, () -> new Produto("", 10.0));
	    }

	    @Test
	    public void testCriarProdutoComPrecoNegativo() {
	        assertThrows(IllegalArgumentException.class, () -> new Produto("Produto 1", -1.0));
	    }

	    @Test
	    public void testAtivarProduto() {
	        Produto produto = new Produto("Produto 1", 10.0);
	        produto.ativarProduto();
	        assertTrue(produto.isAtivo());
	    }

	    @Test
	    public void testAtivarProdutoSemPreco() {
	        Produto produto = new Produto("Produto 1", 0.0);
	        assertThrows(IllegalStateException.class, produto::ativarProduto);
	    }

	    @Test
	    public void testDesativarProduto() {
	        Produto produto = new Produto("Produto 1", 10.0);
	        produto.ativarProduto();
	        produto.desativarProduto();
	        assertFalse(produto.isAtivo());
	    }
	}
