package Ex_05;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FuncionarioTest {

    Funcionario alice;
    Funcionario mario;
    Funcionario pedro;
    Funcionario joana;
    @BeforeEach
    void setUp() {
        alice = new Funcionario("Alice", 1000, "Design");
        mario = new Funcionario("Mario", 2500, "T.I");
        pedro = new Funcionario("Pedro", 3252, "Diretoria");

    }
    @Test
    void getNomeTest() {
        assertEquals("Alice", alice.getNome());
        assertEquals("Mario", mario.getNome());
        assertEquals("Pedro", pedro.getNome());
    }

    @Test
    void getDepartamentoTest(){
        assertEquals("Design", alice.getDepartamento());
        assertEquals("T.I", mario.getDepartamento());
        assertEquals("Diretoria", pedro.getDepartamento());
    }
    @Test
    void aumentarSalarioTest() {

        // aumentar 20%
        alice.aumentarSalario(20);
        assertEquals(1200, alice.getSalario());

        mario.aumentarSalario(15);
        assertEquals(2875, mario.getSalario());

        pedro.aumentarSalario(5);
        assertEquals(3414.6, pedro.getSalario());

    }
}