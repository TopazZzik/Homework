package Homework;
import java.util.Scanner;
public class Task3 {
    public static void main(String[] args) {
        System.out.print(ex1());
    }

    public static boolean ex1() {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите целое число а: ");
        int a = in.nextInt();
        if (a >= 0) return true;
        else return false;
    }
}


