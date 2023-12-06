
import javax.swing.*;
import java.awt.*;

public class MyPanel extends JPanel
{
    private JLabel mlName, mlDept, mlAddress;
    private TextField mtfName, mtfDept, mtfAddress;
    public MyPanel(){
        mlName = new JLabel("이름");
        mlDept = new JLabel("학교");
        mlAddress = new JLabel("주소");
        
        mtfName = new TextField(20);
        mtfDept = new TextField("글로벌소프트웨어학과",20);
        mtfAddress = new TextField(20);
        
        this.add(mlName);
        this.add(mtfName);
        this.add(mlDept);
        this.add(mtfDept);
        this.add(mlAddress);  
        this.add(mtfAddress);
    }
}
