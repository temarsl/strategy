package Strategy;

public class CopyingIsPossible implements Copying{
    @Override
    public void copy() {
        System.out.println("Есть возможность копирования");
    }
}
