public class GuessingGame {
    public static void main(String[] args) {
      Prompter prompter = new Prompter();
      Game game = new Game(prompter.gameItem, prompter.maxQuantity);
      while (!game.isCorrect) {
        game.checkGuess(prompter.getGuess());
      }
    }
}
