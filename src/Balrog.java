/**
 * Created by G00253894 on 11/9/2015.
 */
/*
We are not setting out to implement the war just yet, just the inheritance Hierarchy.



BALROG
Like a normal demon, but attacks TWICE each round



Make reasonable assignments to the max strength and hit points for the other races.

Create objects of each type and write unit tests to ensure that they behave appropriately.
 */
public class Balrog extends Demon{
    Balrog(){
        setStrength(25, 50);
        setHitPoints(30, 100);

    }
    public int getDamage(){
        if(rand(20)==6){return ((randMinMax(1,getStrength())+50)*2);}else{return (randMinMax(1,getStrength())*2);}
    }
}
