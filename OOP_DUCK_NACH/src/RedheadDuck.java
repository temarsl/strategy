public class RedheadDuck extends Duck implements Flyable, Quackable{

    @Override
    public void fly() {
        System.out.println("fly-fly");
    }

    @Override
    public void quack() {
        System.out.println("quack-quack!");
    }
}
