/**В шаблоне MyQueue с урока реализовать методы*/
package Homework4;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
public class MyQueue {
    private static Queue<String> queue = new LinkedList<String>();
    public static void main(String[] args) {
        add();
        System.out.println( queue);
        System.out.println(top());
        System.out.println(remove());
        System.out.println(queue);
    }
    private static boolean add() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Введите элемент очереди (каждый новый элемент очереди вводится после Enter), для выхода введите слово stop: ");
            String text = scanner.nextLine();
            if (text.equals("stop")) {
                return false;
            }
            queue.offer(text);
        }
    }
    private static String top() {
        return queue.peek();
    }
    private static String remove() {
        return queue.poll();
    }
}
