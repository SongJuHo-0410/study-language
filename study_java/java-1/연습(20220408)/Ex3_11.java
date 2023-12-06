
/**
 * 여기에 Ex3_11 클래스 설명을 작성하십시오.
 * 
 * @author (작성자 이름) 
 * @version (버전번호나 날짜)
 */
public class Ex3_11
{
    public static void main(String[] arg){
        int[][] raggedArray = new int[4][];
        raggedArray[0] = new int[3];
        raggedArray[1] = new int[2];
        raggedArray[2] = new int[3];
        raggedArray[3] = new int[2];
        
        for(int i = 0; i<raggedArray.length; i++){
            for(int j = 0; j < raggedArray[i].length; j++){
                raggedArray[i][j] = (i+1)*10+j;
                System.out.print(raggedArray[i][j] + " ");
            }
            System.out.println();
        }
    }
}
