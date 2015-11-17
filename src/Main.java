import java.util.ArrayList;
import java.util.jar.Pack200;

/**
 * Created by robert on 11/16/15.
 */
public class Main {
    public static void main(String[] args) {


        ArrayList<Creature> dark = new ArrayList<>();
        ArrayList<Creature> light = new ArrayList<>();
        int prob = 0;
        for (int i = 0; i < 100; i++) {
            prob = rand(100);
            if (prob <= 30) {
                Demon demon = new Demon();
                dark.add(demon);
            } else if (prob > 30 && prob < 85) {
                CyberDemon cyberDemon = new CyberDemon();
                dark.add(cyberDemon);
            } else if (prob >= 85) {
                Balrog balrog = new Balrog();
                dark.add(balrog);
            }
        }

        for (int i = 0; i < 100; i++) {
            prob = rand(100);
            if (prob<70) {
                Human human = new Human();
                light.add(human);
            }
                Elf elf = new Elf();
                light.add(elf);
            }




        for (Creature c : dark) {
            System.out.println("Class : " + c.getClass());
            System.out.println("Strength : " + c.getStrength());
            System.out.println("Hit points : " + c.getHitPoints());
            System.out.println("Damage : " + c.getDamage());
        }
        for (Creature c : light) {
            System.out.println("Class : " + c.getClass());
            System.out.println("Strength : " + c.getStrength());
            System.out.println("Hit points : " + c.getHitPoints());
            System.out.println("Damage : " + c.getDamage());
        }

        for(int i=0;i<100;i++){
            int j = 0;
            int k=0;
            Creature darkCreature = dark.get(i);
            Creature lightCreature = light.get(i);
            while(darkCreature.getHitPoints()>0 && lightCreature.getHitPoints()>0){
                darkCreature.takeDamage(lightCreature.getDamage());
                System.out.println(darkCreature.getClass()+" "+darkCreature.getHitPoints());
                lightCreature.takeDamage(darkCreature.getDamage());
            }
        }

    }
    public static int rand(int maxRange){return (int)Math.round(Math.random()*maxRange);}

}
