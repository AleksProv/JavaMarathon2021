package day4;

import java.util.Arrays;
import java.util.Random;

/**
 * Создать новый массив размера 100 и заполнить его случайными числами из диапазона от 0 до 10000.
 * Затем, используя цикл for each вывести в консоль:
 * наибольший элемент массива
 * наименьший элемент массива
 * количество элементов массива, оканчивающихся на 0
 * сумму элементов массива, оканчивающихся на 0
 * <p>
 * Использовать сортировку запрещено.
 */

public class Task2 {
    public static void main(String[] args) {
        int numberZero = 0;
        int summZero = 0;

        Random random = new Random();

        int[] array = new int[100];
        for (int i = 0; i < 100; i++) {
            array[i] = random.nextInt(10000);
        }
        int maxNumber = array[0];
        int minNumber = array[0];

        for (int number : array) {
            if (maxNumber < number) {
                maxNumber = number;
            }
            if (minNumber > number) {
                minNumber = number;
            }
            if (number % 10 == 0) {
                numberZero++;
                summZero += number;
            }
        }

        System.out.println(Arrays.toString(array));
        System.out.println("Наибольший элемент массива: " + maxNumber);
        System.out.println("Наименьший элемент массива: " + minNumber);
        System.out.println("Количество элементов массива, оканчивающихся на 0: " + numberZero);
        System.out.println("Сумма элементов массива, оканчивающихся на 0: " + summZero);
    }
}
