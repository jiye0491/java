package casting;

public class Casting4 {
    public static void main(String[] args) {
        int div1 = 3 / 2;
        System.out.println("div1 = " + div1); // 1, int 이므로, int 타입 결과

        double div2 = 3 / 2;
        System.out.println("div2 = " + div2); // 1.0 , int 타입끼리 계산 -> int 로 형변

        double div3 = 3.0 / 2; //1.5
        System.out.println("div3 = " + div3); // 1.5 // 다른 타입 int < double 더블로 형변

        double div4 = (double) 3 / 2;
        System.out.println("div4 = " + div4); // 1.5 // double 타입끼리 계산 -> double로 형변

        int a = 3;
        int b = 2;
        double result = (double) a / b; // double로 형변환
        System.out.println("result = " + result); // 1.5 , double 형변환후 더블끼리 계산
    }
}
