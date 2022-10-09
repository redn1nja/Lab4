package lotr;

import kick.NormalKick;

public class Elf extends Character{
    NormalKick ability = new NormalKick();
    public Elf(){
        super(10,10);
        ability.setPower(getPower());
    }

    @Override
    public void kick(Character c) {
        ability.kick(c);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}

