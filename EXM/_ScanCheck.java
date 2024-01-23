package EXM;

import java.util.Scanner;

public class _ScanCheck {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("간단한 문자 or 숫자의 길이를 확인해보기 : ");
        String item = scanner.nextLine();
        for(int i = 0 ; i < item.length(); i++){
            if(!Character.isDigit(item.charAt(i))){
                System.out.println(item.charAt(i)+" 문자다! ");
            }else{
                System.out.println(item.charAt(i)+" 숫자다! ");
            }
        }


        scanner.close();
    }

}
