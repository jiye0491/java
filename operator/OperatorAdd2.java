package operator;

public class OperatorAdd2 {
    public static void main(String[] args) {
        //전위 증감 연산자 사용 예
        int a = 1;
        int b = 0;

        b = ++a; //a의 값을 먼저 증가시키고 그 결과를 b에 대입
        System.out.println("a = " + a + ", b = " + b); // a = 2, b = 2;

        //후위 증감 연산자 사용 예
        a = 1; // a의 값을 다시 1로 지정
        b = 0; // b의 값을 다시 0으로 지정


        b = a++; // 결과를 b에 대입한 후 a의 값을 증가시키기
        System.out.println("a = " + a + ", b = " + b); // a = 3, b = 2
        // 증감 연산자를 단독으로 사용하는 경우에는 다른 연산이 없기 때문에 전위,후위 상관없이 둘 다 결과가 같다. ex: a++;
        
    }
}
