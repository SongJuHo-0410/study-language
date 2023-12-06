
import javax.swing.*;
import java.awt.*;

public class MyPanel extends JPanel
{
    public JCheckBox apple;
    public JCheckBox pear;
    public JCheckBox cherry;
   
    
    public MyPanel(){
        ImageIcon cherryIcon = new ImageIcon("images/cherry.jpg");
        
        ImageIcon selectedCherryIcon = new ImageIcon(
                "images/selectedCherry.jpg");
        
       
                
        apple = new JCheckBox("사과");
        pear = new JCheckBox("배",true);
        cherry = new JCheckBox("체리",cherryIcon);

        cherry.setBorderPainted(true);
        cherry.setSelectedIcon(selectedCherryIcon);
        
        this.add(apple);
        this.add(pear);
        this.add(cherry);
    }
}
