
public class DızıOrtalamaHesaplama {
  public static void main(String args []){
     int arrays[]=new int[10];
     double toplam=0;
    
     // random 10 tane dizi değeri seçtirme
     for(int i=0; i<10; i++){
        int num=(int)(Math.random()*100);
        arrays[i]=num;
        System.out.print(arrays[i] + " ");
        toplam=toplam+num;
     }
       //dizideki değerlerin ortalaması


       System.out.println("\ntoplam: " + toplam);
       double ortalama=toplam/10;
       System.out.println("ortalama: " + ortalama);

       //ortalama üstündeki dizi değerlerini bulma
       System.out.println("ortalama üstündeki sayılar: ");
       for(int i=0; i<10; i++){
        if(arrays[i]>ortalama){
            System.out.println(arrays[i]);
        }
       }
  }  
}
