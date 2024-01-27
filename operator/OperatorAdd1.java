package operator;

public class OperatorAdd1 {
    public static void main(String[] args) {
        int a = 0;
        a = a + 1;
        System.out.println("a = " + a); // 1
        a = a + 1;
        System.out.println("a = " + a); //2

        //증감 연산자
        ++a; // a = a +1
        System.out.println("a = " + a); //3
        ++a; // a = a +1
        System.out.println("a = " + a); //4

        /*
         ++a : 증감연산자를 피연산자 앞에 둘 수 있음 전위증감연산자 (값을 먼저 증가시키고 그다음 계산)
         a++ : 증감연산자를 피연산자 뒤에 둘 수 있음 후위증감연산자 (계산 먼저 하고 값 증가)
         */

    }
}
