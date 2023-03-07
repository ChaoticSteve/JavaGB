/**Реализуйте алгоритм сортировки пузырьком числового массива, результат после каждой итерации запишите в лог-файл.*/
import java.util.logging.*;
import java.io.IOException;
class Task2_2{
  public static void main (String[] args) throws IOException{
    int[] arr = new int[10];
    System.out.println("До сортировки:");
    for (int i = 0; i < arr.length; i++) {
      arr[i] = (int) (Math.random() * 100);      
      System.out.printf("%d ", arr[i]);
    }
    System.out.println();
    bubbleSort(arr);
    System.out.println("После сортировки:");
    for (int i = 0; i < arr.length; i++) {      
      System.out.printf("%d ", arr[i]);
    }
  }
  private static void bubbleSort(int[] arr) throws IOException{
    for (int i = 0; i < arr.length - 1; i++){
      for (int j = 0; j < arr.length - i - 1; j++){
        if (arr[j+1] < arr[j]){
          int num = arr[j];
          arr[j] = arr[j+1];
          arr[j+1] = num;
        }
      }
    }
    logToFile("Succes");
  }
  private static void logToFile (String msg) throws IOException{
    Logger logger = Logger.getLogger(Task2_2.class.getName());
    logger.setLevel(Level.INFO);
    FileHandler fh = new FileHandler("log.xml", true);
    logger.addHandler(fh);
    XMLFormatter xml = new XMLFormatter();
    fh.setFormatter(xml);
    logger.info(msg);
  }
}