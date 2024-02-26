package array;

import java.util.Scanner;

public class ArrayDi1 {
    public static void main(String[] args) {

        // 2x3 2차원 배열
        Scanner input = new Scanner(System.in);

        System.out.print("int 배열의 행을 입력하시오: ");
        int row = input.nextInt();
        System.out.print("int 배열의 열을 입력하시오: ");
        int column = input.nextInt();

        int [][] array = new int[row][column];

        int x = 0;

        for (row = 0; row < array.length; row++) {

            for (column = 0; column < array[row].length; column++ ) {
                array [row][column] = x++;
                System.out.println("array" + "[" + row + "]" + "[" + column + "]의 값: " + x);
            }
        }





        /*

        array[0][0] = 1;
        array[0][1] = 2;
        array[0][2] = 3;
        array[1][0] = 4;
        array[1][1] = 5;
        array[1][2] = 6;


         */





    }
}
