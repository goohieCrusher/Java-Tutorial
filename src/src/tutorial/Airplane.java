package tutorial;

public class Airplane {
  public enum EngineType { ELECTRIC, JET, PROPELLER, WIND, PAPER }
  public enum Color { RED, ORANGE, YELLOW, GREEN, BLUE, PURPLE, WHITE, BLACK }
  
  public Airplane(EngineType engineType, int weight, Color color, int velocity) {
    this.engineType = engineType;
    this.weight = weight;
    this.color = color;
    this.velocity = velocity;
  }
  
  public String toString() {
    return String.format("Airplane: enigine type = %s, weight = %d lbs, color = %s, velocity = %d.", engineType, weight, color, velocity);
  }
  
  private final EngineType engineType;
  private final int weight;
  private final Color color;
  private int velocity;
  
	public static void main(String[] args) {
	  System.out.println("Airplane is going to lift off...");
	  Airplane myPlane = new Airplane(EngineType.PROPELLER, 129048, Color.WHITE, 16);
	  System.out.println("my plane is " + myPlane);
	}
}
