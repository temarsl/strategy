public class DecoyDuck extends Duck{
    @Override
    public String quack() {
        return "I can't quack";
    }

    @Override
    public String swim() {
        return "I can't swim";
    }

    @Override
    public String fly() {
        return "I can't fly";
    }

}
