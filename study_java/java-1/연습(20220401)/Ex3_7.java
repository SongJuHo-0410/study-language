import java.util.Scanner;
/**
 * 여기에 Ex3_7 클래스 설명을 작성하십시오.
 * 
 * @author (작성자 이름) 
 * @version (버전번호나 날짜)
 */
public class Ex3_7
{
    public static void main(String[] arg){
        //입력 & 계산
        int maxValue = -999;
        Scanner scan = new Scanner(System.in);
        
        System.out.println("양수 5개를 입력하세요.");
        int[] intArray = new int[5];
        for(int i = 0;i < 5;i++){
            intArray[i] = scan.nextInt();
            maxValue = intArray[i];
            if(maxValue < intArray[i]){
                maxValue = intArray[i];
            }
        }
        
        //출력
        System.out.print("가장 큰 수는 " + maxValue + "입니다.");
    }
}
