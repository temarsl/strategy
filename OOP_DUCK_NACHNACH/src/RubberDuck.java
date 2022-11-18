public class RubberDuck extends Duck {
    @Override
    public void display() {
        System.out.println("I'm Rubber Duck");
    }

    @Override
    public String fly() {
        return "fly-fly";
    }

    @Override
    public String quack() {
        return "pipipipi";
    }

    @Override
    public String swim() {
        return "swim";
    }
}
