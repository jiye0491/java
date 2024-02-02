package cond.ex;

public class EvenOddEx {
    public static void main(String[] args) {
        int x = 2;

        String result = (0 == x % 2) ? "짝수" : "홀수";
        System.out.println("x = " + x +", " + result);
    }
}
