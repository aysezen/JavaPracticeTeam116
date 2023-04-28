package day05;
import java.util.Scanner;
public class Q2_BolmeOperatoruOlmadanBolme {
    // Kullanicidan bolunen ve bolen seklinde 2 sayi alalim ve bolme operatoru
    // kullanmadan bolme islemini gerceklestirip bolumu hesaplayan method create ediniz.


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bolmek istediginiz sayiyi giriniz: ");
        int a = scan.nextInt();
        System.out.println("Lutfen bolen sayiyi giriniz: ");
        int b = scan.nextInt();

        System.out.println(bol(a, b)); // 1

        System.out.println(bol(56, 8)); //1+7 = 8
        System.out.println(bol(897, 62));
        System.out.println(bol(42, 21));
        System.out.println(bol(87, 13));


        // System.out.println(bolunen + " / " + bolen + " = " + bolum);
        // System.out.println("Bolum = "+ bolum);
    }
    public static int bol(int bolunen, int bolen){
        int bolum = 0; // bolumu dongunun icerisinde saymasi icin her seferinde artacak bir sayac olusturdum

        while(bolunen>=bolen){
            bolunen-=bolen;
            bolum++;
        }

        return bolum;
    }
}
