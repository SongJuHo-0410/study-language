
import javax.swing.*;

public class TextFieldFrame extends JFrame
{
    public MyPanel mp;
    public TextFieldFrame(){
        this.setTitle("텍스트필드 만들기");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        mp = new MyPanel();
        this.add(mp);
        
        this.setVisible(true);
        this.setSize(250,200);
    }
}
