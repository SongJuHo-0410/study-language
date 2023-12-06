
/**
 * 추상클래스 Calc - 값을 초기화 시키는 역할을 합니다.
 * 
 * @author (2018210059 송주호)
 * @version (20220605)
 */
public abstract class Calc
{
    protected int a;
    protected int b;
    public void setValue(int a, int b){
        this.a = a;
        this.b = b;
    }
}
