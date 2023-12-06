package Phone;


/**
 *   인터페이스 PhoneInterface - 여기에 인터페이스 설명을 작성하십시오.
 * 
 * @author (작성자 이름) 
 * @version (버전 번호나 날짜)
 */

public interface PhoneInterface
{
    public final int TIMEOUT = 60;
    public abstract void printLogo();
    public abstract void receiveCall();
    public abstract void sendCall();
}
