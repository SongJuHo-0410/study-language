
/**
 * 중간고사 실습#2
 * 
 * @author (2018210059 송주호) 
 * @version (20220429)
 */
public class MidExam
{
    public static void main(String[] args){
        int[][] raggedArray = makeArray();
        int longestRowLength = findLongestRowLength(raggedArray);
        calculateArray(raggedArray,longestRowLength);
    }

    public static int[][] makeArray(){
        int[][] intArray = {
                {78, 48, 78, 98},
                {99, 92},
                {29, 64, 83},
                {34, 78, 92, 56}
            };
        return intArray;
    }

    public static int findLongestRowLength(int[][] raggedArray){
        //int[][] array = x;
        int longestRowLength = raggedArray[0].length;
        for(int[] array : raggedArray){
            longestRowLength = (longestRowLength <= array.length)
            ? (array.length) : (longestRowLength);
        }
        return longestRowLength;
    }

    public static void calculateArray(int[][] array, int row){
        for(int j = 0; j < row ; j++){
            int sum = 0;
            int n = 0;
            double average = 0.0;

            // inner loop
            int i = 0;

            do{
                // try{
                // sum += array[i][j];
                // }catch(ArrayIndexOutOfBoundsException e){
                // i += 1;
                // continue;
                // }

                //int len = array[i].length;
                //System.out.println(i + " " + j + " " + len);
                if(j < array[i].length){
                    sum += array[i][j];
                }
                else{
                    i += 1;
                    continue;
                }
                n++;
                i += 1;
            }while(i<array.length);

            average = (double)sum / (double)n;
            System.out.println(j+1 + "번째 열 : 합 = " + sum + " 평균 = " + average);
        }
    }
}
