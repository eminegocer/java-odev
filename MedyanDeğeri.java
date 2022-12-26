import java.util.Scanner;

public class MedyanDeğeri {
    public static void main(String args []){ 
        Scanner input=new Scanner(System.in);
        System.out.println("dizi eleman sayısı giriniz");
        int eleman=input.nextInt();

        int array[]=new int[eleman+1];
        int geçici;
        //dizi elemanlarını rastgele secme

        for(int i=0; i<eleman; i++){
            int num=(int)(Math.random()*100);
            array[i]=num;
            System.out.print(array[i] + " ");

         }System.out.println();

         // dizinin en büyük elemanını bulma
         int max=array[0];
         for(int i=0; i<eleman; i++){
            if(array[i]>max){
                max=array[i];
            }
         }

         // dizi elemanlarini küçükten büyüğe siralama
        
        
        for(int i=0; i<eleman; i++){
          for (int j=0; j<eleman-i; j++){
            if(array[j+1]<array[j]){
                geçici=array[j];
                array[j]=array[j+1];
                array[j+1]=geçici;
            }array[eleman]=max;
          }
        }
        
        for(int i=0; i<eleman; i++){
            System.out.print(array[i] + " ");
        }
        
        //medyan dağeri bulma

        if(eleman%2==0){
            int medyan1= array[eleman/2];
            int medyan2=array[(eleman/2)-1];
            System.out.println("\ndizinin medyan değerleri: " + medyan2 + " " + medyan1);
        }else{
            int medyan=array[(eleman-1)/2];
            System.out.println("dizinin medyan değeri: " + medyan);
        }
        
    }
    
}
