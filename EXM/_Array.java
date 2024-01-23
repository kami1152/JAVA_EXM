package EXM;

public class _Array {
    public static void main(String[] args) {
        // 정수형 배열 선언과 초기화
        int[] numbers = { 1, 2, 3, 4, 5 };

        // 배열의 길이 출력
        System.out.println("배열의 길이: " + numbers.length);

        // 배열의 각 요소 출력
        System.out.print("배열의 요소: ");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }

        // 향상된 for문을 사용한 배열 요소 출력
        System.out.print("\n향상된 for문을 사용한 배열 요소: ");
        for (int num : numbers) {
            System.out.print(num + " ");
        }

    }

}
