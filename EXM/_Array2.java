
public class _Array2 {

    public static void main(String[] args) {
        // 2차원 배열 선언과 초기화
        int[][] matrix = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }
        };
        // 2차원 배열의 행과 열의 길이 출력
        System.out.println("a행의 길이: " + matrix.length);
        System.out.println("열의 길이: " + matrix[0].length);

        // 2차원 배열의 각 요소 출력
        System.out.println("2차원 배열의 요소:");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }




        int [][] arr2 = {
            {10, 20, 30, 40},
            {60, 70, 80, 90}
         };
         
        float avg = _calcscore(arr2);
        System.out.println(avg);
    }


    //전체 반의 평균점수 구하기
    static float _calcscore(int[][] arr){
        int res = 0;
        int element = 0;
        final int totalscore=0;
        for(int _class[] : arr){
            for(int number : _class){
                res += number;
                element++;
            }
        }
        return res/element;
    }

    static float _testarray(int[] arr){
        int result = 0;
        for(int _new : arr){

        }
        return result;
    }
}
