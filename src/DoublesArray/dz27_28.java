package DoublesArray;

import java.util.Arrays;

public class dz27_28 {
    public static void main(String[] args) {

        /**
         * Cоздание двумерного массива 3х3
         *
         * @param matrix массив
         * @return matrix Вывод массива в виде матрицы
         */
        int[][] matrix = new int[3][3];
        int value = 1;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrix[i][j] = value++;
            }
        }

        // Массив в виде матрицы
        System.out.println("Матрица 3x3:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();


        }

        // Находит сумму элементов в каждой строке и выводит её.
        System.out.println("Сумма элеменетов в каждой строке");
        for (int i = 0; i < 3; i ++) {
            int summ = 0;
            for (int j = 0; j < 3; j++) {
                summ += matrix[i][j];

            }
            System.out.println("Сумма строки " + (i + 1) + ": " + summ);
        }
        // Находим сумму элементов в каждом столбце и выводим ее.
        System.out.println("Сумма элементов в каждом столбце");
        for (int j = 0; j < 3; j++) {
            int summColumn = 0;
            for (int i = 0; i < 3; i++) {
                summColumn += matrix[i][j];
            }
            System.out.println("Сумма столбца " + (j + 1) + ": " + summColumn);
        }

    }

}


