
import javax.swing.*;

public class MyFrame extends JFrame
{
    public JPanel p;
    
    public MyFrame(){
     this.setTitle("이벤트 예제");
     this.setSize(400,300);
     this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     
     p = new MyPanel(); 
     this.add(p); //프레임에 패널을 붙이는 작업
     
     this.setVisible(true);
        
     
    }
}
