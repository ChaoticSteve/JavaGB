/**
 * Пусть дан LinkedList с несколькими элементами.
 * Реализуйте метод, который вернет “перевернутый” список.
 */
import java.util.LinkedList;
import java.util.Random;

class Task4_1 {
  public static void main(String[] args) {
    LinkedList<Integer> list = new LinkedList<>();
    Random rand = new Random();
    for (int i = 0; i < 20; i++) {
      list.add(i, rand.nextInt(100));
    }
    System.out.printf("Исходный список: %s\n", list);

    System.out.printf("Перевернутый список: %s\n", getReverse(list));

  }

  public static LinkedList<Integer> getReverse(LinkedList<Integer> list) {
    LinkedList<Integer> reversed = new LinkedList<>();
    for (int i = list.size() - 1; i >= 0; i--) {
      reversed.add(list.get(i));
    }
    return reversed;
  }
}