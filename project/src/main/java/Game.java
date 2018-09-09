public class Game {
  // Game logic
  
  private int numberOfAttempts = 0;
  public boolean isCorrect = false;
  public int guessedNumber;
  private Jar jar;
  
  public Game(String gameItem, int maxQuantity) {
    jar = new Jar(gameItem, maxQuantity);
  }
  
  public void checkGuess(int guessedNumber) {
    if (guessedNumber <= jar.getMaxQuantity() && guessedNumber > 0) {
      numberOfAttempts++;
      if (guessedNumber < jar.getQuantity()) {
        Prompter.guessHigher();
      } else if (guessedNumber > jar.getQuantity()) {
        Prompter.guessLower(); 
      } else if (guessedNumber == jar.getQuantity()) {
        Prompter.finishGame(jar, numberOfAttempts);
        isCorrect = true;
      }
    } else {
      Prompter.illegalGuess();  
    }
  }
  
}