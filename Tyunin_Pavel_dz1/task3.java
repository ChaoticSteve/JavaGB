//Реализовать простой калькулятор
import java.util.Scanner;
class Task3{
  public static void task3(String[] args){
    Scanner iScanner = new Scanner(System.in);
    System.out.printf("Операция(+,-,*,/): ");
    String opr = iScanner.nextLine();
    System.out.printf("Первое число: ");
    int a = iScanner.nextInt();
    System.out.printf("Второе число: ");
    int b = iScanner.nextInt();
    System.out.printf("%s %s %s = %s\n", a, opr, b, calc(a, b, opr));
  }
  static String calc(int a, int b, String opr){
    Integer res = 0;
    if (opr.equals("+")){
      res = a + b;      
      return res.toString();
    }else if (opr.equals("-")){
      res = a - b;
      return res.toString();
    }else if (opr.equals("*")){
      res = a * b;
      return res.toString();
    } else if (opr.equals("/")){
      if (b == 0){
        return "Деление на 0 запрещено";
      }
      Double result = 0.0;
      result = (double) a / b;
      return result.toString();
    }
    return "Неизвестная операция";
  }
}  