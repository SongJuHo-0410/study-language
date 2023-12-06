package Phone;


/**
 * 여기에 IPhone 클래스 설명을 작성하십시오.
 * 
 * @author (작성자 이름) 
 * @version (버전번호나 날짜)
 */
public class IPhone implements PhoneInterface
{
    public void printLogo(){
        System.out.println("Apple");
    }

    public void receiveCall(){
        System.out.println("iPhone receive call");
    }

    public void sendCall(){
        System.out.println("iPhone send call");
    }
}
