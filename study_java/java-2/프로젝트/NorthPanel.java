import java.awt.*;
import javax.swing.*;

public class NorthPanel extends JPanel
{
    public NorthPanel(){
     setBackground(Color.LIGHT_GRAY);
     setOpaque(true);
     setLayout(new FlowLayout()); 
     add(new JLabel("수식입력"));
     add(new JTextField(16));
    }
}
