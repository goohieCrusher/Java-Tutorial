package tutorial;

public class Airplane {
  public enum EngineType { ELECTRIC, JET, PROPELLER, WIND, PAPER }
  public enum Color { RED, ORANGE, YELLOW, GREEN, BLUE, PURPLE, WHITE, BLACK }
  
  public static class Builder {
    public Builder() {
      this.engineType = EngineType.ELECTRIC;
      this.weight = 12890;
      this.color = Color.BLACK;   
    }
    
    public Builder engineType(EngineType type) {
      this.engineType = type;
      return this;
    }
    
    public Builder weight(int pounds) {
      this.weight = pounds;
      return this;
    }
    
    public Builder color(Color c) {
      this.color = c;
      return this;
    }
    
    public Airplane build() {
      return new Airplane(this);
      
    }
    protected EngineType engineType;
    protected int weight;
    protected Color color;
    
  }
  
  public Airplane(Builder builder) {
    this.engineType = builder.engineType;
    this.weight = builder.weight;
    this.color = builder.color;
    this.velocity = 0;
  }
  public void velocity(int v) {
    this.velocity = v;
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
	  Airplane myPlane = new Builder().engineType(EngineType.PROPELLER).weight(129048).color(Color.WHITE).build();
	  myPlane.velocity(17);
	  System.out.println("my plane is " + myPlane);
	}
}
