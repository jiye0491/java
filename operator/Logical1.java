package operator;

public class Logical1 {
    public static void main(String[] args) {
        System.out.println("&& : AND 연산");
        System.out.println(true && true); // 참
        System.out.println(true && false); // 거짓
        System.out.println(false && false); // 거짓

        System.out.println("|| : OR 연산");
        System.out.println(true || true); // 참
        System.out.println(true || false); // 참
        System.out.println(false || false); // 거짓

        System.out.println(" ! 연산");
        System.out.println(!true); //false
        System.out.println(!false); // true

        System.out.println("변수 활용");
        boolean a = true;
        boolean b = false;

        System.out.println(a && b);//거짓
        System.out.println(a || b);//참
        System.out.println(!a);//거짓
        System.out.println(!b);//참
    }
}
