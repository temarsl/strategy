package Strategy;

public class InkjetPrinter extends Printer {

    public InkjetPrinter() {
        connection = new Bluetooth();
        copying = new CopyingIsPossible();
    }

    @Override
    public void dispay() {
        System.out.println("Использование струйного принтера");
    }
}
