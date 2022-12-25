import java.util.Scanner;

public class IO {
    public static void main(String[] args) {
//        형식   (printf)
//        지시자	    출력 포맷
//        %b	    Boolean
//        %d	    10진수
//        %o	    8진수
//        %x, %X	16진수
//        %c    	Character
//        %s	    String
//        %n	    줄바꿈
        System.out.printf("여보세요? 거기 %s죠?%n%b요. %c%c%c%c%c%c인데요%d"
                ,"집게리아",1!=1,'P','a','t','r','i','c',7);
        System.out.println();

        //print는 이어붙임
        System.out.print('S');
        System.out.print('T');
        System.out.print('A');
        System.out.print('R');
        System.out.print('S');

        //Scanner
//        in.nextByte()		// byte 형 입력 및 리턴
//        in.nextShort()	// short 형 입력 및 리턴
//        in.nextInt()		// int 형 입력 및 리턴
//        in.nextLong()		// long 형 입력 및 리턴
//
//        in.nextFloat()	// float 형 입력 및 리턴
//        in.nextDouble()	// double 형 입력 및 리턴
//
//        in.nextBoolean()	// boolean 형 입력 및 리턴
//
//        in.next()			// String 형 입력 및 리턴	(공백을 기준으로 한 단어를 읽음)
//        in.nextLine()		// String 형 입력 및 리턴 (개행을 기준으로 한 줄을 읽음)
        System.out.println();
        Scanner in = new Scanner(System.in);
        String val0 = in.nextLine();
        String val1 = in.next();
        System.out.println(val0);
        System.out.println(val1);
        // 인풋 어디서 하는건지 모르겠음 + 스트림 배워야한다는데 그 때 알 수 있나...
        // 아 이거 간단하게 걍 콘솔 창에 입력하면됨 ㅋㅋㅋㅋ 찾아봐도 모르겠어서 args에 넣기도하고 엄청 헤맸네
    }
}
