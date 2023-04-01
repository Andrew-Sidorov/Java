// import java.util.Scanner;

// import javax.sound.sampled.SourceDataLine;

// Дано четное число N (>0) и символы c1 и c2. Написать метод, который вернет
// строку длины N,
// которая состоит из чередующихся символов c1 и c2, начиная с c1.
// 6
// a b
// ababab
// public class sem2 {
// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// System.out.println("Vvedite simvol:");
// int number = sc.nextInt();
// System.out.println("Vvedite c1:");
// String firstChar = sc.next();
// System.out.println("Vvedite c2:");
// String secondChar = sc.next();
// sc.close();

// System.out.println(str(number, firstChar, secondChar));

// }

// static String str(int number, String firstChar, String secondChar) {
// StringBuilder result = new StringBuilder();
// String twoChars = firstChar + secondChar;
// for (int i = 0; i < number / 2; i++)
// result.append(twoChars);
// return result.toString();

// }

// }
//
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
// Напишите метод, который сжимает строку.
// Пример: вход aaaabbbcddaaa.
// a4b3cd2a3

// public class sem2 {
// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// System.out.println("Vvedite chislo:");
// String str = sc.nextLine();

// System.out.println(compressString(str));
// }

// static String compressString(String str) {
// StringBuilder result = new StringBuilder();
// int count = 1;
// char[] charArray = str.toCharArray();
// for (int i = 1; i < charArray.length; i++) {
// if (charArray[i] == charArray[i - 1]) {
// count += 1;
// } else {
// result.append(charArray[i - 1]);
// if (count != 1) {
// result.append(count);
// }
// count = 1;
// }

// }
// if (count == 1)
// result.append(charArray[charArray.length - 1]);
// else
// result.append(charArray[charArray.length - 1]).append(count);

// return result.toString();
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
//
// Напишите метод, который принимает на вход строку (String) и
// определяет является ли строка палиндромом (возвращает boolean значение).
// public class sem_2 {
// public static void main(String[] args) {
// String firstStr = new String("ABBA");
// // System.out.println(functionzip(firstStr));
// if (functionzip(firstStr)){
// System.out.println("Полиндром");
// }else{
// System.out.println("Не полиндром");
// }
// }

// static Boolean functionzip(String firstStr) {
// Boolean palindrom = true;
// for (int i = 0; i < firstStr.length()/2; i++) {
// if (firstStr.charAt(i) != firstStr.charAt(firstStr.length() - i - 1)){
// palindrom = false;
// return palindrom;
// }
// }
// return palindrom;
// }
// }