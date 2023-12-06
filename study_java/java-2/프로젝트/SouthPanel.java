 import java.awt.*;
import javax.swing.*;

public class SouthPanel extends JPanel
{
    public SouthPanel(){
     setBackground(Color.LIGHT_GRAY);
     setOpaque(true);
     setLayout(new FlowLayout()); 
     add(new JLabel("계산 결과"));
     add(new JTextField(16));
    }
}
