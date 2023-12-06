
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MyPanel extends JPanel implements ItemListener
{
    private JCheckBox apple,pear,cherry;
    private JLabel ml, resultLabel;
    private int sum = 0;
    
    public MyPanel(){
        ImageIcon cherryIcon = new ImageIcon("images/cherry.jpg");
        
        ImageIcon selectedCherryIcon = new ImageIcon(
                "images/selectedCherry.jpg");
        
        ml = new JLabel("사과 100원 배 500원 체리 2000원");    
        resultLabel = new JLabel("현재 0원 입니다.");
                
        apple = new JCheckBox("사과");
        pear = new JCheckBox("배");
        cherry = new JCheckBox("체리",cherryIcon);

        cherry.setBorderPainted(true);
        cherry.setSelectedIcon(selectedCherryIcon);
        
        this.add(ml);
        this.add(apple);
        this.add(pear);
        this.add(cherry);
        this.add(resultLabel);
        
        apple.addItemListener(this);
        pear.addItemListener(this);
        cherry.addItemListener(this);
    }
    
    
    public void itemStateChanged(ItemEvent e){
        if(e.getStateChange() == ItemEvent.SELECTED)
        {
            if(e.getItem() == apple)
            sum += 100;
            else if(e.getItem() == pear)
            sum += 500;
            else
            sum += 2000;
        }
        else{
            if(e.getItem() == apple)
            sum -= 100;
            else if(e.getItem() == pear)
            sum -= 500;
            else
            sum -= 2000;
        }
        resultLabel.setText("현재" + sum + "원 입니다.");
        
    }
}
