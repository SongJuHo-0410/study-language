
/**
 * 여기에 Circle 클래스 설명을 작성하십시오.
 * 
 * @author (작성자 이름) 
 * @version (버전번호나 날짜)
 */
public class Circle
{
    // 인스턴스 변수 - 다음의 예제를 사용자에 맞게 바꾸십시오
    private String name;
    private int radius;
    
    /**
     * Circle 클래스의 객체 생성자
     */
    public Circle(String name,int r)
    {
        //인스턴스 변수의 초기화
        this.name =  name;
        this.radius = r;
    }

    /**
     * 면적을 답해주는 메소드
     * 
     * @param
     * @return    원면적 
     */
    public double getArea()
    {
        // 여기에 코드를 작성하십시오.
        return 3.14 * this.radius * this.radius;
    }
}
