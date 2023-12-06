import java.util.Scanner;
/**
 * 여기에 Ex3_8 클래스 설명을 작성하십시오.
 * 
 * @author (작성자 이름) 
 * @version (버전번호나 날짜)
 */
public class Ex3_8
{
    public static void main(String[] arg){
        //입력 & 계산 
        int[] intArray;
        double sum = 0;
        intArray = new int[5];
        Scanner scan = new Scanner(System.in);
        
        System.out.print("5개의 정수를 입력하세요>>");
        
        for(int i = 0; i<intArray.length; i++){
            intArray[i] = scan.nextInt();
            sum += intArray[i];
        }
        
        //출력
        System.out.println("평균은 " + (double)(sum/intArray.length));
        
    }
}
