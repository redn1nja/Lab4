package lotr;

import kick.CryKick;

public class Hobbit extends Character{
    CryKick ability = new CryKick();
    public Hobbit(){
        super(3, 0);
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
