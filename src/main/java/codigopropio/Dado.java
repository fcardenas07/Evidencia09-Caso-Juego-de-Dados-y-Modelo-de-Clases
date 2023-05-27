package codigopropio;

public class Dado {
    private int cara = 1;

    public Dado(int cara) {
        this.cara = cara;
    }

    public Dado() {
    }

    public void lanzar() {
        cara = (int) (Math.random() * 6) + 1;
    }

    public int cara() {
        return cara;
    }
}
