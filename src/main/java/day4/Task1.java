package day4;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;


/**
 * С клавиатуры вводится число n - размер массива. Необходимо создать массив указанного размера и
 * заполнить его случайными числами от 0 до 10. Затем вывести содержимое массива в консоль,
 * а также вывести в консоль информацию о:
 * а) Длине массива
 * б) Количестве чисел больше 8
 * в) Количестве чисел равных 1
 * г) Количестве четных чисел
 * д) Количестве нечетных чисел
 * е) Сумме всех элементов массива
 * <p>
 * Пример:
 * Введено число 10. Сгенерирован следующий массив:
 * [4, 8, 4, 9, 5, 2, 2, 3, 3, 6]
 * <p>
 * Информация о массиве:
 * Длина массива: 10
 * Количество чисел больше 8: 1
 * Количество чисел равных 1: 0
 * Количество четных чисел: 6
 * Количество нечетных чисел: 4
 * Сумма всех элементов массива: 46
 */

public class Task1 {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int[] array = new int[number];
        int count8 = 0;
        int count1 = 0;
        int chet = 0;
        int nechet = 0;
        int summArray = 0;

        for (int i = 0; i < number; i++) {
            array[i] = random.nextInt(10);
            if (array[i] > 0) {
                count8++;
            }
            if (array[i] == 1) {
                count1++;
            }
            if (array[i] % 2 == 0){
                chet++;
            } else {
                nechet++;
            }
            summArray += array[i];
        }

        System.out.println(Arrays.toString(array));
        System.out.println("Длина массива: " + array.length);
        System.out.println("Количество чисел больше 8: " + count8);
        System.out.println("Количество чисел равных 1: " + count1);
        System.out.println("Количество четных чисел: " + chet);
        System.out.println("Количество нечетных чисел: " + nechet);
        System.out.println("Сумма всех элементов массива: " + summArray);
    }
}
