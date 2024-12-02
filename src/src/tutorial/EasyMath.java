/**
 * 
 */
package tutorial;

/**
 * Easy Math 4 Awien.
 */
public class EasyMath {
  private static void test1() {
    int number1 = 6;
    int number2 = 144;
    
    int num3 = number1 + number2; 
    System.out.println("sum is " + num3);

    int num4 = number2 - number1; 
    int num5 = number1 * number2; 
    int num6 = number2 / number1; 
    System.out.println("difference is " + num4);
    System.out.println("product is " + num5);
    System.out.println("quotient is " + num6);
  }
  
  private static void test2() {
    int iresult, irem;
    double dresult, drem;
    iresult = 10/3;
    irem = 10%3;
    dresult = 10.0/3.0;
    drem = 10.0%3.0;
    System.out.println("Result and remainder of 10/3 is " + iresult + ", " + irem);
    System.out.println("Result and remainder of 10.0/3.0 is " + dresult + ", " + drem);
  }
   /**
    * @param args    
    */
  public static void main(String[] args) {
    test1();
    test2();
  }
  

}
