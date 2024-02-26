package array;

public class ArrayDi2 {
    public static void main(String[] args) {

        // 2x3 2차원 배열

        int[][] array = { {1, 2, 3}, {4, 5, 6} }; // 행2, 열3

        int x = 0;

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++ ) {
                array [i][j] = x++;
                System.out.println("array" + "[" + i + "]" + "[" + j + "]의 값: " + x);
            }
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
