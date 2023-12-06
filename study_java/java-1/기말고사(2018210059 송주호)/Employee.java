import MyInterface.*;
/**
 * 추상클래스 Employee - 여기에 클래스 설명을 작성하십시오.
 * 
 * @author (작성자 이름)
 * @version (버전 번호나 날짜)
 */
public abstract class Employee implements CanSpeak
{
    public int hoursWorked;
    public String name;
    public int salary;

    public abstract double pay();
    
    public String toString()
    {
        return this.name;
    }
}
