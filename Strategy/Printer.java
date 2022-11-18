package Strategy;

public abstract class Printer {
    Connection connection;
    Copying copying;

    public void print() {
        System.out.println("prrrr-prrrr");
    }

    public void typeConnect() {
        connection.connect();
    }

    public void possibilityCopying() {
        copying.copy();
    }

    public abstract void dispay();
}
