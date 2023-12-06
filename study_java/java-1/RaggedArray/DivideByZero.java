import java.util.Scanner;
/**
 * 여기에 DivideByZero 클래스 설명을 작성하십시오.
 * 
 * @author (작성자 이름) 
 * @version (버전번호나 날짜)
 */
public class DivideByZero
{
    public static void main(String[] args){
        System.out.print("나뉨수를 입력하시오: ");

        Scanner scan =new Scanner(System.in);
        int dividend = scan.nextInt();

        System.out.print("나눗수를 입력하시오: ");
        int divisor = scan.nextInt();
        try{
            System.out.println(dividend / divisor);
        }
        catch(ArithmeticException e){
            System.out.println("0으로 나누시면 안 돼요~!");
        }
    }
}
