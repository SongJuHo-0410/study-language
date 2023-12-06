

import javax.swing.*;
/**
 * 여기에 MyPanel2 클래스 설명을 작성하십시오.
 * 
 * @author (송주호) 
 * @version (2019.12.09)
 */
public class MyPanel2 extends JPanel
{
    private JLabel jl1;
    public JTextField text1, text2;
    private JButton jb1;
    
    public MyPanel2(){
        jl1 = new JLabel("반지름의 값을 입력하시오: ");
        this.add(jl1);
        
        text1 = new JTextField(5);
        this.add(text1);
        
        jb1 = new JButton("원의 둘레길이 계산");
        this.add(jb1);
        
        text2 = new JTextField(23);
        this.add(text2);
       
    }
}
