
/**
 * 원의 면적을 구하는 프로그램
 * 원의 면적을 구하는 프로그램을 작성해보자.(단, 반지름 값은 10.0, π값은 3.14)
 * 
 * @author (2018210059 송주호) 
 * @version (2022.03.18)
 */
public class CalculateCircleArea
{
    public static void main(String[] arg){
        
        final double PI = 3.14;
        double r;
        r = 10.0;
        
        double result;
        result = PI * r * r;
        
        System.out.println(result);
    }
}
