/**
 * 
 * @author (2018210059 송주호) 
 * @version (20220603)
 */
public class MyApp
{
    public static void main(String[] args){
        Line line = new Line();
        Rectangle rec = new Rectangle();
        Circle circle = new Circle();
        
        //다형성-동일한 메세지에 대해서 다양하게 반응
        line.draw();  
        rec.draw();
        circle.draw();
        
        //-------------------------
        Shape[] s = new Shape[3];
        s[0] = line;
        s[1] = rec;
        s[2] = circle;
        
        for(int i = 0; i<s.length; i++){
            s[i].draw();
        }
        
        //--------------------------
        //업캐스팅
        MyShape ml= new MyLine();
        MyShape mr = new MyRectangle();
        MyShape mc = new MyCircle();
   
        MyShape[] ms = new MyShape[3];
        ms[0] = ml;
        ms[1] = mr;
        ms[2] = mc;
        
        for(MyShape myS : ms){
            myS.draw();
        }
    }
}
