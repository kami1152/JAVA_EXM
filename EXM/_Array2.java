package EXM;

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

    }

}
