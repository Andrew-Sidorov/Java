import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

// import java.lang.reflect.Array;
// import java.util.ArrayList;
// import java.util.Arrays;

// import java.lang.reflect.Array;
// import java.util.ArrayList;
// import java.util.Random;

// import javax.lang.model.util.Elements.Origin;
// import javax.naming.InitialContext;

// // Заполнить список десятью случайными числами.
// // Отсортировать список методом sort() и вывести его на экран.
// public class sem3 {
// public static void main(String[] args) {
// ArrayList<Integer> list = new ArrayList<>(10);
// Random random = new Random();
// for (int i = 0; i < 10; i++) {
// list.add(random.nextInt(0, 100));
// }
// System.out.println(list);
// list.sort(null);
// System.out.println(list);
// }
// }
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//Заполнить список названием планет Солнечной системы в произвольном порядке с повторениями.
//Вывести название каждой планеты и колличество его повторений в списке.
// public class sem3 {
//     public static void main(String[] args) {

//         ArrayList<String> planets = new ArrayList<>(Arrays.asList("Mercury", "Mercury", "Venus", "Venus", "Venus",
//                 "Earth", "Mars", "Earth", "Jupiter", "Saturn", "Saturn", "Uranus", "Neptune", "Saturn"));
//         int count = 1;
//         planets.sort(null);
//         for (int i = 1; i < planets.size(); i++) {
//             if (planets.get(i) == planets.get(i - 1)) {
//                 count++;
//             } else {
//                 System.out.printf("%s - %d\n", planets.get(i), count);
//                 count = 1;
//             }

//         }
//     }
// }
// //
// //
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//Создать список типа ArrayList, поместить в него строки, так и целые числа.
//Пройти по списку, найти и удалить целые числа.
public class sem3 {
    public static void main(String[] args) {
        ArrayList<Object> list = new ArrayList<>(Arrays.asList("Mercury", "Mercury", "Venus", "Venus", "Venus",
                "Earth", "Mars", "Earth", "Jupiter", "Saturn", "Saturn", "Uranus", "Neptune", "Saturn", 45));
        ArrayList<String> newList = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) instanceof String) {
                newList.add((String) (list.get(i)));
            }
        }
        System.out.println(newList);
    }
}