
/**
 * 여기에 Vehicle 클래스 설명을 작성하십시오.
 * 
 * @author (작성자 이름) 
 * @version (버전번호나 날짜)
 */
public class Vehicle
{
    // 인스턴스 변수 - 다음의 예제를 사용자에 맞게 바꾸십시오
    private int doors;
    private int speed;
    private String color;
    
    public void run(){
        System.out.println("run~");   
    }
    
    public int getSpeed(){
        return this.speed;
    }
    
    public void setSpeed(int speed){
        this.speed = speed;
    }
    
}
