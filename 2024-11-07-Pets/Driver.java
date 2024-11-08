/*
 * The name did not change for the Animal.speak(), but it changed for the Bird.speak()
 */
public class Driver {
  public static void main(String[] args) {
    // Animal Bob = new Animal("meow", 2909, "Bob");
    // Bob.speak();
    // Bird BobII = new Bird("woof", 2908, "BobII", 1, "green");
    // BobII.speak();

    Animal a1 = new Animal("kaboom", 2, "Explosive");
    a1.speak();

    Bird b1 = new Bird("cheep", 3, "TheBird", 5, "blue");
    b1.speak();

    // Bird b2 = new Animal("caw", 1, "Crow");
    // b2.speak();
    // Doesn't work because Animal is not a child of Bird

    Animal a2 = new Bird ("caw", 1, "Crow", 6, "black");
    a2.speak();
  }
 }
