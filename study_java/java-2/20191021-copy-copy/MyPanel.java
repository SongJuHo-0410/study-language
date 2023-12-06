
import javax.swing.*;

public class MyPanel extends JPanel
{
    public JButton mb;
    
    public MyPanel(){
        mb = new JButton("버튼을 누르시오");
        this.add(mb); //패널에 추가한다.
        
        //mb.addActionListener(new MyListener());

    }
    
    public JButton getButton(){
     return mb;   
    }
}
