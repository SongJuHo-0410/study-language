package Phone;


/**
 * 여기에 SPhone 클래스 설명을 작성하십시오.
 * 
 * @author (작성자 이름) 
 * @version (버전번호나 날짜)
 */
public class SPhone implements PhoneInterface
{
    public void printLogo(){
        System.out.println("SamSung~!");
    }

    public void receiveCall(){
        System.out.println("sPhone receive call");
    }

    public void sendCall(){
        System.out.println("sPhone send call");
    }
}

