package day21nestedifswitch;

import java.util.Scanner;

public class IfStatement01 {

    public static void main(String[] args) {
        // Kullanicidan yas değerini alaln ve yaşın evrede olduğunu aşağıdaki tabloya göre ekran yazdırınız
        //0 - 4= Bebek
        // 5 - 12= cocuk
        //13 _ 20= genc
        // 21 -30 = yetişkin
        //Tanımlanmamiş evre

        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen yaşınızı giriniz...");
        int yas= input.nextInt();

        if (yas<0){
            System.out.println("Gecerli bir yaş giriniz");
        }else if (yas<5){
            System.out.println("Bebek");
        }else if (yas<13){
            System.out.println("cocuk");
        }else if (yas<21){
            System.out.println("Genç");
        }else if (yas<31){
            System.out.println("Yetişkin");
        }else{
            System.out.println("Tanımlanmamş evre");
        }











    }

}
