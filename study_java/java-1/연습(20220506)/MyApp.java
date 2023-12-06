
/**
 * 여기에 MyApp 클래스 설명을 작성하십시오.
 * 
 * @author (작성자 이름) 
 * @version (버전번호나 날짜)
 */
public class MyApp
{
    public static void main(String[] args){
        // Circle c1 = new Circle("원",10);
        // double result = c1.getArea();
        // System.out.print(result);

        //서클 객체를 배열에 저장 
        Circle[] array = new Circle[3]; //array라는 변수가 Circle배열 객체를 참조
        array[0] = new Circle("원1",5);
        array[1] = new Circle("원2",1);
        array[2] = new Circle("원3",3);

        for(Circle temp : array){
            System.out.println(temp.getArea()); 
        }
    }
}

