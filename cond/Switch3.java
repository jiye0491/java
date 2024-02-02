package cond;

public class Switch3 {
    public static void main(String[] args) {
        int grade = 2;

        int coupon;
        switch (grade) {
            case 1 :
                coupon = 1000;
                break;
            case 2 : //break가 없으면 3을 넘어가서 실행한다.
            case 3 :
                coupon = 3000;
                break;
            default:
                coupon = 500;
        }
        System.out.println("발급받은 쿠폰 : " + coupon);

    }
}
