package DoublesArray;

import java.util.Arrays;

public class CopyOfArray {

    // Метод, который работает с копией массива
    public static void modifyCopy(int[] arr) {
        // Создаем копию массива
        int[] arrCopy = Arrays.copyOf(arr, arr.length);
        System.out.println("До изменения в методе modifyCopy (копия): " + Arrays.toString(arrCopy));

        // Изменяем копию массива
        for (int i = 0; i < arrCopy.length; i++) {
            arrCopy[i] += 5;  // Добавляем 10 к каждому элементу
        }

        System.out.println("После изменения в методе modifyCopy (копия): " + Arrays.toString(arrCopy));
    }

    // Метод, который работает с исходным массивом
    public static void modifyOriginal(int[] arr) {
        System.out.println("До изменения в методе modifyOriginal (исходный): " + Arrays.toString(arr));

        // Изменяем сам исходный массив
        for (int i = 0; i < arr.length; i++) {
            arr[i] -= 5;  // Вычитаем 5 из каждого элемента
        }

        System.out.println("После изменения в методе modifyOriginal (исходный): " + Arrays.toString(arr));
    }
}