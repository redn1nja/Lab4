package lotr;

import lombok.Getter;

@Getter
public class Character {
    private int hp;
    private int power;

    Character(int hp, int power){
        this.hp = hp;
        this.power = power;
    }
    public void kick(Character c){

    }

    boolean isAlive(){
        return getHp()>0;
    }


    @Override
    public String toString() {
        return Character.class.getSimpleName()+"{" +
                "power=" + power +
                ", hp=" + hp +
                '}';
    }
}
