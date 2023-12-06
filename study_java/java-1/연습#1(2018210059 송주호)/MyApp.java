
/**
 * 여기에 MyApp 클래스 설명을 작성하십시오.
 * 
 * @author (작성자 이름) 
 * @version (버전번호나 날짜)
 */
public class MyApp
{
    public static void main(String[] args){
        
        Student student1 = new Student("홍길동",81);
        Student student2 = new Student("김철수",73);
        Student student3 = new Student("이선문",95);
        
        int score1 = student1.getScore();
        int score2 = student2.getScore();
        int score3 = student3.getScore();
        
        int total = score1 + score2 + score3;
        float average = total / 3;
        
        System.out.println(total);
        System.out.println(average);
    }
}
