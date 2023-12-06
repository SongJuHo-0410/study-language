
import java.awt.event.*;
import javax.swing.*;
import java.awt.*;
/**
 * 여기에 MyFraem 클래스 설명을 작성하십시오.
 * 
 * @author (작성자 이름) 
 * @version (버전번호나 날짜)
 */
public class MyFrame extends JFrame implements ActionListener
{
    public JPanel mp;
    public JButton mb1, mb2, mb3;
    public MyFrame(){
        this.setTitle("JComponent 공통 메소드 연습");
        this.setSize(300,400);
        
        mp = new JPanel();
        mb1 = new JButton("Magenta/Yellow Button");
        mb2 = new JButton("Disabled Button");
        mb3 = new JButton("getX() & getY()");
        
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
        
        mb1.setBackground(Color.yellow);
        mb1.setForeground(Color.red);
        mb1.setFont(new Font("SansSerif",Font.ITALIC, 20));
        
        mb2.setEnabled(false);
        
        this.add(mp);
        mp.add(mb1);
        mp.add(mb2);
        mp.add(mb3);
        
        mb3.addActionListener(this);
    }
    
    public void actionPerformed(ActionEvent e){
       JButton b = (JButton)e.getSource();
       int x = b.getX();
       int y = b.getY();
       MyFrame top = (MyFrame)b.getTopLevelAncestor();
       top.setTitle(x + "," + y);
    }
}
