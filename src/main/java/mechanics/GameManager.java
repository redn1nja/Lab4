package mechanics;
import lotr.Character;

public class GameManager {
    void fight (Character c1, Character c2){
        while (c1.isAlive() && c2.isAlive()){
            int round = 1;
            int hp2 = c2.getHp();
            int hp1 = c1.getHp();
            System.out.println("Round "+ round);
            c1.kick(c2);
            System.out.println(c1.getClass().getSimpleName() + " with " + c1.getHp() + "hp hit " + c2.getClass().getSimpleName() + " for " + (hp2-c2.getHp()) + " damage.");
            c2.kick(c1);
            System.out.println(c2.getClass().getSimpleName() + " with " + c2.getHp() + "hp hit " + c1.getClass().getSimpleName() + " for " + (hp1-c1.getHp()) + " damage.");
            ++round;
            System.out.println();


        }
        if (c1.isAlive()){
            System.out.println(c1.getClass().getSimpleName() + " won");
        }
        else {
            System.out.println(c2.getClass().getSimpleName() + " won");
        }
    }
}
