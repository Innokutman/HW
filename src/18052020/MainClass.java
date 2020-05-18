import java.util.Arrays;
public class MainClass

{
    public static void main(String[] args){
        invertArray();
        fillArray();
        changeArray();
        fillDiagonal();
        findMax();
        //ckeckBalance();
    }
    // Задание 1
    public static void invertArray() {
        int[] arr = { 1, 0, 1, 0, 0, 1 };
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                arr[i] = 0;
            }else {
                arr[i] = 1;
                System.out.println(Arrays.toString(arr));
            }
        }
    }
    // Задание 2
    public static void fillArray() {
        int[] array = new int[8];
        array[0] = 0;
        for (int i = 1; i < array.length; i++) {
            array[i] = array[i - 1] + 3;
            System.out.println(Arrays.toString(array));
        }

    }
// Задание 3

    public static void changeArray() {
        int[] w = { 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 };
        for (int i = 0; i < w.length; i++) {
            if (w[i] < 6) {
                w[i] = w[i] * 2;
                System.out.println(Arrays.toString(w));


            }
        }

    }
    // Задание 4
    public static void fillDiagonal() {

        int[][] arr = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (arr[i] == arr[j]) {
                    arr[i][j] = 1;
                } else {
                    arr[i][j] = 0;
                }
                System.out.print(arr[i][j] + " ");

            }
            System.out.println();
        }
    }
    // Задание 5
    public static void findMax() {
        int[] arr = { 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 };
        int max = arr[0];
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(max < arr[i])
                max = arr[i];
            if(min > arr[i])
                min = arr[i];

        }
        System.out.println(max);
        System.out.println(min);
    }
//    // Задание 6
//    public static void checkBalance() {
//        int[] arr = { 1, 2, 3, 3, 2, 1 };
//        int arrTotal += arr[i];
//        int sumRight = 0;
//        int sumLeft=0;
//        for (int i=1; i < arr.length-1; i++){
//            sumLeft += arr[i-1];
//            sumRight = arrTotal - arr[i] - sumLeft;
//            if (sumRight == sumLeft){
//                System.out.println("\nFound = "+arr[i]);
//                break;
//
//
//            }
//        }
//    }
}





