//Вычислить n-ое треугольного число(сумма чисел от 1 до n), 
//n! (произведение чисел от 1 до n)
import java.util.Scanner;
class Task1{
  public static void task1(String[] args){
    Scanner iScanner = new Scanner(System.in); 
    System.out.printf("n = ");
    int n = iScanner.nextInt();    
    System.out.printf("Сумма чисел: %d\n", getSum(n));
    System.out.printf("Факториал числа %d: %d\n", n, getFactorial(n));
  }
  static int getSum(int n){
    int res = ((1+n)*n)/2;
    return res;
  }
  static int getFactorial(int n){
    if (n == 1){
      return n;
    }else if (n == 0){
      return 1;
    }else if (n < 0){
      return -1;
    }
    else{
      return n * getFactorial(n-1);
    }
  }
}