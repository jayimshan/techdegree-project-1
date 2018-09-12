//import java.io.Console;
import java.util.Scanner;

public class Prompter {
  // Prompt messages and I/O handling
  
  private String[] gameQuestions = {"What type of item?", "What is the maximum amount of items?"};
  public String gameItem;
  public int maxQuantity;
  //Console console = System.console();
  Scanner scanner = new Scanner(System.in);
  
  public Prompter() {
    System.out.println("How many are in the jar by: James Han\n");
    System.out.printf("ADMINISTRATOR\n========================\n\n");
    System.out.println("What type of item?");
    //gameItem = console.readLine();
    gameItem = scanner.nextLine();
    System.out.printf("What is the maximum amount of %s?\n", gameItem);
    maxQuantity = scanner.nextInt();
    //maxQuantity = Integer.parseInt(console.readLine());
    System.out.println("PLAYER\n========================\n\n");
    System.out.printf("How many %s(s) are in the jar? Pick a number between 1 and %d\n",
                      gameItem, maxQuantity); 
  }
  
  public int getGuess() {
    int guess = scanner.nextInt();
    return guess;
  }
  
  public static void guessHigher() {
    System.out.println("Your guess is too low. Guess higher.");
  }
  
  public static void guessLower() {
    System.out.println("Your guess is too high. Guess lower.");
  }
  
  public static void illegalGuess() {
    System.out.println("Your guess must be less than the maximum fill amount. Try again.\n");  
  }
  
  public static void finishGame(Jar jar,int attempts) {
    System.out.printf("Congratulations! You guessed that there are %d %s(s) in the jar! You got it in %d attempt(s).\n",
                        jar.getQuantity(), jar.getItem(), attempts); 
  }
}