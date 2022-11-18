public abstract class Character implements WeaponBehavior{
    WeaponBehavior weapon;

    public WeaponBehavior getWeapon() {
        return weapon;
    }

    public void setWeapon(WeaponBehavior weapon) {
        this.weapon = weapon;
    }

    abstract public void figth();
}
