public class Battleground {
    public static void main(String[] args) {
        King king = new King();
//        Queen queen = new Queen();
//        Troll troll = new Troll();
//        Knight knight = new Knight();
        WeaponBehavior axeBehavior = new AxeBehavior();
        king.figth();
        king.setWeapon(axeBehavior);
        king.figth();
    }
}