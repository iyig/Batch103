package day09arraylistspassbyvalue;

public class PassByValue01 {
/*
1)Java variable'ların orjinal degerlerini korumak ister
2) Variable methodlar icinde kullanildıgında,Java method'un içine orjinal degeri koymaz, o degerin kopyasini üretür ve method'a
o kopyayi yollar.Method kopya ustünde değişiklik yapar dolaysiıyla variable'in orjinal degeri korunmuş olur
Bu sisteme "Pass By Value denir
Not: Java "Pass By Value" kullanır
Not Bazı programlama dilleri orjinal değeri koruma altına almamıştır.Bu işi developer'lara bırakmıştır.
Bu tarz diller "Pass by Reference" kullanir
 */
    public static void main(String[] args) {
int x =5;// Gömlek
        System.out.println(x);//5

  //static method olan "main method" un içindeki herşey
        //static olmalidir
   change(x);//Öğrenci gömleği 15
        System.out.println(x);//5
   int ucret= 100;


  int kopya=indirim(ucret);
        indirim(ucret);
        System.out.println(ucret);
        System.out.println(kopya);
    }

public static   void  change(int a){
    System.out.println(a*3);

}
// void disindaki "return" type'lara method body'si içinde
    //return keyword kullanılmalidir
public static int indirim(int gomlekUcreti){
        return gomlekUcreti -10;

}


}
