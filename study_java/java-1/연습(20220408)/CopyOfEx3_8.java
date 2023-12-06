import java.util.Scanner;
/**
 * ?��기에 CopyOfEx3_8 ?��?��?�� ?��명을 ?��?��?��?��?��?��.
 * 
 * @author (?��?��?�� ?���?) 
 * @version (버전번호?�� ?���?)
 */
public class CopyOfEx3_8
{
    public static void main(String[] arg){
        //?��?�� & 계산 
        int[] intArray;
        double sum = 0;
        intArray = new int[5];
        Scanner scan = new Scanner(System.in);
        
        System.out.print("5개의 정수를 입력하세요>>");
        for(int i = 0; i <5; i++){
            intArray[i] = scan.nextInt();
        }
        
        for(int value : intArray){
            sum += value;
        }
        
        //출력
        System.out.println("평균은 " + (double)(sum/intArray.length));
        
    }
}
