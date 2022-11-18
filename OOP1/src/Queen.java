public class Queen extends Character {
    @Override
    public void useWeapon() {
        System.out.println("Используемое оружие = " + getWeapon());
    }

    @Override
    public void figth() {
        weapon.useWeapon();
    }

    public Queen() {
        weapon = new BowAndArrowBehavior();
    }
}
