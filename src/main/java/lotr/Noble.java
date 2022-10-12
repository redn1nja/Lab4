package lotr;

import kick.NobleKick;

import java.util.Random;

public abstract class Noble extends Character {
    NobleKick ability = new NobleKick();

    public Noble(int hp, int power){
        super(hp, power);
        Random rand = new Random();
        setHp(getHp()+rand.nextInt(10));
        setPower(getPower()+rand.nextInt(10));
        ability.setPower(getPower());

    }
    public void kick(Character c){
        ability.kick(c);
    }
    @Override
    public String toString() {
        return super.toString();
    }
}
