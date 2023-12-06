

import javax.swing.*;
import java.awt.*;

public class CheckBoxFrame extends JFrame
{
    public MyPanel mp;
    public CheckBoxFrame(){
        this.setTitle("체크박스 만들기 예제");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        mp = new MyPanel();
        this.add(mp);
        
        
        this.setVisible(true);
        this.setSize(250,200);
        
    }
}
