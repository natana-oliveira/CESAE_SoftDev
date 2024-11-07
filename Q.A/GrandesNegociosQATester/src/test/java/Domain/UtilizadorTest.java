package Domain;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UtilizadorTest {

    Utilizador user01;
    Utilizador user02;
    Utilizador user03;
    Utilizador user04;


    @BeforeEach
    void setUp() {
        user01 = new Utilizador("ADMIN", "patrao", "grandesnegocios");
        user02 = new Utilizador("FUNC", "ivone", "costa");
        user03 = new Utilizador("FUNC", "quim", "formacaoDramatica");
        user04 = new Utilizador("ADMIN", "softdev", "softdev");
    }

    @Test
    void getTipoContaTest() {
        assertEquals("ADMIN", user01.getTipoConta());
        assertEquals("FUNC", user02.getTipoConta());
        assertEquals("FUNC", user03.getTipoConta());
        assertEquals("ADMIN", user04.getTipoConta());
    }

    @Test
    void getUsernameTest() {
        assertEquals("patrao", user01.getUsername());
        assertEquals("ivone", user02.getUsername());
        assertEquals("quim", user03.getUsername());
        assertEquals("softdev", user04.getUsername());
    }

    @Test
    void getPasswordTest() {
        assertEquals("grandesnegocios", user01.getPassword());
        assertEquals("costa", user02.getPassword());
        assertEquals("formacaoDramatica", user03.getPassword());
        assertEquals("softdev", user04.getPassword());
    }
}