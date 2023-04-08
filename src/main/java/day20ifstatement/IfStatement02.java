package day20ifstatement;

import java.util.Scanner;

public class IfStatement02 {
    public static void main(String[] args) {


        //Example 1:Kullanici gun numarasini girsin kod gun ismini yazsın
        //   2==>Pazartesi     5==>Perşembe


        Scanner input = new Scanner(System.in);
        System.out.println("Gün numarası giriniz");
        byte günNo = input.nextByte();
        if (günNo == 1) {
            System.out.println("pazar");
        } else if (günNo == 2) {
            System.out.println("Pazartesi");
        } else if (günNo == 3) {
            System.out.println("Sali");
        } else if (günNo == 4) {
            System.out.println("Çarşamba");
        } else if (günNo == 5) {
            System.out.println("Perşembe");
        } else if (günNo ==6) {
            System.out.println("Cuma");
        } else if (günNo == 7) {
            System.out.println("Cumartesi");
        }else{
            System.out.println("Gecerli bir gün mumarası giriniz gün numaralı 1 2 3 4 5 6 7");
        }


    }
}