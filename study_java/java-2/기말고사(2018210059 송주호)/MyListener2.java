import java.awt.event.*;
import java.math.*;

/**
 * 여기에 MyListener2 클래스 설명을 작성하십시오.
 * 
 * @author (송주호) 
 * @version (2019.12.09)
 */
public class MyListener2 implements ActionListener, MouseAdapter 
{
    double PI;
    MyPanel2 p;
    public MyListener2(){
       
    }

    public void actionPerfromed(ActionEvent e){
        display();
    }

    public void mouseDragged(MouseEvent e){
        p.text1.setText("");
        p.text2.setText("");
    }
    
    private void display(){
        double result = 0.0;
        String text = p.text1.getText();
        
        int r = Integer.parseInt(text);
        
        result = 2*PI*r;
        System.out.print("원의 둘레길이 = " + result);
    }
}
