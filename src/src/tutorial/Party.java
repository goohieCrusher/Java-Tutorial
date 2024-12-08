/**
 * 
 */
package tutorial;
import java.awt.*;
import java.awt.event.*;

/**
 * 
 */
public class Party {
  public void buildinvite() {
    Frame f = new Frame();
    f.setTitle("Tim's Party Invatation");
    f.setSize(400, 200);
    Label l = new Label("Party at Tim's!");
    Button b = new Button("You bet");
    Button c = new Button("Shoot Me");
    Panel p = new Panel();
    p.add(l);
    p.add(b);
    p.add(c);
    f.add(p);
    
  }
  /**
   * @param args
   */
  public static void main(String[] args) {
    // TODO Auto-generated method stub
    new Party().buildinvite();

  }

}
