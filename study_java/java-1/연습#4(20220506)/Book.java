
/**
 * 여기에 Book 클래스 설명을 작성하십시오.
 * 
 * @author (작성자 이름) 
 * @version (버전번호나 날짜)
 */
public class Book
{
    // 인스턴스 변수 - 다음의 예제를 사용자에 맞게 바꾸십시오
    private String title;
    private String author;

    /**
     * Book 클래스의 객체 생성자
     */
    public Book(String title, String author)
    {
        // 인스턴스 변수의 초기화
        this.title = title;
        this.author = author;
    }

    /**
    * 예제 메소드 - 이 주석을 사용자에 맞게 바꾸십시오
    * 
    * @param  y   메소드의 예제 매개변수
    * @return     x 더하기 y 
    */
    public String setTitle(String title)
    {
    // 여기에 코드를 작성하십시오.
    return this.title = title;
    }
    
    public String setAuthor(String author)
    {
    // 여기에 코드를 작성하십시오.
    return this.author = author;
    }
}
