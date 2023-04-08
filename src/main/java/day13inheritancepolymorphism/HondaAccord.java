package day13inheritancepolymorphism;

public class HondaAccord extends Honda{
/*
Siz Class olusturduğunuzda Java otomatik olarak size görünmez bir constructor verir cünkü
Java, Class'in bir kalip olduğunu ve Object olusturmak için yaratıldığını ve Object oluşturmak için
constructor'in  sart olduğunu bilir
2) Java'nin otomatik olarak olusturduğu bu görünmez constructor'a "default constructor denir
3) Siz kendiniz herhangi bir constructor olusturduğunuzda Java "default constructor" i siler
4) Bir Class 'da birden fazla constructor olabilir.Fakat bu constructorların parametreleri farklı olmalıdır
5)"this" keyword "Bu Class" anlamındadir. "this.price" demek bu Class'daki "price" isimli variable demektir
"this.price" syntax'i constructor'larin içince kullanilir
 */

public int price;
public int year;
   public String make;
   public String model;

     public HondaAccord(){

}

     public HondaAccord(int price){
         this.price=price;
}
     public HondaAccord(int price,int year){
       //super();==>parente gidecek==>Honda parametresize gidecek
         this.price=price;
        this.year=year;
        System.out.println("Honda Accord Constructor");
    }


     public HondaAccord(int price,int year,String make,String model){
         this.price=price;
        this.year=year;
        this.make=make;
        this.model=model;
    }
}
