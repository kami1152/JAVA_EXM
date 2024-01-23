package EXM;

import java.util.Arrays;

public class Deepcopy {

    public static void main(String[] args) {
        int[] numbers = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        int[] numbers2 = numbers;
        int[] newnumbers = _createArray(numbers);
        System.out.println(Arrays.toString(numbers));
        System.out.println(Arrays.toString(numbers2));
        System.out.println(Arrays.toString(newnumbers));
        numbers2[0] = 10;
        System.out.println(Arrays.toString(numbers));
        System.out.println(Arrays.toString(numbers2));
        System.out.println(Arrays.toString(newnumbers));

    }

    static int[] _createArray(int[] num) {
        int[] result = new int[num.length];
        for (int i = 0; i < num.length; i++) {
            result[i] = num[i];
        }
        return result;
    }
}