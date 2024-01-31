package cond;

public class If2 {
    public static void main(String[] args) {
        int age = 17; // 사용자 나이

        if (age >= 18) { //만족하지 않기 때문에 다음으로 넘어감
            System.out.println("성인입니다");
        } else { // if문이 만족되지 않았을 경우 실행 된다.
            System.out.println("미성년자입니다");
        }

    }
}
