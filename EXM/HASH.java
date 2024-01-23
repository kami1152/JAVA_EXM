package EXM;
public class HASH {
    private String name;
    private int num;
    public HASH(String name, int num){
        this.name = name;
        this.num = num;
    }
    @Override
    public int hashCode(){
        int result = 17;
        result = 31*result+num;
        result = 31*result+(name != null ? name.hashCode():0);
        return result;
    }
}

