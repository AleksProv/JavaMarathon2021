package day4;

import java.util.Random;

/**
 * Заполнить двумерный массив (матрицу) случайными числами от 0 до 50.
 * Размер матрицы задать m=12, n=8 (m - размерность по строкам, n - размерность по колонкам).
 * В консоль вывести индекс строки, сумма чисел в которой максимальна.
 * Если таких строк несколько, вывести индекс последней из них.
 * Пример сгенерированной матрицы (для простоты m=3, n=5):
 * <p>
 * 3 2 1 5 7 	// сумма - 18
 * 1 2 5 6 2 	// сумма - 16
 * 3 4 9 6 4	// сумма - 26
 * <p>
 * Ответ: 2 (индекс строки, сумма чисел в которой максимальна)
 */

public class Task3 {
    public static void main(String[] args) {
        Random random = new Random();
        int m = 12;
        int n = 8;
        int summaMax = 0;
        int indexMax = 0;
        int strokaMax = 0;

        int[][] array = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                array[i][j] = random.nextInt(50);
            }
        }

//вывод на экран двумерного массива
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                summaMax += array[i][j];
                if (j == array[i].length - 1) {
                    System.out.print(array[i][j] + "  сумма - " + summaMax + " индекс - " + i + "\t");
                } else {
                    System.out.print(array[i][j] + "\t");
                }
            }
            System.out.println();
            if (strokaMax < summaMax) {
                strokaMax = summaMax;
                indexMax = i;
            }
            summaMax = 0;
        }
        System.out.println(" ");
        System.out.println("Индекс строки, сумма чисел в которой максимальна - " + indexMax + ". Сумма - " + strokaMax);

    }
}
