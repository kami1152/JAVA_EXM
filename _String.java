public class _String {
    public static void main(String[] args) {

        String name1 = "자바 프,로그\n래밍";
       
        System.out.println(name1.indexOf("자"));
        System.out.println(name1.indexOf("빈"));
        System.out.println(name1.indexOf("밍"));

        int idxl = name1.indexOf("저");
        String[] arr = name1.split(",");
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr);
        int tag = 10000;
        String arr3[] = new String[tag];
        for(int i = 0;i<tag;i++){
            arr3[i] = Integer.toString(i);

        }
        
        System.err.println(arr3[0]);
        System.err.println(arr3[1]);
        System.err.println(arr3[tag-1]);

        for(String element : arr3){
            System.err.println(element);
        }

    }
}
