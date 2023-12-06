import java.util.Scanner;
/**
 * -1이 입력될 때까지 입력된 수 평균을 구하는 프로그램(while문 사용)
 * 
 * @author (작성자 이름) 
 * @version (버전번호나 날짜)
 */
public class WhileEx2
{
    public static void main(String[] arg){
        
        Scanner scan = new Scanner(System.in);
        int n = 0;
        int sum = 0;
        int count = 0;
        double average = 0.0;
        
        System.out.println("정수를 입력하고 마지막에 -1을 입력하세요.");
        
        while(n != -1){
            //정수를 입력하여 n에 저장
            n = scan.nextInt();
            //누적 sum += n;
            sum += n;
            //카운트
            count++;
        }
        
        if(n == -1){
            sum = sum - n;
            count--;
            average = sum / count;
        }
        else{
            average = sum/ count;
        }
        
        System.out.println("정수의 개수는 " + count + "개이며 평균은 " +
                                average + "입니다.");
     }
}
