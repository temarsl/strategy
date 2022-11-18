public class RudderDuck extends Duck implements Quackable{
    @Override
    public void display() {
        System.out.println("I'm Rudder Duck!");
    }


    @Override
    public void quack() {
        System.out.println("pipipipi!!");
    }
}
