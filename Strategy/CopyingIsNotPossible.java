package Strategy;

public class CopyingIsNotPossible implements Copying {
    @Override
    public void copy() {
        System.out.println("Нет возможности копирования");
    }
}
