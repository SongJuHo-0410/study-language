
/**
 * 여기에 Point 클래스 설명을 작성하십시오.
 * 
 * @author (작성자 이름) 
 * @version (버전번호나 날짜)
 */
public class Point
{
    private int x;
    private int y;
    
    public Point(int x, int y){
        this.x = x;
        this.y = y;
    }
    
    public String toString(){
        return "Point(" + this.x + "," + this.y +")";
    }
}
