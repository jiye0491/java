package array.ex;

import java.util.Scanner;

public class ArrayEx4 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("정수의 반복 횟수를 입력하세요:");
        int replay = input.nextInt();
        int [] numbers = new int[replay];
        int sum = 0;

        // 배열에 값 대입
        System.out.println(replay+ "개의 정수를 입력하세요:");
        for (int i = 0; i < numbers.length; i++){
            numbers[i] = input.nextInt();
            sum += numbers[i];
        }
        System.out.println("입력한 정수의 합게: " + sum);
        double average = (double) sum / replay;
        System.out.println("입력한 정수의 평균: " + average);

    }
}
