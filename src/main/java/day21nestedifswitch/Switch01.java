package day21nestedifswitch;

import day20ifstatement.İfStatement01;

import java.util.Scanner;

public class Switch01<gunNo> {

    public static void main(String[] args) {
        /*
        Kullanicıdan gun sayisini aliniz ve gun ismini ekrana yazınız

        1==>Pazar
         */

        Scanner input = new Scanner(System.in);
        System.out.println("Gun numarasini giriniz...");
        byte gunNo = input.nextByte();

        //1.Yol if ile cözünüz


        if (gunNo == 1) {
            System.out.println("Pazar");
        } else if (gunNo == 2) {
            System.out.println("Pazartesi");
        } else if (gunNo == 3) {
            System.out.println("Sali");
        } else if (gunNo == 4) {
            System.out.println("Carşamba");
        } else if (gunNo == 5) {
            System.out.println("Persembe");
        } else if (gunNo == 6) {
            System.out.println("Cuma");
        } else if (gunNo == 7) {
            System.out.println("Cumartesi");
        } else {
            System.out.println("Gecerli numarı giriniz");
        }
// 2.yol: switch
   switch (gunNo){
       case 1:
           System.out.println("pazar");
           break;
       case 2:
           System.out.println("Pazartesi");
           break;
       case 3:
           System.out.println("Sali ");
           break;
       case 4:
           System.out.println("carşamba");
           break;
       case 5:
           System.out.println("perşembe");
           break;
       case 6:
           System.out.println("Cuma");
           break;
       case 7:
           System.out.println("Cumartesi");
           break;
       default:
           System.out.println("Gecerli gün sayisi giriniz");

   }

    }


}