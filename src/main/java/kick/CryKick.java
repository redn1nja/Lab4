package kick;

import lotr.Character;

public class CryKick implements BasicKick{
    @Override
    public void kick(Character c) {
        System.out.println("I'm Crying");
    }
}
