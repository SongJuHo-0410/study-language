
import javax.swing.*;
import java.awt.event.*;

public class MyFrame extends JFrame implements ActionListener
{
    public MyPanel p;
    public JButton mb;

    public MyFrame(){
        this.setTitle("이벤트 예제");
        this.setSize(400,300);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        p = new MyPanel(); 
        this.add(p); //프레임에 패널을 붙이는 작업
        mb = p.getButton();
        mb.addActionListener(new MyListener());
        this.setVisible(true);

    }
    public class MyListener {
        public void actionPerformed(ActionEvent e){
            JButton b = (JButton)e.getSource();
            if(b.getText().equals("버튼을 누르시오"))
                b.setText("버튼이 눌러졌습니다.");   
            else
                b.setText("버튼을 누르시오");
        }
    }
}
