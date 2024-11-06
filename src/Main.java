import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 8.2");
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < arr.length / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length - i - 1];
            arr[arr.length - 1 - i] = temp;
        }
        System.out.println(Arrays.toString(arr));
    }
}