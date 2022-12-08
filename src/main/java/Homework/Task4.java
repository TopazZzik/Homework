package Homework;
import java.util.Scanner;
public class Task4 {
    public static void main(String[] args) {
        ex1();
    }
    static void ex1() {
        System.out.print("Введите строку: ");
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        System.out.print("Введите число а: ");
        int a = in.nextInt();
        for (int i = 0; i < a; i++) {
            System.out.println(s);
        }
    }
}


