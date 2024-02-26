package array;

public class ArrayDi3 {
    public static void main(String[] args) {

        // 2x3 2차원 배열

        int[][] array = new int[4][5];

        int i = 1;
        for (int row = 0; row < array.length; row++) {
            for (int column = 0; column < array[row].length; column++ ) {
                array [row][column] = i++;
                System.out.print(array[row][column] + " ");
            }
            System.out.println();
        }
        /*
        array[0][0] = 1; // 0행, 0열
        array[0][1] = 2; // 0행, 1열
        array[0][2] = 3; // 0행, 2열
        array[1][0] = 4; // 1행, 0열
        array[1][1] = 5; // 0행, 1열
        array[1][2] = 6; // 0행, 2열
         */





    }
}
