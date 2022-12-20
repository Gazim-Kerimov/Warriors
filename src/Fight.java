import Warriors.Archer;
import Warriors.Swordsman;


public class Fight {
    public void start() throws InterruptedException {
        Archer archer = new Archer();
        Swordsman swordsman = new Swordsman();
        while (archer.isAlive && swordsman.isAlive){
            archer.attack(swordsman);
            System.out.println("HP мечника: " + swordsman.getHealth());
            if(!swordsman.isAlive) break;
            Thread.sleep(1500);
            swordsman.attack(archer);
            System.out.println("HP лучника: " + archer.getHealth());
            Thread.sleep(1500);
        }
        if(archer.isAlive) System.out.println(archer.getName() + " победил!");
        else System.out.println(swordsman.getName() + " победил!");
    }
}
