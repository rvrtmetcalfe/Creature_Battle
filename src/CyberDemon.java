/**
 * Created by G00253894 on 11/9/2015.
 */
/*
CYBERDEMON
basic DEMON

 */
public class CyberDemon extends Demon{
    CyberDemon(){
        setHitPoints(5, 35);
        setStrength(5,25);
    }

    @Override
    public int getDamage() {
        super.getDamage();
        if(rand(20)==6){return randMinMax(1,getStrength())+50;}else{return randMinMax(1,getStrength());}

    }
}

