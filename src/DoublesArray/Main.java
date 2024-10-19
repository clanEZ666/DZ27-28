package DoublesArray;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Исходный массив
        int[] arr = {1, 2, 3, 4, 5};

        // Вызываем первый метод, который работает с копией массива
        System.out.println("Исходный массив перед вызовом modifyCopy: " + Arrays.toString(arr));
        CopyOfArray.modifyCopy(arr);
        System.out.println("Исходный массив после вызова modifyCopy: " + Arrays.toString(arr));
        System.out.println();

        // Вызываем второй метод, который изменяет сам исходный массив
        System.out.println("Исходный массив перед вызовом modifyOriginal: " + Arrays.toString(arr));
        CopyOfArray.modifyOriginal(arr);
        System.out.println("Исходный массив после вызова modifyOriginal: " + Arrays.toString(arr));
    }
}