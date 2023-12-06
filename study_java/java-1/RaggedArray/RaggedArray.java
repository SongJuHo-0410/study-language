
/**
 * 여기에 RaggedArray 클래스 설명을 작성하십시오.
 * 
 * @author (작성자 이름) 
 * @version (버전번호나 날짜)
 */
public class RaggedArray
{
    public static void main(String[] args){
        int[][] intArray = makeArray();
        initializeArray(intArray);
        printArray(intArray);
        System.out.println("----------");
        for(int i = 0; i < intArray.length; i++){ 
            System.out.println(sumArray(intArray[i]));
        }     
    }

    //배열 생성 메소드
    public static int[][] makeArray(){
        int[][] raggedArray = new int[4][];
        raggedArray[0] = new int[3];
        raggedArray[1] = new int[2];
        raggedArray[2] = new int[3];
        raggedArray[3] = new int[2];
        return raggedArray;
    }

    //배열 초기화 메소드
    public static void initializeArray(int[][] raggedArray){
        for(int i=0; i<raggedArray.length; i++){
            for(int j=0;j<raggedArray[i].length; j++){
                raggedArray[i][j]= (i + 1) * 10 + j;
            }
        }
    }

    //배열 출력 메소드
    public static void printArray(int[][] raggedArray){
        for(int[] row :raggedArray ){
            for(int value : row){
                System.out.print(value + " ");  
            }
            System.out.println();
        }
    }

    //각 행 합 계산 메소드
    public static int sumArray(int[] array){
        int sum = 0;
        for(int i = 0; i < array.length; i++){
            sum += array[i];
        }
        return sum;
    }
}
