package codigopropio;

public class Juego {
    private final Dado dado1;
    private final Dado dado2;

    public Juego(Dado dado1, Dado dado2) {
        this.dado1 = dado1;
        this.dado2 = dado2;
    }

    public void jugar() {
        dado1.lanzar();
        dado2.lanzar();
    }

    public boolean sumanSiete() {
        return Calculadora.sumar(dado1.cara(), dado2.cara()) == 7;
    }

    public String resultado() {
        return sumanSiete() ? "Ganaste!!!" : "Has perdido!!!";
    }

    public void mostrarResultado() {
        System.out.println(resultado());
    }
}
