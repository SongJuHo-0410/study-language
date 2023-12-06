

import javax.swing.*;
/**
 * 여기에 MyFrame2 클래스 설명을 작성하십시오.
 * 
 * @author (송주호) 
 * @version (2019.12.09)
 */
public class MyFrame2 extends JFrame
{   
    
    public MyFrame2(){
     this.setSize(300,150);
     
     this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     
     this.setTitle("2018210059 송주호");
     
     MyPanel2 p = new MyPanel2();
     
     this.add(p);
     
     this.setVisible(true);
     
     MyListener2 ml = new MyListener2();
     
     
    }
}
