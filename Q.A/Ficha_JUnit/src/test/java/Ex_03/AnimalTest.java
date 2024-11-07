package Ex_03;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AnimalTest {
    Animal tobias;
    Animal fido;
   @BeforeEach
    void setUp() {
        tobias = new Animal("Tobias", Alimento.FRUTAS);
        fido = new Animal("Fido", Alimento.CARNE);
    }
    @Test
    void getNomeTest() {
        assertEquals("Tobias", tobias.getNome());
        assertEquals("Fido", fido.getNome());
    }
    @Test
    void comerTeste() {

        //Começam os dois animais com fome
        assertTrue(tobias.estaComFome());
        assertTrue(fido.estaComFome());

        // Tobias come o que quer
        tobias.comer(Alimento.FRUTAS);

        // Fido não come (não gosta)
        fido.comer(Alimento.PEIXE);

        // Tobias deixa de ter fome
        assertFalse(tobias.estaComFome());

        // Fido continua com fome
        assertTrue(fido.estaComFome());

        //Fido come o que quer
        fido.comer(Alimento.CARNE);

        // Fido deixa de ter fome
        assertFalse(fido.estaComFome());
    }

    @Test
    void getTipoAlimentacao(){
        assertEquals(Alimento.FRUTAS, tobias.getTipoAlimentacao());
        assertEquals(Alimento.CARNE, fido.getTipoAlimentacao());
    }

}
