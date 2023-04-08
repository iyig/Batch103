package day02loops;

import java.util.Scanner;

public class WhileLoops01 {
    public static void main(String[] args) {
        //Example 1: 3 den 10 a kadar tamsayıları aynı satırda ekrana yazdırran kodu

        //1.yol
        for (int i = 3; i < 11; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

        // 2.yol
        int i = 3;
        while (i < 11) {  //iken
            System.out.print(i + " ");

            i++;
        }
        System.out.println();

        // Example 2: 17 den 4 kadar tum cift sayıları ekrana aynı satırda yazdıran kodu yazınız

        int k = 17;
        while (k > 3) {
            if (k % 2 == 0) {

                System.out.print(k + " ");

            }
            k--;
        }
//Example 3: 12 den 67 e kadar sayıların toplamını kodu yazınız
        System.out.println();
        int sum= 0;
        int m=12;
        while (m<68){

           sum= sum +m;

            m++;
        }
        System.out.println(sum);

   // Example4 : Size verilen bir tamsayının rakamları toplamını ekrana yazdırın

int sonuc= 0;

int sayi = 385;


while(sayi>0){
sonuc=sonuc + sayi%10;
   //         385%10= 5
    //   0 +    5


    sayi= sayi/10;
}

        System.out.println(sonuc);

//Example 5: Kullanıcıdan aldığınız bir sayinin carpım tablosunu ekrana yazdırınız
        // 3==> 3x1=3    3x2=6  3x3=9 .......3x10=30
Scanner input = new Scanner(System.in);
        System.out.println("Carpım tablosunu görmek icin bir sayi giriniz");
        int s= input.nextInt();

        int n= 1;
        while (n<11){
            System.out.println(s + "x" + n + " = " + s*n);
            n++;
        }

    }
}
