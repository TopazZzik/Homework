/**Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который вернет “перевернутый” список.*/
package Homework4;
import java.util.LinkedList;

public class Task1 {
    public static void main(String[] args) {

        int[] listMas = {7,1,2,6,7,4,9,8};
        LinkedList<Integer> linkList = new LinkedList<>();

        for (Integer temp : listMas) {
            linkList.add(temp);
        }

        int temp = 0;
        while (temp != linkList.size() - 1) {
            linkList.add(linkList.size()-temp, linkList.getFirst());
            linkList.removeFirst();
            temp++;
        }


        System.out.println("linkList = " + linkList);


    }
}
