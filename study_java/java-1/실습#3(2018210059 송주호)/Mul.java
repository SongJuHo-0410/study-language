/**
 * 곱하는 일을 하는 클래스
 * 
 * @author (20182210059 송주호) 
 * @version (20220521)
 */
public class Mul
{
    private int a;
    private int b;

    //Mul 클래스의 객체 생성자
    public Mul(int a, int b)
    {
        this.a = a;
        this.b = b;
    }

    public int calculate()
    {        
        return this.a * this.b;
    }

    public void setValue(int a, int b){
        this.a = a;
        this.b = b;
    }
}
