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
              System.out.println("�������");
              break;

          case YELLOW:
              System.out.println("������");
              break;

          case RED:
              System.out.println("�������");
              break;

          default:
              System.out.println("����!!!");
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
      System.out.print("������� ����� �����: ");
      if(sc.hasNextInt()) { 
        minuts = sc.nextInt();
      } else {
        System.out.println("�� ����� �� ����� �����");
      }
      sc.close();
      smfr.setState(minuts);
      smfr.getState();
   }

}
