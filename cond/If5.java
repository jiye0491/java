package cond;

public class If5 {
    public static void main(String[] args) {
        int age = 10; // 나이
        int price = 10000; // 물건가격
        int discount = 0;

        if (age <= 10) {
            discount += 1000;
            System.out.println("10살 이하 1,000원 할인");
        }
        if (10000 <= price) {
            discount += 1000;
            System.out.println("10,000원 이상 구매 1,000원 할인");
        }
        System.out.println("총 할인 금액은 " + discount + "원");
    }
}
