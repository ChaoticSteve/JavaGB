/**Реализуйте структуру телефонной книги с помощью HashMap,
учитывая, что один человек может иметь несколько телефонов.*/

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
class Task5_1 {
    public static void main(String[] args) {
        HashMap<ArrayList<String>, HashMap<String, String>> phoneBook = new HashMap<>();
        ArrayList<String> numberPhone = new ArrayList<>();
        HashMap<String, String> keyValues = new HashMap<>();

        phoneBook.put(addNumberPhone(numberPhone), addDescription(keyValues));
        System.out.println(phoneBook);
    }

    public static ArrayList<String> addNumberPhone(ArrayList<String> number) {
        Scanner isScanner = new Scanner(System.in);
        System.out.println("Введите номер телефона:");
        String inPhone = isScanner.nextLine();
        number.add(inPhone);
        return number;
    }

    public static HashMap<String, String> addDescription(HashMap<String, String> keyValue) {
        Scanner isScanner = new Scanner(System.in);
        System.out.println("Введите имя:");
        String firstNameValue = isScanner.nextLine();
        System.out.println("Введите фамилию:");
        String secondNameValue = isScanner.nextLine();
        System.out.println("Введите описание:");
        String descriptionValue = isScanner.nextLine();

        keyValue.put("firstName", firstNameValue);
        keyValue.put("secondName", secondNameValue);
        keyValue.put("description", descriptionValue);

        return keyValue;
    }
}