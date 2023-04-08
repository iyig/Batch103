package day03loops;

import java.util.Scanner;

public class NestedForLoop01 {
    public static void main(String[] args) {
        // Example 1:aşağıdaki şekli ekrana yazdırın
        //        ****
        //        ****
        //        ****

Scanner input =new Scanner(System.in);

        System.out.println("satir sayisini giriniz");
        int satir= input.nextInt();

        System.out.println("sutun sayisini giriniz");
        int sutun= input.nextInt();

        for (int i = 1; i <= satir; i++) {


            for (int j = 1; j <= sutun; j++){
                System.out.print("*");
        }
            System.out.println();
    }
/*
 Example 2: aşapıdaki şekil cizen kodu
        1
        1 2
        1 2 3
        1 2 3 4
        1 2 3 4 5
 */

        for (int i = 1; i < 6; i++) {

            for (int j = 1; j <=i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
/*
  Example3: Aşağıdaki şekil cizen kodu yazınız
  * * * *
  * * *
  * *
  *
 */
       int row= 4;
        for (int i = 1; i <=row ; i++) {
            for (int j = row; j >=i ; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}