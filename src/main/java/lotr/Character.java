package lotr;

import lombok.Getter;
import lombok.Setter;

import java.util.Random;

@Getter @Setter
public abstract class Character {
    private int hp;
    protected Random rand = new Random();
    private int power;

    public Character(int hp, int power){
        this.hp = Math.max(hp, 0);
        this.power = power;
    }
    public void kick(Character c){
        System.out.println("123");
    }

    public boolean isAlive(){
        return getHp()>0;
    }

    public void setHp(int hp){
        this.hp = Math.max(hp, 0);
    }
    @Override
    public String toString() {
        return this.getClass().getSimpleName()+"{" +
                "hp=" + hp +
                ", power=" + power +
                '}';
    }
}
