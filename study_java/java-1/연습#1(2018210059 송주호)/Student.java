
/**
 * 학생 객체를 나타내는 클래스
 * 
 * @author (2018210059 송주호)
 * @version (2022.03.11)
 */
public class Student
{
    // 인스턴스 변수 - 다음의 예제를 사용자에 맞게 바꾸십시오
    private String name;
    private int score;

    /**
     * Student 클래스의 객체 생성자
     */
    public Student(String n, int s)
    {
        name = n;
        score = s;
    }

    /**
     * 이름을 대답해주는 동작(메소드 method)
     * 
     * @return     name
     */
    public String getName()
    {
        return name;
    }
    
    /**
     * 성적을 대답해주는 메소드
     * 
     * @return     score
     */
    public int getScore()
    {
        return score;
    }
}
