/** Задать пустой целочисленный массив длиной 100. С помощью цикла заполнить его значениями 1 2 3 4 5 6 7 8 … 100.
 */
package Homework;

import java.util.Arrays;
public class Task7 {
    public static void main(String[] args) {
        ex1();
    }

    static void ex1() {
        int[] FillArray = new int[100];
        for (int i = 0; i < FillArray.length; i++) {
            FillArray[i] = i + 1;
        }
        System.out.println("массив: ");
        System.out.println(Arrays.toString(FillArray));
    }
}
