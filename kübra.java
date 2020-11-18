import java.util.Random;
import java.util.Scanner;
public class Algorithmshomework

{

public static void main(String[] args) {
    
    //Cevap 1
   
    //Rastgele iki sayımı kapıyorum
    int s=0;
    Random random = new Random();
    int a;
        
    a = random.nextInt(10)+1;
    System.out.println(a);
        
    int b;
        
    b = random.nextInt(10)+1;
    System.out.println(b);
        
    //Bunları toplama işlemi ile çarpıyorum

     for (int i = 1; i <=a; i++) {
     s=s+b;
     }
     System.out.println("İlk sayı= "+a+"  "+"İkinci sayı "+b );
     System.out.println("ÇARPIM SONUCU="+s);
        
        
    //Cevap 2
    
    Scanner scanner = new Scanner(System.in);
    
    System.out.println("Bir sayı giriniz");
    
    int faktoriyel = 1;
    
    int c = scanner.nextInt();
    
    for (int i = 1; i <= c;i++) {
        
    faktoriyel *= i;
        
    System.out.println("Faktöriyel = " + faktoriyel);
    }
    
    //Cevap 3
    
    int sayac = 0;
        for(int sayi=2;sayi<=100;sayi++)
        {
        int kontrol = 0;
        for (int i = 2; i < sayi; i++)
        {
        if (sayi % i == 0)
        {
        kontrol = 1;
        break;
        } 
        }        
        if(kontrol==0)
        {
        System.out.print(sayi+"\n");
        sayac++; 
        }
        }
        
     //Cevap 4
     //Önce istediğim şekli çiziyorum
     //*       *
     // *     *
     //  *   *
     //   * *
     //    *
     System.out.println("*       *");
     System.out.println("*     *");
     System.out.println("*   *");
     System.out.println("* *");
     System.out.println("*");
         
}
    
}
