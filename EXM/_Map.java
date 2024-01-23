package EXM;
import java.util.HashMap;
import java.util.*;
public class _Map {
    public static void main(String[] args) {
        // HashMap 생성
        Map<String, Integer> studentScores = new HashMap<>();

        // 맵에 데이터 추가
        studentScores.put("Alice", 90);
        studentScores.put("Bob", 85);
        studentScores.put("Charlie", 95);

        // 맵에서 데이터 조회
        System.out.println("Alice의 점수: " + studentScores.get("Alice"));

        // 맵의 모든 키와 값 출력
        System.out.println("전체 맵 내용:");
        for (Map.Entry<String, Integer> entry : studentScores.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        // 맵에 특정 키가 존재하는지 확인
        String searchKey = "Bob";
        if (studentScores.containsKey(searchKey)) {
            System.out.println(searchKey + "의 점수는 " + studentScores.get(searchKey) + "점 입니다.");
        } else {
            System.out.println(searchKey + "의 정보가 맵에 존재하지 않습니다.");
        }
    }
}
