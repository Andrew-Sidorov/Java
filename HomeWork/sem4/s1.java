
//1) Пусть дан LinkedList с несколькими элементами. Реализуйте метод(не void), который вернет “перевернутый” 
//список.
import java.util.LinkedList;

public class s1 {

    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        System.out.println("Исходный список: " + list);
        LinkedList<String> reversedList = reverseLinkedList(list);
        System.out.println("Перевернутый список: " + reversedList);

    }

    public static LinkedList<String> reverseLinkedList(LinkedList<String> list) {

        LinkedList<String> reversedList = new LinkedList<>();
        for (int i = list.size() - 1; i >= 0; i--) {

            String element = list.get(i);

            reversedList.add(element);

        }
        return reversedList;
    }
}