package array.ex;

import java.util.Scanner;

public class ArrayEx6 {
    public static void main(String[] args) {

        // 4x3 배열
        Scanner input = new Scanner(System.in);
        int[][] score = new int[4][3];
        String[] subject = {"국어", "영어", "수학"};


        for (int i = 0; i < score.length; i++) {
            System.out.println(i+1 +"번 학생의 성적을 입력하세요:");
            for (int j = 0; j < score[i].length; j++ ) {
                System.out.print(subject[j] + " 점수:");
                score[i][j] = input.nextInt(); // score[0][0] ~ [4][3]
            }
        }
        // 출력
        double average;

        for (int i = 0; i < score.length; i++) { //학생수 4
            int sum = 0;

            for(int j = 0; j < score[i].length; j++){ //점수 3
                sum = sum + score[i][j]; // sum = sum + [1][0] = 100 + [1][1] = 180 + [1][2] = 250
            }

            average = (double) sum / score[i].length;
            System.out.println("합: " + sum + ", 평: " + average);
        }
        /*
        sum[0][0] + sum[0][1] + sum[0][2] = sum
        sum[1][0] sum[1][1] sum[1][2]
         . . . */

    }
}
