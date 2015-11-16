/**
 * Created by robert on 11/16/15.
 */
/*
HUMAN
a basic creature, max str(18) max hp(30)

Make the inheritance hierarchy and make sure that any creature or subclass created does not violate the max value restrictions. This means that Humans have str between 5 and 18 and hitpoints between 5 and 30.

 */
public class Human extends Creature {
    public Human(){
        setHitPoints(5,30);
        setStrength(5,18);
    }

}
