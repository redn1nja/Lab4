package lotr;

import java.util.Random;

public class Noble extends Character {
    Noble(int hp, int power){
        super(hp, power);
        Random rand = new Random();
        setHp(getHp()+rand.nextInt(10));
        setPower(getPower()+rand.nextInt(10));

    }
    public void kick(Character c){
        c.setHp(c.getHp()-(rand.nextInt(10)+getPower()-10));
    }
    @Override
    public String toString() {
        return super.toString();
    }
}
