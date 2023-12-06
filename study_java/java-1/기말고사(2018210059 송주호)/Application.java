
/**
 * 여기에 Application 클래스 설명을 작성하십시오.
 * 
 * @author (2018210059 송주호) 
 * @version (20220610)
 */
public class Application
{
    public static void main(String[] args){
        Employee[] array = {
        new Professor("홍길동", 20, 16),
        new Professor("이순신", 18, 10),
        new Professor("강감찬", 21, 5),
        new Staff("김유신", 0),
        new Staff("유관순", 59)
        };
        
        double totalPay = 0.0;
        
        for(Employee emp : array){
            emp.say();
            totalPay += emp.pay();
        }
        
        System.out.println("급여총합 = " + totalPay);
    }
}
