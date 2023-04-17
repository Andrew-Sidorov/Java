// Создать структуру для хранения Номеров паспортов и Фамилий сотрудников
// организации.
// 123456 Иванов
// 321456 Васильев
// 234561 Петрова
// 234432 Иванов
// 654321 Петрова
// 345678 Иванов
// Вывести данные по сотрудникам с фамилией Иванов.
//
public static boolean isomorphicWords(String word1,String word2){if(word2.length()!=word1.length())return false;Map<Character,Character>cod=new HashMap<>();for(int i=0;i<word1.length();i++){cod.putIfAbsent(word1.charAt(i),word2.charAt(i));if(cod.get(word1.charAt(i))!=word2.charAt(i))return false;}return true;}
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
//
// Даны 2 строки, написать метод, который вернет true, если эти строки являются
// изоморфными и false, если нет.
// Строки изоморфны, если одну букву в первом слове можно заменить на некоторую
// букву во втором слове, при этом
// 1. повторяющиеся буквы одного слова меняются на одну и ту же букву с
// сохранением порядка следования.
// (Например, add - egg изоморфны)
// 2. буква может не меняться, а остаться такой же. (Например, note - code)
// Пример 1:
// Input: s = "foo", t = "baar"
// f: b
// o: a
// Output: false
// Пример 2:
// Input: s = "paper", t = "title"
// p: t
// a: i
// e: l
// r: e
// Output: true
public class SecondTask {
    public static void main(String[] args) {
        String firstWord = "paper";
        String secondWord = "title";

        System.out.println(isIsomorph(firstWord, secondWord));
    }

    static boolean isIsomorph(String firstWord, String secondWord) {
        if (firstWord.length() != secondWord.length())
            return false;
        Map<Character, Character> dict = new HashMap<>();

        for (int i = 0; i < firstWord.length(); i++) {
            if (dict.containsKey(firstWord.charAt(i)) && (dict.get(firstWord.charAt(i)) != secondWord.charAt(i)))
                return false;
            else
                dict.put(firstWord.charAt(i), secondWord.charAt(i));
        }
        return true;
    }
}

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
public class SecondTask {
    public static void main(String[] args) {
        String firstWord = "paper";
        String secondWord = "title";

        System.out.println(isIsomorph(firstWord, secondWord));
    }

    static boolean isIsomorph(String firstWord, String secondWord) {
        if (firstWord.length() != secondWord.length())
            return false;
        Map<Character, Character> dict = new HashMap<>();

        for (int i = 0; i < firstWord.length(); i++) {
            if (dict.containsKey(firstWord.charAt(i)) && (dict.get(firstWord.charAt(i)) != secondWord.charAt(i)))
                return false;
            else
                dict.put(firstWord.charAt(i), secondWord.charAt(i));
        }
        return true;
    }

}
    //
    //
    ///
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
    // Написать программу, определяющую правильность расстановки скобок в выражении.

    // Пример 1: a+(d*3) - истина
    // Пример 2: [a+(1*3) - ложь
    // Пример 3: [6+(]3*3) - ложь
    // Пример 4: {a}[+]{(d*3)} - истина
    // Пример 5: <{a}+{(d*3)}> - истина
    // Пример 6: {a+]}{(d*3)} - ложь

static boolean ex2(String s){
    String e = "{*()}";
    char[] chars = s.toCharArray();
    Stack<Character> stack = new Stack<>();
    Map<Character, Character> map = new HashMap<>();
    String[] c1 = new String[]{"()", "{}", "[]", "<>"};
    for (int i = 0; i < c1.length; i++) {
    String a = c1[i];
    map.put(a.charAt(1), a.charAt(0));
    }
    // Map ):(, ]:[
    // ())
    // stack:
    for (int i = 0; i < chars.length; i++) {
    if (map.containsValue(chars[i])){
    stack.push(chars[i]);
    }
    if (map.containsKey(chars[i])){
    if (stack.empty() || map.get(chars[i]) != stack.pop()){
    return false;
    }
    }
    }
    return stack.empty();
    }