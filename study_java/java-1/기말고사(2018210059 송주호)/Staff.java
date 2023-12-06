import MyInterface.*;
/**
 * 여기에 Staff 클래스 설명을 작성하십시오.
 * 
 * @author (2018210059 송주호) 
 * @version (20220610)
 */
public class Staff extends Employee implements CanSpeak
{
    /**
     * Staff 클래스의 객체 생성자
     */
    public Staff(String name, int salary)
    {
        super.name = name;
        super.salary = salary;
        super.hoursWorked = 80;
    }

    /**
     * 예제 메소드 - 이 주석을 사용자에 맞게 바꾸십시오
     * 
     * @param  y   메소드의 예제 매개변수
     * @return     x 더하기 y 
     */
    public double pay()
    {
        return salary * hoursWorked + 80;
    }
    
    /**
     * 예제 메소드 - 이 주석을 사용자에 맞게 바꾸십시오
     * 
     * @param  y   메소드의 예제 매개변수
     * @return     x 더하기 y 
     */
    public void say()
    {
        System.out.println("<직원 : " + super.name + "," + this.pay() + ">");
    }
}
