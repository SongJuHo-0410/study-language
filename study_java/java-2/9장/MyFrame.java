import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame{
    public MyFrame(){
        this.setTitle("2018210059 송주호");
        this.setSize(300,200);
        this.setVisible(true);
        
        JButton add = new JButton("Add");
        JButton sub = new JButton("Sub");
        JButton mul = new JButton("Mul");
        JButton div = new JButton("Div");
        
        JPanel p = new JPanel();
        FlowLayout fl = new FlowLayout();
        p.setLayout(fl);
        p.add(add);
        p.add(sub);
        p.add(mul);
        p.add(div);
        
        this.add(p);
        
        //FlowLayout fl = new FlowLayout();
        //this.setLayout(fl);
        
        //GridLayout gl = new GridLayout(1,4);
        //this.setLayout(gl);
        
        //this.add(add);
        //this.add(sub);
        //this.add(mul);
        //this.add(div);
        
        
    }
}
