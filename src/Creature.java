/**
 * Created by G00253894 on 11/9/2015.
 */
/*
CREATURE -
fields - (int) hitpoints
(int) strength default to 10 each, can never be less than 5
methods - int damage() a random number between 1 and strength

 */
public class Creature {
    private int strength;
    private int hitPoints;
    private boolean isAlive=true;
    Creature(int strength,int hitPoints){
        this.strength=strength;
        this.hitPoints=hitPoints;
    }
     Creature(){
         setStrength(5,10);
         setHitPoints(5,10);
         if(hitPoints<0){boolean isAlive=false;}
     }
    public void takeDamage(int damage){
        hitPoints = getHitPoints()-damage;
    }
    public int getDamage(){return randMinMax(1,getStrength());}
    public int getStrength(){return strength;}
    public void setStrength(int minRange, int maxRange){strength=randMinMax(minRange,maxRange);}
    public int getHitPoints(){
        return hitPoints;
    }
    public void setHitPoints(int minRange,int maxRange){
        hitPoints=randMinMax(minRange,maxRange);
    }
    public int randMinMax(int minRange,int maxRange){return (int)Math.round(Math.random()*(maxRange-minRange)+1)+minRange;}
    public int rand(int maxRange){return (int)Math.round(Math.random()*maxRange);}
}
