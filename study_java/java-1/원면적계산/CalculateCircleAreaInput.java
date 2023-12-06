import java.util.Scanner;

/**
 * 반지름을 입력받아서 원의 면적을 구하는 프로그램
 * 원의 면적을 구하는 프로그램을 작성해보자.(단, π값은 3.14)
 * 
 * @author (2018210059 송주호) 
 * @version (2022.03.18)
 */
public class CalculateCircleAreaInput
{
    public static void main(String[] arg){
        
        final double PI = 3.14;
        double r;
        
        System.out.print("반지름을 입력해주세요: ");
        
        Scanner scan; //참조변수, scan이라는 변수를 참조 8개의 기본 변수가 아니면 참조
        scan = new Scanner(System.in); // 주소값 저장
        r = scan.nextDouble();
        //r = 10.0;
        
        double result;
        result = PI * r * r;
        
        System.out.println(result);
    }
}