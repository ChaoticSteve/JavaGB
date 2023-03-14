/**Реализуйте очередь с помощью LinkedList со следующими методами:
enqueue() - помещает элемент в конец очереди, 
dequeue() - возвращает первый элемент из очереди и удаляет его, 
first() - возвращает первый элемент из очереди, не удаляя.*/

import java.util.LinkedList;
import java.util.Random;

class Task4_2 {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        Random rand = new Random();

        for (int i = 0; i < 15; i++) {
            list.add(i, rand.nextInt(100));
        }
        System.out.printf("Исходный список: %s \n", list);
        System.out.printf("Добавление в конец %s \n", enqueue(list, 15));

        System.out.printf("Первый элемент списка %s \n", dequeue(list));
        System.out.printf("С удалением первого элемента : %s \n", list);

        System.out.printf("Первый элемент списка %s \n", first(list));
        System.out.printf("Без удаления первого элемента: %s \n", list);
    }
    public static LinkedList<Integer> enqueue(LinkedList<Integer> list, int num) {
        list.addLast(num);
        return list;
    }
    public static int dequeue(LinkedList<Integer> list) {
        int num = list.getFirst();
        list.removeFirst();
        return num;
    }
    public static int first(LinkedList<Integer> list) {
        return list.getFirst();
    }
}