/**
 * 나누는 일을 하는 클래스
 * 
 * @author (20182210059 송주호) 
 * @version (20220521)
 */
public class Div
{
    private int a;
    private int b;

    //Div 클래스의 객체 생성자
    public Div(int a, int b)
    {
        this.a = a;
        this.b = b;
    }

    public double calculate()
    {   
        // if(this.b == 0){
            // System.out.println("0으로 나눌 수 없습니다.");
        // }
        
        return (double)this.a / (double)this.b;
    }

    public void setValue(int a, int b){
        this.a = a;
        this.b = b;
    }
}
