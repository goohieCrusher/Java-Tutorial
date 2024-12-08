/**
 * 
 */
package tutorial;
import java.util.Random;

class Dog {
  public enum Color { BROWN, WHITE, BLACK, GRAY, SPOTTED,};
  Color color;
  int speed;
  String name;
  String breed;
  int healthPoint;
  int attackPower;
  int defensePower;
  
  public Dog(String name, int attackPower, int defensePower) {
    this.name = name;
    this.healthPoint = 100;
    this.attackPower = attackPower;
    this.defensePower = defensePower;
  }
  
  public boolean isAlive() {
    return healthPoint > 0;
  }
  public void defend(int damage) {
    healthPoint -= damage *(100.0-defensePower)/100.0;
    System.out.println(name + " recieved " + damage + " damage, hp is now " + Math.max(0, healthPoint));
    if (!isAlive()) { 
      System.out.println(name + " has died.");
    }
  }
  public void attack(Dog victim) {
    Random rng = new Random();
    int damage = rng.nextInt(attackPower);
    System.out.println(name + " attacks " + victim.name + ", ");
    victim.defend(damage);
  }
  
  public void run() {
    System.out.println(name + " is running at " + speed + " mph");
  }
  public void bark() {
    System.out.println("ruff ruff");
  }
  
}
/**
 * 
 */
public class DogTestDrive {
  /**
   * @param args
   */
  public static void main(String[] args) {
    // TODO Auto-generated method 
    try {
      Dog aiwen = new Dog("aiwen", 50, 35);
      Dog klein = new Dog("klein", 50, 35);
      while (aiwen.isAlive() && klein.isAlive()) {
        klein.attack(aiwen);
        Thread.sleep(1000);
        aiwen.attack(klein);
      }
    } catch (Exception e) {      
    }
  }

}
