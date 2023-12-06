import MyInterface.*;
import ShapeClasses.*;
/**
 * 여기에 Test 클래스 설명을 작성하십시오.
 * 
 * @author (작성자 이름) 
 * @version (버전번호나 날짜)
 */
public class Test
{
    public static void main(String[] args){
        Shape[] array={
            new Cylinder("원기둥1",2.4,4),
            new Cylinder("원기둥2",4.8,8),
            new Sphere("구1",2.5),
            new Sphere("구2",4.3),
        };
        
        Double totalVolume = 0.0;
        
        for(int i=0;i<array.length;i++){//다형성 사용
            //객체의 정보출력
            System.out.println(array[i]);
           
            //부피값합계 계산
            totalVolume += array[i].computeVolume();
        }
        System.out.println("부피합계 = " + totalVolume);
    }
}
