/**В файле содержится строка с данными:
[{"фамилия":"Иванов","оценка":"5","предмет":"Математика"}, {"фамилия":"Петрова","оценка":"4","предмет":"Информатика"}, {"фамилия":"Краснов","оценка":"5","предмет":"Физика"}]
Напишите метод, который разберёт её на составные части и, используя StringBuilder создаст массив строк такого вида:
Студент Иванов получил 5 по предмету Математика.
Студент Петрова получил 4 по предмету Информатика.
Студент Краснов получил 5 по предмету Физика.*/
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

class Task2_3{
  public static void main(String[] args){
    String[] arr = makeArray("pupils.txt");
    System.out.println("Содержание массива:");
    for (int i = 0; i < arr.length; i++) {
      System.out.println(arr[i]);
}
  }
  private static String[] makeArray (String filename){
    StringBuilder sb = new StringBuilder();
    try (BufferedReader fr = new BufferedReader(new FileReader(filename))){
      String str;      
      while ((str = fr.readLine()) != null){
        sb.append(str.replace("[", "").replace("]", "").replace("{", "").replace("}", "").replace(":", ",").replaceAll("\"", ""));
      }      
    }
    catch (IOException ex){
      System.out.println("error");
    }
    String[] arr = sb.toString().split(", ");
    String[] arr_pupil = new String[3];
    for (int i = 0; i < arr_pupil.length; i++){
      sb.setLength(0);
      sb.append("Студент " + arr[i].split(",")[1] + " получил " + arr[i].split(",")[3] + " по предмету " + arr[i].split(",")[5]);
      arr_pupil[i] = sb.toString();
    }
    return arr_pupil;
  }
}
