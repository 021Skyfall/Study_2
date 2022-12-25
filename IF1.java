import java.util.Scanner;

public class IF1 {
    static Scanner myInput = new Scanner(System.in);

    public static void main(String[] args) {
        String num = myInput.nextLine(); // 입력
        switch (num) { // 이거 vba case문이랑 비슷하네 / 근데 이건 연속 읽기라 break로 비상탈출 시켜줘야하는듯
            case "1" :
                System.out.println("num 1 OK");
                break; // break 안 걸어주면 딱 봐도 계속 읽을듯 ㅋㅋ
            case "2" :
                System.out.println("num 2 OK");
                break;
            case "3" :
                System.out.println("num 3 OK");
                break;
            case "4" :
                System.out.println("num 4 OK");
                break;
            case "5" :
                System.out.println("num 5 OK");
                break;
            case "6" :
                System.out.println("num 6 OK");
                break;
            case "7" :
                System.out.println("num 7 OK");
                break;
            case "8" :
                System.out.println("num 8 OK");
                break;
            case "9" :
                System.out.println("num 9 OK");
                break;
            case "10" :
                System.out.println("num 10 OK");
                break;
            case "11" :
                System.out.println("num 11 OK");
                break;
            default : // 없는 값은 디폴트로 설정 ㅇㅋ
                System.out.println(num + " <~ 이건 없는디요");
                break;
        }

    }
}
