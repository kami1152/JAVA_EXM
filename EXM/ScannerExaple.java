package EXM;

import java.util.Scanner;

public class ScannerExaple {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("x 값 입력 >>");
            String strX = scanner.nextLine();
            if (!isInteger(strX)) {
                System.out.println("숫자만 입력해주세요");
                continue;
            }
            System.out.print("y값 입력 >>");
            String strY = scanner.nextLine();
            if (!isInteger(strY)) {
                System.out.println("숫자만 입력해주세요");
                continue;
            }
            int x = Integer.parseInt(strX);
            int y = Integer.parseInt(strY);

            int res = x + y;
            System.out.println("x + y: " + res);
            break;
        }
        /*
         * while (1) {
         * System.out.println("입력 문자열");
         * String data = scanner.nextLine();
         * if ("q".equalsIgnoreCase(data)) {
         * break;
         * };
         */
    }

    public static boolean isInteger(String str) {
        try {
            Integer.parseInt(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
