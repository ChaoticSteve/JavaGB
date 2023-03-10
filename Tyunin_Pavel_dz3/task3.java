/**Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее арифметичское этого списка.*/
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Task3_3 {
    public static void main(String[] args) {
        ArrayList<Integer> my_list = new ArrayList<>();
        Random rand = new Random();

        int amount_elem = 20;
        for (int i = 0; i < amount_elem; i++) {
            int randNum = rand.nextInt(100);
            my_list.add(randNum);
        }
        System.out.println(my_list);

        int min_num = Collections.min(my_list);
        System.out.printf("Минимальное число в списке %d \n", min_num);

        int max_num = Collections.max(my_list);
        System.out.printf("Максимальное число в списке %d \n", max_num);

        int sum_list = my_list.stream().mapToInt(Integer::intValue).sum();
        int average = sum_list / amount_elem;
        System.out.printf("Среднее арифметическое в списке %d \n", average);
    }
}