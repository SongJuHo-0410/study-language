
/**
 * 여기에 MyPointApp 클래스 설명을 작성하십시오.
 * 
 * @author (작성자 이름) 
 * @version (버전번호나 날짜)
 */
public class MyPointApp
{
    public static void main(String[] args){
        Point point1 = new Point(6,3);
        System.out.println(point1.toString());
        System.out.println(point1); //toString 없어도 toString이 적용됨
        //반드시 오버라이딩 해야함 꼭
    }
}
