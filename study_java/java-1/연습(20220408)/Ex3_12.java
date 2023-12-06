
/**
 * 여기에 Ex3_12 클래스 설명을 작성하십시오.
 * 
 * @author (작성자 이름) 
 * @version (버전번호나 날짜)
 */
public class Ex3_12
{
    public static void main(String[] args){
        int[] returnArray;
        returnArray = makeArray();
        
        for(int value:returnArray){
            System.out.print(value);
        }
    }

    public static int[] makeArray(){
        int[] intArray = new int[4];
        intArray[0] = 0;
        intArray[1] = 1;
        intArray[2] = 2;
        intArray[3] = 3;
        return intArray;
    }
}
