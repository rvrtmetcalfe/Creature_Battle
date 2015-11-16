import java.util.ArrayList;

/**
 * Created by robert on 11/16/15.
 */
public class Main {
    public static void main(String[] args){

        ArrayList<Creature> creatures = new ArrayList<>();

        Creature creature = new Creature();
        creatures.add(creature);
        Demon demon = new Demon();
        creatures.add(demon);
        Balrog balrog = new Balrog();
        creatures.add(balrog);
        Human human = new Human();
        creatures.add(human);
        Elf elf = new Elf();
        creatures.add(elf);
        CyberDemon cyberDemon= new CyberDemon();
        creatures.add(cyberDemon);
        for(Creature c : creatures){
            System.out.println("Class : "+c.getClass());
            System.out.println("Strength : "+c.getStrength());
            System.out.println("Hit points : "+c.getHitPoints());
            System.out.println("Damage : "+c.getDamage());
        }

    }
}
