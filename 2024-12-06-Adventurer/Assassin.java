public class Assassin extends Adventurer {
  private int accuracy, maxAccuracy;

  public String getSpecialName() {
    return "Assassin";
  }

  public int getSpecial() {
    return accuracy;
  }

  public void setSpecial(int n) {
    accuracy=n;
  }

  public int getSpecialMax {
    return maxAccuracy;
  }

  public String attack(Adventurer other) {
    other.setSpecial(other.getSpecial - 1);
    return "Assassin stabbed "+other;
  }

  public String support(Adventurer other) {
    other.setHP(other.getHP()-1);
    return "Assassin gave a healing potion to "+other;
  }

  public String support() {
    this.setHP(this.getHP()-1);
    return "Assassin drank a healing potion";
  }

  public String specialAttack(Adventurer other) {
    other.setHP(other.getHP()-this.getSpecial());
    this.setSpecial(this.getSpecial()-2);
    return "Assassin ambushed "+other;
  }
}
