package Strategy;

public class Bluetooth implements Connection {
    @Override
    public void connect() {
        System.out.println("Подключение - Bluetooth");
    }
}
