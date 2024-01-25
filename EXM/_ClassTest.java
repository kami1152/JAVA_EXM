

public class _ClassTest {

    public int q = 15;

    static int x = 10;
    private static int z = 1000;
    public _ClassTest(){
        ok();
    }
    static int ok(){
        int y = 100;
        int p = 10;
        System.out.println("call");
        z++;
        x++;
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
        return 0;
    }
    public static void no(){
        System.out.println("no");
        x++;
        System.out.println(x);
    }
    public static int wow(int z){
        z++;
        return z;
    }


}
