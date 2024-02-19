package scanner.ex;

import java.util.Scanner;

public class ScannerWhileEx4 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int totalPrice = 0;

        while (true){
            System.out.println("1: 상품 입력, 2: 결제, 3: 프로그램 종료");
            int number = input.nextInt();
            input.nextLine();


            int price;
            int quantity;
            int sum;

            if (number == 1) {

                System.out.print("상품명을 입력하세요: ");
                String name = input.nextLine();

                System.out.print("상품의 가격을 입력하세요: ");
                price = input.nextInt();
                input.nextLine();

                System.out.print("구매 수량을 입력하세요: ");
                quantity = input.nextInt();
                input.nextLine();

                sum = price * quantity;
                System.out.println("상품명:" + name + ", 가격:" + price + ", 수량:" + quantity + " 합계:" + sum);
                totalPrice = totalPrice + sum;

            }
            if (number == 2) {
                System.out.println("총 비용: " + totalPrice );
            }
            if (number == 3) {
                System.out.println("프로그램을 종료합니다.");
                break;
            }

        }



    }
}
