import java.util.Scanner;
/**
 * 2개의 정수와 연산자를 입력 받은 후, 연산하여 결과값을 보여주는 프로그램
 * 
 * @author (2018210059 송주호) 
 * @version (20220521)
 */

public class MyApp
{
    public static void main(String[] args){
        System.out.print("계산식을 입력하시오(예: >> 5 + 7) >> ");
        Scanner scan = new Scanner(System.in);
        int operand1 = scan.nextInt();
        String operator = scan.next();
        int operand2 = scan.nextInt();
        
        if(operator != "/" & operand2 != 0){
            System.out.println(run(operand1, operator, operand2));
        }
        else{
            System.out.println("0으로 나눌 수 없습니다.");
        }
        //return 값이 반드시 있어서 화면출력 시 
        //오류 값이 안 나오게 하기위해 main메소드 작성
    }

    public static double run(int operand1,String operator, int operand2){
        double result = 0.0;
        switch(operator){
            case "+":
                Add add = new Add(operand1,operand2);
                add.setValue(operand1,operand2);
                result = add.calculate();
                break;
            case "-":
                Sub sub = new Sub(operand1,operand2);
                sub.setValue(operand1,operand2);
                result = sub.calculate();
                break;
            case "*":
                Mul mul = new Mul(operand1,operand2);
                mul.setValue(operand1,operand2);
                result = mul.calculate();
                break;
            case "/":
                Div div = new Div(operand1,operand2);
                div.setValue(operand1,operand2);
                result = div.calculate();      
                break;
            default :
                System.out.println("연산자가 올바르지 않습니다.");
            //연산자 오류 발생 시 오류 값이 출력되는 문제는 미해결
        }
        return result;
    }
}

