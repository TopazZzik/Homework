package Homework;
import java.util.Scanner;
public class Task2 {
    public static void main(String[] args) {
        ex1();
    }
    static void ex1() {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите целое число а: ");
        int a = in.nextInt();
        if (a >= 0) System.out.println("Число " + a + " положительное.");
        else System.out.println("Число " + a + " отрицательное.");
    }
}