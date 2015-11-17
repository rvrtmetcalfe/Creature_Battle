/**
 * Created by G00253894 on 11/9/2015.
 */
/*
DEMON
5% chance to do magical damage (+50)
 */
public class Demon extends Creature {
    Demon(){
        setStrength(5,25);
        setHitPoints(5,40);
    }
    public int getDamage(){
        super.getDamage();
        if(rand(20)==6){
            return (randMinMax(1,getStrength())+50);}else{
            return (randMinMax(1,getStrength()));}
    }
}
