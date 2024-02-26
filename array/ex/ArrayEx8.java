package array.ex;

import java.util.Scanner;

public class ArrayEx8 {
    public static void main(String[] args) {

        Scanner intput = new Scanner(System.in);

        String [] productNames = new String[10];
        int[] productPrices = new int[10]; // 0 ,1 ,2 ,3, 4, 5, 6, 7, 8, 9
        int productCount = 0;

        while (true) {

            System.out.println("1. 상품 등록 | 2. 상품 목록 | 3. 종료");
            System.out.print("메뉴를 선택하세요:");
            int menu = intput.nextInt();
            intput.nextLine();

            if (menu == 1) {
                System.out.print("상품 이름을 입력하세요.");
                productNames[productCount] = intput.nextLine();
                System.out.print("상품 가격을 입력하세요.");
                productPrices[productCount] = intput.nextInt();
                productCount++;
            } else if (productCount > productNames.length) {
                System.out.println("상품 목록이 가득 찼습니다.");
            }
            if (menu == 2) {
                for (int i = 0; i < productCount; i++) {
                    System.out.println(productNames[i] + ": " + productPrices[i] + "원");
                }
            }

            if (menu == 3) {
                System.out.println("프로그램을 종료합니다.");
                break;
            }

        }

    }
}


