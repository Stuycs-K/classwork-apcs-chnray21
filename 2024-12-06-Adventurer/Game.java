import java.util.Scanner;

public class Game {
  public static void main(String[] args) {
    Adventurer player = new Assassin();
    Adventurer enemy = new CodeWarrior();

    boolean quit = false;
    Scanner userInput = new Scanner(System.in);

    while (!quit) {
      System.out.println("Player:  HP: " + player.getHP() + ", Special Resource: " + player.getSpecial());
      System.out.println("Enemy: HP: " + enemy.getHP() + ", Special Resource: " + player.getSpecial());

      System.out.println("Choose move: (a)ttack / (sp)ecial / (su)pport / quit");
      String move = userInput.nextLine();

      if (move.equals("a") || move.equals("attack")) {
        System.out.println(player.attack(enemy));
      }
      else if (move.equals("sp") || move.equals("special")) {
        System.out.println(player.specialAttack(enemy));
      }
      else if (move.equals("su") || move.equals("support")) {
        System.out.println(player.support());
      }
      else if (move.equals("quit")) {
        quit = true;
        System.out.println("Quitting the game");
        break;
      }
      else {
        System.out.println("Invalid input. Try again");
        continue;
      }

      if (enemy.getHP() > 0) {
        int chooser = (int)Math.random()*3+1;
        if (chooser == 1) {
          System.out.println(enemy.attack(player));
        }
        else if (chooser == 2) {
          System.out.println(enemy.specialAttack(player));
        }
        else if (chooser == 3 ) {
          System.out.println(enemy.support());
        }
      }
      else {
        quit = true;
        System.out.println("Player won!");
      }

      if (player.getHP() < 0) {
        quit = true;
        System.out.println("Player lost!");
      }
    }
    userInput.close();
  }
}
