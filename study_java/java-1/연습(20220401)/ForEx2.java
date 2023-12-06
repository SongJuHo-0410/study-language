
/**
 * 1에서 10까지 출력하고 더하여 출력하는 프로그램(for문 사용)
 * 
 * @author (작성자 이름) 
 * @version (버전번호나 날짜)
 */
public class ForEx2
{
    public static void main(String[] arg){
        int result = 0;
        for(int i=1;i<=10;i++){
            if(i == 10){
                System.out.print(i);
            }
            else{
                System.out.print(i + "+");
            }
            result += i;
        }
        System.out.print("=" + result);
    }
}
