
/**
 * 여기에 MyAppRectangle 클래스 설명을 작성하십시오.
 * 
 * @author (작성자 이름) 
 * @version (버전번호나 날짜)
 */
public class MyAppRectangle
{
    public static void main(String[] args){
        Rectangle rectangle1 = new Rectangle(10,10);
        Rectangle rectangle2 = new Rectangle(20,20);
        Rectangle rectangle3 = new Rectangle(30,30);

        System.out.print(rectangle1.getArea() +
            rectangle2.getArea() + rectangle3.getArea());
    }
}
