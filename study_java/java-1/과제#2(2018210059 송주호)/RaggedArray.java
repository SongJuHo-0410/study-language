
/**
 * 비정방형 배열을 만들어 값을 초기화하고 출력한 후에 각 행의 합을 구하여 출력하는 프로그램
 * 
 * @author (2018210059 송주호) 
 * @version (20220411)
 */
public class RaggedArray
{
    //배열 생성
    public static int[][] makeArray(){
        int[][] makeArray = new int[4][];
        makeArray[0] = new int[3];
        makeArray[1] = new int[2];
        makeArray[2] = new int[3];
        makeArray[3] = new int[2];
        return makeArray;
    }

    //배열 초기화
    public static int[][] initializeArray(int[][] initializeArray){
        for(int i = 0; i < initializeArray.length; i++){
            for(int j =0; j < initializeArray[i].length; j++){
                initializeArray[i][j] = (i+1)*10+j;
            }
        }
        return initializeArray;
    }

    //배열 출력
    public static void printArray(int[][] printArray){
        for(int i = 0; i < printArray.length; i++){
            for(int j =0; j < printArray[i].length; j++){
                System.out.print(printArray[i][j] + " ");
            }
            System.out.println("");
        }
        System.out.println("----------");
    }
    
    //1개의 행의 합
    public static void sumArray(int[][] sumArray){
        for(int i = 0; i < sumArray.length; i++){
            int sum = 0;
            for(int j =0; j < sumArray[i].length; j++){
                sum += sumArray[i][j];
            }
            System.out.println(sum);
        }
    }

    public static void main(String[] args){
        int[][] intArray;
        intArray = makeArray();
        intArray = initializeArray(intArray);
        printArray(intArray);
        sumArray(intArray);
    }
}
