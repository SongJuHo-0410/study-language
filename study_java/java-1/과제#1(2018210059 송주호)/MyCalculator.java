import java.util.Scanner;
/**
 * 계산식을 입력받아서 계산하는 프로그램
 * 
 * @author (2018210059 송주호) 
 * @version (20220323)
 */
public class MyCalculator
{
    public static void main(String[] arg){

        double operand1; //first operand
        double operand2; //second operand
        String operator;
        double result;

        System.out.print("계산식>>");

        Scanner scan = new Scanner(System.in);
        operand1 = scan.nextDouble();
        operator = scan.next();
        operand2 = scan.nextDouble();

        switch(operator){
            case "+":
                result = operand1 + operand2;
                System.out.println(operand1 + " " + operator + " " +
                    operand2 + "의 계산결과는 " + result);
                break;
            case "-":
                result = operand1 - operand2;
                System.out.println(operand1 + " " + operator + " " +
                    operand2 + "의 계산결과는 " + result);
                break;
            case "*":
                result = operand1 * operand2;
                System.out.println(operand1 + " " + operator + " " +
                    operand2 + "의 계산결과는 " + result);
                break;
            case "/":
                if(operand2 != 0){ //when operand2 value is non-zero
                    result = operand1 / operand2;
                    System.out.println(operand1 + " " + operator + " " +
                        operand2 + "의 계산결과는 " + result);
                }
                else{ //when operand2 value is 0
                    System.out.println( "0으로 나눌 수 없습니다!");
                }
                break;
            default:
                System.out.println("오류");
        }
    }
}