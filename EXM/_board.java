package EXM;

public class _board {
    public static void main(String[] args) {
        System.out.println("args.length =" + args.length);
        if(args.length >= 1) System.out.println("args[0] ="  +args[0]);
        if(args.length >= 2) System.out.println("args[1] ="  +args[1]);
        if(args.length >= 2){
            String result = args[0] + args[1];
            System.out.println("result =" + result);
            System.out.println("result =" + String.valueOf(result));

            //String str = "" + result;
            String str = String.valueOf(result);
            System.out.println("str= "+ str);



        }
    }
}
