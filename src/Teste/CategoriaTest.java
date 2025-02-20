package Teste;

import SistemaProdutos.Categoria;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CategoriaTest {


	    @Test
	    public void testCriarCategoriaComNomeValido() {
	        Categoria categoria = new Categoria("Categoria 1", "Descrição da Categoria");
	        assertNotNull(categoria);
	        assertEquals("Categoria 1", categoria.getNome());
	        assertEquals("Descrição da Categoria", categoria.getDescricao());
	    }

	    @Test
	    public void testCriarCategoriaComNomeVazio() {
	        assertThrows(IllegalArgumentException.class, () -> new Categoria("", "Descrição"));
	    }
	}

