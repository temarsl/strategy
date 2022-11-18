public class Troll extends Character {

    public Troll() {
        weapon = new BowAndArrowBehavior();
    }

    @Override
    public void useWeapon() {
        System.out.println("Используемое оружие = " + getWeapon());
    }

    @Override
    public void figth() {
        weapon.useWeapon();
    }
}
