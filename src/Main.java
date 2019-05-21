import java.util.Random;
import java.util.Scanner;

/**
 * Challenge #364 [Easy] Create a Dice Roller
 * I love playing D&D with my friends, and my favorite part is creating character sheets (my DM is notorious for
 * killing us all off by level 3 or so). One major part of making character sheets is rolling the character's stats.
 * Sadly, I have lost all my dice, so I'm asking for your help to make a dice roller for me to use!
 *
 * https://www.reddit.com/r/dailyprogrammer/comments/8s0cy1/20180618_challenge_364_easy_create_a_dice_roller/
 */

public class Main {

    public static void main(String[] args){
        while (true){
            Scanner in = new Scanner(System.in);
            System.out.println("Enter dice roll (format: XdY):");
            String input = in.next();

            System.out.println(rollDice(input));
        }


    }

    public static int rollDice(String s){
        Scanner scan = new Scanner(s);
        scan.useDelimiter("d");
        // seperate data
        int[] data = new int[2];
        int count = 0;
        while(scan.hasNext()){
            data[count]= Integer.parseInt(scan.next());
            count++;
        }

        // roll dice

        Random r = new Random();
        int total = 0;
        for (int i = 0; i<data[0];i++){// for number of rolls
            // roll that sided die
            total+=r.nextInt(data[1]+1);
        }


        return total;
    }


}
