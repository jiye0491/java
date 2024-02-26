package array.ex;

import java.util.Scanner;

public class ArrayEx5 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("정수의 반복 횟수를 입력하세요:");
        int replay = input.nextInt();
        int [] numbers = new int[replay];

        // 배열에 값 대입
        System.out.println(replay+ "개의 정수를 입력하세요:");
        for (int i = 0; i < numbers.length; i++){
            numbers[i] = input.nextInt();
        }// 5,3,8,9,7
        int max = numbers[0]; // 5
        int min = numbers[0];

        for (int i = 1; i < numbers.length; i++){

            if (max < numbers[i]){ // 5 < 3 ? 5 < 8 < 9
                max = numbers[i]; // 8[2]
            }
            if (min > numbers[i]){ //5 > 3 >
                min = numbers[i]; // 3 [2],
            }
        }
        System.out.println("가장 큰 정수: " + max);
        System.out.println("가장 작은 정수: " + min);

    }
}
