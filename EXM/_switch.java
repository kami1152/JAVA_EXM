//switch case 문으로 변경
//switch case exp -> 문으로 변경

import java.util.Scanner;

public class _switch {

    public static void main(String[] args) {1
        Scanner scanner = new Scanner(System.in);
        int speed = 0;
        boolean run = true;
        while (run) {
            System.err.println("case 선택");
            int state = scanner.nextInt();
            scanner.nextLine();
            System.err.println("1.증가 2.감속 3.중지");
            String strNum = scanner.nextLine();
            if (state == 1) {
                if (strNum.equals("1")) {
                    speed++;
                } else if (strNum.equals("2")) {
                    speed--;
                } else if (strNum.equals("3")) {
                    run = false;
                }
            }
            if (state == 2) {
                switch (strNum) {
                    case "1":
                        speed++;
                        break;
                    case "2":
                        speed--;
                        break;
                    case "3":
                        run = false;
                        break;
                }
            }
            if (state == 3) {
                switch (strNum) {
                    case "1" -> speed++;
                    case "2" -> speed--;
                    case "3" -> run = false;
                }
            }
            System.err.println("현재 속도 =" + speed);
        }

    }
}