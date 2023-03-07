//Вывести все простые числа от 1 до 1000
class Task2{
  public static void task2(String[] args){
    for (int n = 1; n <= 1000; n++){
      if (getSimple(n)){
        System.out.printf("%d ", n);
      }
    }
  }
  static boolean getSimple(int n){
    for (int i = 2; i <= Math.sqrt(n); i++){
      if (n % i == 0)
        return false;
    }
    return true;
  }
}