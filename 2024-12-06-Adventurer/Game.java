import java.util.Scanner;

public class Game {
  public static void main(String[] args) {
    Adventurer player = new CodeWarrior();
    Adventurer enemy = new CodeWarrior();

    boolean quit = false;
    Scanner userInput = new Scanner(System.in);

    while (!quit) {
      System.out.println("Player:  HP: " + player.getHP() + ", Special Resource: " + player.getSpecial());
      System.out.println("Enemy: HP: " + enemy.getHP() + ", Special Resource: " + player.getSpecial());

      System.out.println("Choose move: (a)ttack / (sp)ecial / (su)pport / quit");
      String move = userInput.nextLine();

      if (move == "a" || move == "attack") {
        System.out.println(player.attack(enemy));
      }
      else if (move == "sp" || move == "attack") {
        System.out.println(player.specialAttack(enemy));
      }
      else if (move == "su" || move == "support") {
        System.out.println(player.support());
      }
      else if (move == "quit") {
        quit = true;
        System.out.println("Quitting the game");
      }
      else {
        System.out.println("Invalid input. Try again");
        continue;
      }

      if (enemy.getHP() > 0) {

      }
    }
  }
}
