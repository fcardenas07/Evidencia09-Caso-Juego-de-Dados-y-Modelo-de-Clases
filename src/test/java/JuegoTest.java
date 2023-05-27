import codigopropio.Dado;
import codigopropio.Juego;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class JuegoTest {
    private Dado dado1;
    private Dado dado2;
    private Juego juego;

    @BeforeEach
    void setUp() {
        dado1 = new Dado();
        dado2 = new Dado();
        juego = new Juego(dado1, dado2);
    }

    @Test
    void juegoGanador() {
        dado1 = new Dado(3);
        dado2 = new Dado(4);

        juego = new Juego(dado1, dado2);

        assertTrue(juego.sumanSiete());
        assertEquals("Ganaste!!!", juego.resultado());
    }

    @Test
    void juegoPerdedor() {
        dado1 = new Dado(1);
        dado2 = new Dado(4);

        juego = new Juego(dado1, dado2);

        assertFalse(juego.sumanSiete());
        assertEquals("Has perdido!!!", juego.resultado());
    }
}