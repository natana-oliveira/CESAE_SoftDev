package Domain;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VendaTest {

    Venda venda01;
    Venda venda02;
    Venda venda03;


    @BeforeEach
    void setUp() {
        venda01 = new Venda("Alimentacao", "Queijo",10,9.50);
        venda02 = new Venda("Higiene", "Amaciador da Roupa",40,4.99);
        venda03 = new Venda("Produtos para Casa", "Vassoura",20,7.99);
    }

    @Test
    void getTipoProdutoTest() {
        assertEquals("Alimentacao", venda01.getTipoProduto());
        assertEquals("Higiene", venda02.getTipoProduto());
        assertEquals("Produtos para Casa", venda03.getTipoProduto());
    }

    @Test
    void getProdutoTest() {
        assertEquals("Queijo", venda01.getProduto());
        assertEquals("Amaciador da Roupa", venda02.getProduto());
        assertEquals("Vassoura", venda03.getProduto());
    }

    @Test
    void getQuantidadeVendidaTest() {
        assertEquals(10, venda01.getQuantidadeVendida());
        assertEquals(40, venda02.getQuantidadeVendida());
        assertEquals(20, venda03.getQuantidadeVendida());
    }

    @Test
    void getPrecoUnitarioTest() {
        assertEquals(9.50, venda01.getPrecoUnitario());
        assertEquals(4.99, venda02.getPrecoUnitario());
        assertEquals(7.99, venda03.getPrecoUnitario());
    }
}