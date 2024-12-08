/**
 * 
 */
package tutorial;

/**
 * 
 */
public class BottleSong {

  /**
   * @param args
   */
  public static void main(String[] args) {
    // TODO Auto-generated method stub
    int bottlesNum = 10;
    String word = "bottles";
    
    while (bottlesNum > 0) {
      System.out.println(bottlesNum + " green " + word + ", hanging on the wall");
      System.out.println(bottlesNum + " green " + word + ", hanging on the wall");
      System.out.println("And if one green bottle sould accidentally fall, ");
      bottlesNum--;
      if (bottlesNum == 1) {
        word = "bottle"; // singular, as in ONE bottle
      }
      if (bottlesNum > 0) {
        System.out.println("There'll be " + bottlesNum + " green " + word + ", hanging on the wall");
      } else {
        System.out.println("There'll be no green bottles, hanging on the wall");
      }// end else
    } // end while loop
  } // end main method
} // end class
