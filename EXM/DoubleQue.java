import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class DoubleQue {

    public static List<Integer> solution(String[] operations) {
        List<Integer> myList = new ArrayList<>();
        List<Integer> res = new ArrayList<>();
        for (String str : operations) {
            if (str.charAt(0) == 'I') {
                myList.add(Integer.parseInt(str.replaceAll("[^\\-?\\d]", "")));
            }
            if (str.charAt(0) == 'D') {
                if (str.contains("-1")) {
                    if (!myList.isEmpty()) {
                        int min = Collections.min(myList);
                        myList.remove(Integer.valueOf(min));
                    }
                } else {
                    if (!myList.isEmpty()) {
                        int max = Collections.max(myList);
                        myList.remove(Integer.valueOf(max));
                    }
                }
            }
            
        }
        if(myList.isEmpty()){
            res.add(0);
            res.add(0);
        }else{
            int max = Collections.max(myList);
            res.add(max);
            int min = Collections.min(myList);
            res.add(min);
        }
        System.out.println(res);
        return res;
    }

    public static void main(String[] args) {
        String[] arr ={"I -45", "I 653", "D 1", "I -642", "I 45", "I 97", "D 1", "D -1", "I 333"};
        String[] arr2 ={"I 16", "I -5643", "D -1", "D 1", "D 1", "I 123", "D -1"};
       System.err.println(solution(arr2));
      
    }
}