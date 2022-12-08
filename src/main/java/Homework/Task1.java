package Homework;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

        System.out.print(ex1());
    }
    public static boolean ex1()
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число а: ");
        int a = in.nextInt();
        System.out.print("Введите число b: ");
        int b = in.nextInt();
        int sum = a + b;
        if (sum > 10 && sum < 20) return true;
        else return false;
    }
}
