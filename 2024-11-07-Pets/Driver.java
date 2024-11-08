/*
 * The name did not change for the Animal.speak(), but it changed for the Bird.speak()
 */
public class Driver {
  public static void main(String[] args) {
    Animal Bob = new Animal("meow", 2909, "Bob");
    Bob.speak();
    Bird BobII = new Bird("woof", 2908, "BobII", 1, "green");
    BobII.speak();
  }
 }
