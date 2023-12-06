
/**
 * 여기에 Point 클래스 설명을 작성하십시오.
 * 
 * @author (작성자 이름) 
 * @version (버전번호나 날짜)
 */
public class Point
{
    // 인스턴스 변수 - 다음의 예제를 사용자에 맞게 바꾸십시오
    private int x;
    private int y;
    
    public Point(){
        this.x = 0;
        this.y = 0;
    }
    
    public Point(int x, int y){
        set(x,y);
    }
    
    /**
     * 예제 메소드 - 이 주석을 사용자에 맞게 바꾸십시오
     * 
     * @param  y   메소드의 예제 매개변수
     * @return     x 더하기 y 
     */
    public void set(int x, int y)
    {
        this.x = x;
        this.y = y;
    }
    
    /**
     * 예제 메소드 - 이 주석을 사용자에 맞게 바꾸십시오
     * 
     * @param  y   메소드의 예제 매개변수
     * @return     x 더하기 y 
     */
    public void showPoint()
    {
        System.out.println("(" + this.x + ", " + this.y + ")");
    }
}
