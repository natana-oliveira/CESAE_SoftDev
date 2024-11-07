package Controllers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.FileNotFoundException;

import static org.junit.jupiter.api.Assertions.*;

class LoginControllerTest {

    LoginController login;

    @BeforeEach
    void setUp() throws FileNotFoundException {
        login = new LoginController("src/test/resources/login_grandesNegociosTest.csv");
    }

    @Test
    void validarLogin() {

        assertTrue(login.validarLogin("ADMIN", "patrao", "grandesnegocios"));
        assertTrue(login.validarLogin("FUNC", "ivone", "costa"));
        assertFalse(login.validarLogin("SEGURANCA", "carlos","protecao123"));
        assertFalse(login.validarLogin("FUNC", "vitor","cesae"));
    }
}