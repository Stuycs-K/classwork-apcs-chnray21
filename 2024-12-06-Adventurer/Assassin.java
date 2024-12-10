import java.util.Random;

public class Assassin extends Adventurer {
  private int crossbow, maxCapacity;

  public Assassin(String name) {
    super(name, 15);
  }

  public String getSpecialName() {
    return "crossbow";
  }

  public int getSpecial() {
    return crossbow;
  }

  public void setSpecial(int n) {
    crossbow=n;
  }

  public int getSpecialMax() {
    return maxCapacity;
  }

  public String attack(Adventurer other) {
    int damage = (int)Math.random()*3+1;
    other.applyDamage(damage);
    restoreSpecial(2);
    return this + " stabbed" + other + " for " + damage + " damage";
  }

  public String support(Adventurer other) {
    
  }

  public String support() {
    this.setHP(this.getHP()-1);
    return "Assassin drank a healing potion";
  }

  public String specialAttack(Adventurer other) {
    other.setHP(other.getHP()-this.getSpecial());
    this.setSpecial(this.getSpecial()-2);
    return "Assassin ambushed "+other.getName();
  }
}
