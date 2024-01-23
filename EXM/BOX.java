package EXM;
public class BOX {
    private String name;
    private int num;

    public BOX(String name, int num){
        this.name = name;
        this.num = num;
    }
    public void MyName(){
        System.out.println("my name is "+name);
    }
    public void MyNum(){
        System.out.println("my number is :"+num);
    }
    public void Profile(){
        System.out.println(name+" "+num +" ^^/");
    }
}
