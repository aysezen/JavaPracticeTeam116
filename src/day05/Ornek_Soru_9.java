package day05;

import java.util.Scanner;

public class Ornek_Soru_9 {
    public static void main(String[] args) {

		/*
				StringMethods:
				cift uzunlukta bir degiskenin ortasindaki harfi konsolda yazdirmak icin bir Java programi yaziniz.
	    	    Eger kelime cift sayida harf iceriyorsa ortadaki 2 harfi yazdirin
	    	    ORNEK:
		     	INPUT      :  Python
				OUTPUT :   th
	    */
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen ortasindaki harfi yazdirmak icin bir metin giriniz :");
        String str=scan.nextLine();
        int length=str.length();
        int ortaTek= (length-1)/2;
        int ortaCift= (length)/2;
        if (length%2==0) {


            System.out.println(str.substring(ortaCift-1,ortaCift+1));


        } else {
            System.out.println(str.substring(ortaTek,ortaTek+1));
        }

        scan.close();
    }
}
