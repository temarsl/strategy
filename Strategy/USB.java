package Strategy;

public class USB implements Connection {
    @Override
    public void connect() {
        System.out.println("Подключение - USB");
    }
}
