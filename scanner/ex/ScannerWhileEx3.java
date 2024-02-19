package scanner.ex;

import java.util.Scanner;

public class ScannerWhileEx3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("숫자를 입력하세요. 입력을 중단하려면 -1을 입력하세요: ");
        int sum = 0;
        int replay = 0;

        while(true){

            int number = scanner.nextInt();

            if (number == -1) {
                break;
            }

            sum = number + sum;
            replay++;

            }
        double average = (double) sum / replay;
        System.out.println("입력한 숫자들의 합계: " + sum);
        System.out.println("입력한 숫자들의 평균: " + average);
        }
    }

