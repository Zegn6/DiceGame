import java.util.Random;
import java.util.Scanner;
public class DiceGame{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();
        System.out.println("What is your name?");
        System.out.print("> ");
        String name = scanner.nextLine();
        System.out.println("Hello, " + name + "!");
        System.out.println("Rolling the dice...");
        int dice1 = rand.nextInt(6) + 1;
        int dice2 = rand.nextInt(6) + 1;
        int goke = dice1 + dice2;
        System.out.println("Dice 1: " + dice1);
        System.out.println("Dice 2: " + dice2);
        System.out.println("Total value: " + goke);

if(goke >7){
    System.out.println(name + " won!");
}else{
    System.out.println(name + " lost.");
}
    }
}
