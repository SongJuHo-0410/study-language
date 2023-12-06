
/**
 * 여기에 Ex3_10 클래스 설명을 작성하십시오.
 * 
 * @author (작성자 이름) 
 * @version (버전번호나 날짜)
 */
public class Ex3_10
{
    public static void main(String[] arg){
        //배열준비
        double[][] score = {
                {3.3, 3.4},
                {3.5, 3.6}, 
                {3.7, 4.0},
                {4.1, 4.2}
            };
        double sum = 0.0;
            
        // for(int i = 0; i < score.length; i++){
            // for(int j = 0; j < score[0].length; j++){
                // sum += score[i][j];
            // }
        // }
        
        for(double[] row : score){
            for(double column : row){
                sum += column;
            }
        }
        
        
        System.out.println(sum / (score.length*score[0].length));
        //계산
        
        
        
        
        //출력
    }
}
