public class Knight extends Character {

    public Knight() {
        weapon = new KnifeBehavior();
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
