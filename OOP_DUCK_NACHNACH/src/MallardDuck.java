public class MallardDuck extends Duck {
    @Override
    public void display() {
        System.out.println("I'm Mallard Duck");
    }

    @Override
    public String fly() {
        return "fly-fly";
    }

    @Override
    public String quack() {
        return "quack-quack";
    }

    @Override
    public String swim() {
        return "swim";
    }
}
