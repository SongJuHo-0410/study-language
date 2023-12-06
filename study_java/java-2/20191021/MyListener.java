import javax.swing.*;
import java.awt.event.*;

public class MyListener implements ActionListener
{
    public void actionPerformed(ActionEvent e){
     JButton b = (JButton)e.getSource();
     if(b.getText().equals("버튼을 누르시오"))
     b.setText("버튼이 눌러졌습니다.");   
     else
     b.setText("버튼을 누르시오");
    }
}
