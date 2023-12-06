import Phone.*;
/**
 * 여기에 MyPhoneApp 클래스 설명을 작성하십시오.
 * 
 * @author (작성자 이름) 
 * @version (버전번호나 날짜)
 */
public class MyPhoneApp
{
    public static void main(String[] args){
        IPhone ip = new Phone.IPhone();
        SPhone sp = new Phone.SPhone();
        
        // IPhone ip = new IPhone();
        // SPhone sp = new SPhone();
        
        ip.printLogo();
        sp.printLogo();
    }
}
