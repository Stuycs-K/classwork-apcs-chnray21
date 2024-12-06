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
}
