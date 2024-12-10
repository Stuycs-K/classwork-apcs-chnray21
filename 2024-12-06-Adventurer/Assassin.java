public class Assassin extends Adventurer {
  private int crossbow, maxCapacity;

  public Assassin(String name) {
    super(name, 12);
    crossbow = 1;
    maxCapacity = 4;
  }

  public Assassin() {
    this("Ezio");
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
    int damage = (int)(Math.random()*5)+1;
    other.applyDamage(damage);
    restoreSpecial(1);
    return this + " stabbed " + other + " for " + damage + " damage";
  }

  public String support(Adventurer other) {
    other.setHP(other.getHP()+2);
    other.restoreSpecial(1);
    return this + " gave a healing potion to " + other + " to restore 2 HP";
  }

  public String support() {
    this.setHP(this.getHP()+2);
    this.restoreSpecial(1);
    return this + " drank a healing potion for 2 HP";
  }

  public String specialAttack(Adventurer other) {
    int damage = (int)Math.random()*(3+crossbow)+2;
    other.applyDamage(damage);
    int temp = crossbow;
    setSpecial(0);
    return this + " used " + temp + " arrows to deal " + damage + " damage to " + other;
  }
}
