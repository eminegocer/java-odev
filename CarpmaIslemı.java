import java.util.Scanner;

public class CarpmaIslemı {
  public static void main(String args []){
    Scanner input=new Scanner(System.in);
    System.out.println("birinci sayıyı giriniz");
    int num1=input.nextInt();

    System.out.println("ikinci sayıyı giriniz");
    int num2=input.nextInt();
    int toplam=0;

    for(int i=1; i<=num1; i++){
      toplam=toplam+num2;
    }System.out.println("sayıların çarpımı: " + toplam);
  }  
}
