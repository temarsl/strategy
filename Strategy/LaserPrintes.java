package Strategy;

public class LaserPrintes extends Printer {

    public LaserPrintes() {
        connection = new USB();
        copying = new CopyingIsNotPossible();
    }


    @Override
    public void dispay() {
        System.out.println("Использование лазерного принтера");
    }
}