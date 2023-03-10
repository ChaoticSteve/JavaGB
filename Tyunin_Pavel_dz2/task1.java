/**В файле содержится строка с исходными данными в такой форме:
{"name":"Ivanov", "country":"Russia", "city":"Moscow", "age":"null"}
Требуется на её основе построить и вывести на экран новую строку, в форме SQL запроса:
SELECT * FROM students WHERE name = "Ivanov" AND country = "Russia" AND city = "Moscow";
Для разбора строки используйте String.split. Сформируйте новую строку, используя StringBuilder. Значения null не включаются в запрос.*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

class Task2_1 {
  public static void main (String[] args){
    String[] info = makeString("test.txt").split(", ");
    System.out.printf("SELECT * FROM students WHERE name = %s AND country = %s AND city = %s", info[1], info[3], info[5]);
  }
  private static String makeString (String filename){
    StringBuilder sb = new StringBuilder();
    try (BufferedReader fr = new BufferedReader(new FileReader(filename))){
      String str;      
      while ((str = fr.readLine()) != null){
        sb.append(str.replace(":", ", ").replace("{", "").replace("}", ""));
      }      
    }
    catch (IOException ex){
      System.out.println("error");
    }
    return sb.toString();
  }
}