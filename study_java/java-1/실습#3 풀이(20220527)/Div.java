
/**
 * 여기에 Div 클래스 설명을 작성하십시오.
 * 
 * @author (작성자 이름) 
 * @version (버전번호나 날짜)
 */
public class Div
{
    // 인스턴스 변수 - 다음의 예제를 사용자에 맞게 바꾸십시오
    private int a;
    private int b;
    
    /**
     * Add 클래스의 객체 생성자
     */
    public Div(int a, int b)
    {
        this.setValue(a,b);
    }

    /**
     * 예제 메소드 - 이 주석을 사용자에 맞게 바꾸십시오
     * 
     * 
     * @return    
     */
    public double calculate()
    {
        return (double)this.a / (double)this.b;
    }
    
    /**
     * 예제 메소드 - 이 주석을 사용자에 맞게 바꾸십시오
     * 
     * 
     * @return    
     */
    public void setValue(int a, int  b)
    {
        this.a = a;
        this.b = b;
    }
}
