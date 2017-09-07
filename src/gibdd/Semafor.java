package gibdd;

import java.util.Scanner;

public class Semafor {
    ClrSemafor state;

    public Semafor(){
      state = ClrSemafor.GREEN;
    }

    public void getState(){
      switch (state) {
          case GREEN:
              System.out.println("Зеленый");
              break;

          case YELLOW:
              System.out.println("Желтый");
              break;

          case RED:
              System.out.println("Красный");
              break;

          default:
              System.out.println("Беда!!!");
              break;
       }
    }

    public void setState(int minuts) {
      minuts = minuts % 10;
      if (minuts <= 2){
        state = ClrSemafor.GREEN;
      } else if (minuts <= 5) {
        state = ClrSemafor.YELLOW;
      } else {
        state = ClrSemafor.RED;
      }
    }

  public static void main(String[] args)
  {
      Semafor smfr = new Semafor();
      Scanner sc = new Scanner(System.in);
      int minuts = 0;
      System.out.print("Введите целое число: ");
      if(sc.hasNextInt()) { 
        minuts = sc.nextInt();
      } else {
        System.out.println("Вы ввели не целое число");
      }
      sc.close();
      smfr.setState(minuts);
      smfr.getState();
   }

}
