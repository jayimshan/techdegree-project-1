import java.util.Random;

public class Jar {
  // Jar object
  
  //private static final int MIN = 1; 
  public int actualQuantity;
  public String gameItem;
  private Random random = new Random();
  private int maxQuantity;
  // Jar object
  
  public Jar(String gameItem, int maxQuantity) {
    //this.gameItem = gameItem;
    setMaxQuantity(maxQuantity);
    setQuantity(fill(getMaxQuantity()));
    setItem(gameItem);
  }
  
  public int fill(int maxQuantity) {
    return random.nextInt(maxQuantity) + 1;
  }
  
  public void setMaxQuantity(int maxQuantity) {
    this.maxQuantity = maxQuantity;  
  }
  
  public void setQuantity(int quantity) {
    actualQuantity = quantity;
  }
  
  public void setItem(String item) {
    gameItem = item;
  }
  
  public int getMaxQuantity() {
    return maxQuantity;  
  }
  
  public int getQuantity() {
    return actualQuantity; 
  }
  
  public String getItem() {
    return gameItem; 
  }
}