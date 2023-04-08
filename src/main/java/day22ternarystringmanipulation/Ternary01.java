package day22ternarystringmanipulation;

public class Ternary01 {
    public static void main(String[] args) {
        //example1: Bir sayinin pozitif olup olmadığı ekrana yazdıran kodu yaziniz
        //1.yol
        int a= 12;
        if (a>0){
            System.out.println("pozitif");

        }else {
            System.out.println("Positif değil");
        }
  //2.YOl
      String sonuc=  a>0 ? "Pozitif": "Pozitif değil";
        System.out.println(sonuc);

        // Example 2: iki sayidan kücük olani secen kodu yazınız

        int b= 12;
        int c= 23;
        int min= b<c ? b : c;
        System.out.println(min);

        //Example3: Verilen bir sayinin mutlak değerini hesaplayan kodu yazınız

        // Pozitif sayiların ve sifirin mutlak değeri kendileridir
        //Negatif sayiların mutlak değeri -1 ile carpilmiş halleridir

        int d= -45;
       int abs= d<0 ? -1*d : d;
        System.out.println(abs);


        //Example 4: iki tane sayi ayni isaretili ise bu sayiları carpınız
       // farklı isaretli ise "Islem yapamam" mesaji veriniz

        int e =12;
        int f =10;
 //Ternary farkli data tiplerinde sonuc return ederse sonucun data tipini "Object" yapınız.
      Object islem=  ( e>0 && f>0) || (e<0 && f<0) ? e*f : "Islem yapamam";

        System.out.println(islem);

    }



}
