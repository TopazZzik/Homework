/**1. Пусть дан произвольный список целых чисел,
 удалить из него четные числа (в языке уже есть что-то готовое для этого)*/


package Homework3;

import java.util.*;

public class Hw1 {

    static List<Integer> list = new ArrayList<>();

    public static void main(String[] args) {
        add();
        remove();
    }

    private static void add() {
        for (int i = 0; i < 10; i++) {
            Random random = new Random();
            list.add(random.nextInt(10));
        }
        System.out.println(list);
    }

    private static void remove() {
        int i = 0;
        while (i<list.size()) {
            if (list.get(i) % 2 == 0) {
                list.remove(i);
            }
            else {
                i++;
            }
        }
        System.out.printf("Список с удаленными четными числами %s", list);
    }
}









