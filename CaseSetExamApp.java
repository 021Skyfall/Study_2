import java.time.LocalDate;
import java.util.Scanner;

import static java.lang.System.*; // System 클래스 이거 첨봄 ㅋㅋ IDE야 고마워!#2

public class CaseSetExamApp {
    static Scanner date = new Scanner(in); // 근무년도
    static Scanner position = new Scanner(in); // 직급 ~> 부장, 차장, 과장, 대리, 사원 중 택 1

    public static void main(String[] args) {
        LocalDate now = LocalDate.now();
        int annual = now.getYear();
        int year = annual - date.nextInt();
        String rank = position.next(); // 공백 없이 입력되도록

        out.print("현재 연차는 "+year+"년이며 ");
        switch (rank) {
            case "부장" :
            case "차장" :
            case "과장" :
            case "대리" :
            case "사원" : // 이런식으로 출력할 값이 같으면 합쳐지네 IDE야 고마워! ~> Fall through라고 함 집어던지기~
                out.print("직급은 "+rank+"입니다.\n");
                break; // 메소드 정의 할때는 break 필요없음 : 값 return
            default :
                out.println("\n!!*입력 오류*!!\n직급은 부장, 차장, 과장, 대리, 사원 중 하나만 입력해주세요.");
        }
        if (rank.equals("부장")) {
            out.println("현재 "+rank+"직급의 평균 연봉은 7450만원입니다.");
        } else if(rank.equals("차장")) {
            out.println("현재 "+rank+"직급의 평균 연봉은 6640만원입니다.");
        } else if (rank.equals("과장")) {
            out.println("현재 "+rank+"직급의 평균 연봉은 5070만원입니다.");
        } else if (rank.equals("대리")) {
            out.println("현재 "+rank+"직급의 평균 연봉은 4040만원입니다.");
        } else if (rank.equals("사원")) {
            out.println("현재 "+rank+"직급의 평균 연봉은 3020만원입니다."); // 얘네도 메소드로 묶을 수 있을거같은데 흠
        } else {
            out.println("입력된 직급이 존재하지 않습니다.");
        }
    }
}
