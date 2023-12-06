import java.util.Scanner;
/**
 * 가위바위보 프로그램
 * 
 * @author (2018201059 송주호 2018) 
 * @version (20220325)
 */
public class GGBGameApp
{
    public static void main(String[] arg){
        //입력
        String GGB1;
        String GGB2;
        
        System.out.println("가위바위보 게임입니다. 가위, 바위, 보 중에서 입력하세요.");
        
        System.out.print("철수 >> ");
        Scanner scan1 = new Scanner(System.in);
        GGB1 = scan1.next();

        System.out.print("영희 >> ");
        Scanner scan2 = new Scanner(System.in);
        GGB2 = scan2.next();

        //비교
        switch(GGB1){
            case "가위":
                if(GGB2.equals("가위")){
                    System.out.println("철수와 영희가 비겼습니다.");
                }
                else if(GGB2.equals("바위")){
                    System.out.println("영희가 이겼습니다.");
                }
                else if(GGB2.equals("보")){
                    System.out.println("철수가 이겼습니다.");
                }
                else{
                    System.out.println("오류");
                }
                break;
            case "바위":
                if(GGB2.equals("가위")){
                    System.out.println("철수가 이겼습니다.");
                }
                else if(GGB2.equals("바위")){
                    System.out.println("철수와 영희가 비겼습니다.");
                }
                else if(GGB2.equals("보")){
                    System.out.println("영희가 이겼습니다.");
                }
                else{
                    System.out.println("오류");
                }
                break;
            case "보":
                if(GGB2.equals("가위")){
                    System.out.println("영희가 이겼습니다.");
                }
                else if(GGB2.equals("바위")){
                    System.out.println("철수가 이겼습니다.");
                }
                else if(GGB2.equals("보")){
                    System.out.println("철수와 영희가 비겼습니다.");
                }
                else{
                    System.out.println("오류");
                }
                break;
            default:
                System.out.println("오류");
                
                //입력값을 받아서 따로 출력으로 추
        }
    }
}
