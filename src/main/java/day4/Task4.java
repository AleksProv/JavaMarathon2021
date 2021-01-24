package day4;

import java.util.Arrays;
import java.util.Random;

/**
 * Создать новый массив размера 100 и заполнить его случайными числами из диапазона от 0 до 10000.
 * Найти максимум среди сумм трех соседних элементов.
 * Для найденной тройки с максимальной суммой выведите значение суммы и индекс первого элемента тройки.
 * <p>
 * Пример:
 * *Для простоты пример показан на массиве размера 10
 * <p>
 * [1, 456, 1025, 65, 954, 2789, 4, 8742, 1040, 3254]
 * <p>
 * Тройка с максимальной суммой: [8742, 1040, 3254]
 * <p>
 * Вывод в консоль:
 * 13036
 * <p>
 * Пояснение. Первое число - сумма тройки [8742, 1040, 3254].
 * Второе число - индекс первого элемента тройки, то есть индекс числа 8742.
 */

public class Task4 {
    public static void main(String[] args) {
        int summCurrent;
        int sumMax = 0;
        int indexMax = 0;

        Random random = new Random();

        int[] array = new int[100];
        for (int i = 0; i < 100; i++) {
            array[i] = random.nextInt(10000);
        }

        for (int i = 0; i < array.length - 2; i++) {
            summCurrent = array[i] + array[i + 1] + array[i + 2];
            if (summCurrent > sumMax) {
                sumMax = summCurrent;
                indexMax = i;
            }
        }

        System.out.println(Arrays.toString(array));
        System.out.println("Максимальная сумма тройки - " + sumMax);
        System.out.println("Индекс первого элемента тройки - " + indexMax);
    }
}
