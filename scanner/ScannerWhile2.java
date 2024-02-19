package scanner;

import java.util.Scanner;

public class ScannerWhile2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("첫 번째 숫자를 입력하시오(두 숫자가 0인 경우 종료):");
            int num1 = scanner.nextInt();
            System.out.print("두 번째 숫자를 입력하시오(두 숫자가 0인 경우 종료):");
            int num2 = scanner.nextInt();
                if (num1 == 0 && num2 == 0) {
                    System.out.println("프로그램을 종료합니다.");
                    break;
                }
            int sum = num1 + num2;
            System.out.println("두 숫자의 합은: " + sum);

        }
    }
}
