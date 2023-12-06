
/**
 * 여기에 MyApp 클래스 설명을 작성하십시오.
 * 
 * @author (작성자 이름) 
 * @version (버전번호나 날짜)
 */
public class MyApp
{
    public static void main(String[] args){
        Adder a = new Adder();
        Adder b = new Adder();
        Adder c = new Adder();
        
        System.out.println(a.sum(1.0,2.5));
        System.out.println(b.sum(1,2,3));
        System.out.println(c.sum(1,2));
    }
}
