import java.util.Scanner;
import java.util.Random;

public class Arena {

    public static void main(String[] args){

        System.out.println("what is the name of your monster ?");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();

        
        Monster monsterPlayer = new Monster(name, randomFI(), randomFI(), randomEl());

        for( int i = 0; i < 3; i ++){
            Monster monsterOpponent = new Monster("Casimir", randomFI(), randomEl(), randomL());
            while (monsterPlayer.getLife() > 0 && monsterOpponent.getLife() > 0) {
                monsterPlayer.attack(monsterOpponent);
                if (monsterOpponent.getLife() > 0) {
                    monsterOpponent.attack(monsterPlayer);
                }
            }
        }
    } 
    // random force, intelligence entre 0 et 10
    public static int randomFI(){
        Random random = new Random();
        int number = random.nextInt(10);
        return number;
    }

    // random vie adversaire entre 10 et 30
    public static int randomL(){
        Random random = new Random();
        int number = 10 + random.nextInt(21);
        return number;
    }

    // random élément adversaire
    public static String randomEl(){
        String[] elements = {"fire", "water", "air"};
        Random random = new Random();
        int element = random.nextInt(3);
        return elements[element];
    }



    
}
