import java.util.Scanner;
/**
 * 여기에 MyApp 클래스 설명을 작성하십시오.
 * 
 * @author (작성자 이름) 
 * @version (버전번호나 날짜)
 */
public class MyApp
{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print(">> ");
        
        int operand1 = scan.nextInt();
        String operator = scan.next();
        int operand2 = scan.nextInt();
        
        System.out.println(run(operand1,operator,operand2));
    }
    
    public static double run(int operand1, String operator, int operand2){
        
        Div div = new Div(operand1,operand2);
        double result = div.calculate();
        return result;
    }
}
