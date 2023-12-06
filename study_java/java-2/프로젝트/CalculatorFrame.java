import java.awt.*;
import javax.swing.*;

public class CalculatorFrame extends JFrame
{
 public CalculatorFrame(){
 super("계산기"); // setTitle("계산기");
 this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 
 Container c = getContentPane();
 JPanel np = new SouthPanel();
 c.add(np,BorderLayout.NORTH);
 c.add(new CenterPanel(), BorderLayout.CENTER);
 c.add(new SouthPanel(), BorderLayout.SOUTH);
 
 this.setSize(300,300);
 this.setVisible(true);
}
}
