public class Game {
  public static void main(String[] args) {
    Adventurer player = new CodeWarrior();
    Adventurer enemy = new CodeWarrior();

    boolean quit = false;

    while (!quit) {
      System.out.println("Player:  HP: " + player.getHP() + ", Special Resource: " + player.getSpecial());
      System.out.println("Enemy: HP: " + enemy.getHP() + ", Special Resource: " + player.getSpecial());

      
    }
  }
}
