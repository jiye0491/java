package cond;

public class CondOp2 {
    public static void main(String[] args) {
        int age = 18;
        String status = (age >= 18) ? "성인" : "미성년자"; // age = 18
        System.out.println("age = " + age + " status = " + status);
        // 조건이 참이므로, 참 표현식 부분이 선택된다.
    }
}
