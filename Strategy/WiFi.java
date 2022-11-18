package Strategy;

public class WiFi implements Connection {
    @Override
    public void connect() {
        System.out.println("Подключение - WiFi");
    }
}
