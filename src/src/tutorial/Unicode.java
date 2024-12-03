/**
 * 
 */
package tutorial;
import java.io.Console;

/**
 * 
 */
public class Unicode {
  public static final String TEXT_RESET = "\u001B[0m";
  public static final String TEXT_GREEN = "\u001B[32m";
  public static final String BG_CYAN= "\033[46m";
  public static final char TOP_LEFT_CORNER= '\u250c';
  public static final char HORIZONTAL= '\u2501';
  public static final char VERTICAL =  '\u2502';
  public static final char TOP_RIGHT_CORNER= '\u2510';
  public static final char BOTTOM_LEFT_CORNER=  '\u2514';
  public static final char BOTTOM_RIGHT_CORNER=  '\u2518';

  public static void drawTable(int width, int height) {
    System.out.print(TOP_LEFT_CORNER);
    for (int i=0; i<width; i++) {
      System.out.print(HORIZONTAL);
    }
    System.out.println(TOP_RIGHT_CORNER);
    for (int j=0; j<height; j++) {
      System.out.print(VERTICAL);
      System.out.print(" ".repeat(width));
    
      System.out.println(VERTICAL);
    }
    System.out.print(BOTTOM_LEFT_CORNER);
    for (int i=0; i<width; i++) {
      System.out.print(HORIZONTAL);
    }
    System.out.println(BOTTOM_RIGHT_CORNER);
  }
  /**
   * @param args
   */
  public static void main(String[] args) {
    
    System.out.println("15 \u00f7 5 = 3");
    System.out.println("15 \u00d7 5 = 75\u00a9");
    System.out.println("\u00bc + \u00be = 1");
    System.out.println("\u263a");
    System.out.print(TEXT_GREEN);
    System.out.println("hello");
    System.out.print(TEXT_RESET);
    System.out.print(BG_CYAN);
    System.out.println("big");
    System.out.print(TEXT_RESET);
    System.out.println("15 \u00d7 5 = 75\u00a9");
    System.out.println("\u00bc + \u00be = 1");
    
    drawTable(40, 80);
    drawTable(80, 40);  
    drawTable(5, 10);
    
          
      

    // TODO Auto-generated method stub
    Console console = System.console();
     if (console != null) {
      console.writer().println(BG_CYAN);
      console.writer().println(TEXT_GREEN);
      console.writer().println("Console is very cool");
    } else {
      System.out.println("Console not avalible");
    }
     
  }
  
}
