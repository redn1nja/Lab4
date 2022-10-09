package kick;

import lotr.Character;

public class NormalKick implements BasicKick{
    private int power;

    public void setPower(int power) {
        this.power = power;
    }

    @Override
    public void kick(Character c){
        if(power>c.getPower()){
            c.setHp(0);
        }
        else {
            c.setHp(c.getHp()-1);
        }
    }
}
