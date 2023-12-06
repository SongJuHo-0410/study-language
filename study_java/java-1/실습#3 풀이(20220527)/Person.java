
/**
 * 여기에 Person 클래스 설명을 작성하십시오.
 * 
 * @author (작성자 이름) 
 * @version (버전번호나 날짜)
 */
public class Person
{
    int age;
    protected int height;
    public String name;
    private int weight;
    
    public int getWeight(){
        return this.weight;
    }
    
    public void setWeight(int weight){
        this.weight = weight;
    }
}