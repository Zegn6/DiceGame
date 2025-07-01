
import java.util.Random;
import java.util.Scanner;
public class DiceGame {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();
        System.out.println("What is your name?");
        System.out.print("> ");
        String name = scanner.nextLine();
        System.out.println("Hello, " + name + "!");
        System.out.println("Rolling the dice...");
        int die1 = rand.nextInt(6) + 1;
        int die2 = rand.nextInt(6) + 1;
        int goke = die1 + die2;
        System.out.println("Die 1: " + die1);
        System.out.println("Die 2: " + die2);
        System.out.println("Total value: " + goke);
        if(goke >7){
    System.out.println("You won!");
}else{
    System.out.println("You lost.");
}
    }
}
