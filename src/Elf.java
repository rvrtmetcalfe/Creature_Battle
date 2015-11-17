/**
 * Created by G00253894 on 11/9/2015.
 */
/*
ELF
10% chance to do magical damage (2x damage returned)
 */
public class Elf extends Creature{

    Elf(){
        setStrength(5,25);
        setHitPoints(5,40);
    }
    @Override
    public int getDamage(){
        super.getDamage();
        if(rand(10)==7){return randMinMax(1,getStrength()*2);}else{return randMinMax(1,getStrength());}
    }
}
