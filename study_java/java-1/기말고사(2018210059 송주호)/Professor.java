import MyInterface.*;
/**
 * 여기에 Professor 클래스 설명을 작성하십시오.
 * 
 * @author (작성자 이름) 
 * @version (버전번호나 날짜)
 */
public class Professor extends Employee implements CanSpeak
{
    /**
     * Professor 클래스의 객체 생성자
     */
    public Professor(String name, int salary, int officeHours)
    {
        super.name = name;
        super.salary = salary;
        super.hoursWorked = officeHours;
    }
    
    /**
     * 예제 메소드 - 이 주석을 사용자에 맞게 바꾸십시오
     * 
     * @param  y   메소드의 예제 매개변수
     * @return     x 더하기 y 
     */
    public double pay()
    {
        return salary * hoursWorked + bonus();
    }
    
    //오버라이딩
    public void say()
    {
        System.out.println("<교수 : " + toString() + "," + this.pay() + ">");
    }
    
    /**
     * 예제 메소드 - 이 주석을 사용자에 맞게 바꾸십시오
     * 
     * @param  y   메소드의 예제 매개변수
     * @return     x 더하기 y 
     */
    private double bonus()
    {
        return hoursWorked * 200;
    }
}
