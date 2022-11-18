public class King extends Character {
    @Override
    public void useWeapon() {
        System.out.println("Используемое оружие = " + getWeapon());
    }

    public King() {
        weapon = new SwordBehavior(); // меч по дефолту
    }

    @Override
    public void figth() {
        weapon.useWeapon();
    }

}
