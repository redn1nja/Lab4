package kick;

import lotr.Character;

import java.util.Random;

public class NobleKick implements BasicKick{
    @Override
    public void kick(Character c) {
        Random rand = new Random();
        c.setHp (c.getHp()-(rand.nextInt(10)+getPower()-10));
    }
}
