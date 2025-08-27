package javaMethodsLevel3;

public class PlayersHeight {

    public static int MeanHeight(int[] arr){
        int sum = 0;
        for (int j : arr) {
            sum += j;
        }
        return sum / arr.length;
    }


    public static int SumOfHeight(int[] arr){
        int sum = arr[0];
        for (int j : arr) {
            sum = sum + j;
        }
        return sum;
    }

    public static int Shortest(int[] arr){
        int min = arr[0];
        for (int j : arr) {
            if (j < min) {
                min = j;
            }
        }
        return min;
    }

    public static int Tallest(int[] arr){
        int max = 0;
        for (int j : arr) {
            if (j > max) {
                max = j;
            }
        }
        return max;
    }
    public static void main(String[] args) {

        int[] arr = {12,43,23,32,43,12,32};
        System.out.println("Tallest Height = " + Tallest(arr));
        System.out.println("Shortest Height = " + Shortest(arr));
        System.out.println("Mean Height = " + MeanHeight(arr));
        System.out.println("Sum of Height = " + SumOfHeight(arr));

    }
}
