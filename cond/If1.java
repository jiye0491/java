package cond;

public class If1 {
    public static void main(String[] args) {
        int age = 27; // 사용자 나이

        if (age >= 18) { // ture가 되면 실행
            System.out.println("성인입니다.");
        }
        if (age <= 18) { // false가 되면 바로 다음 라인으로 감
            System.out.println("미성년자입니다.");
        }
    }
}
