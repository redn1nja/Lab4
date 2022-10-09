package kick;

import lotr.Character;

import java.util.Random;

public class NobleKick implements BasicKick{
    private int power;

    public void setPower(int power) {
        this.power = power;
    }

    @Override
    public void kick(Character c) {
        Random rand = new Random();
        c.setHp (c.getHp()- rand.nextInt(power));
    }
}
