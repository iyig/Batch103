package day09arraylistspassbyvalue;

public class MethodOverloading01 {
  /*
  Method Overloading nasil yapılır?
 1)Method isimleri ayni olmalidir
 2)Method parametreleri farkli olmalidir
 i)Parametre sayilari degistirilebilir
 İİ)Parametrelerin data tiplerini değistirebilirsiniz
 İİİ)Parametrelerin yerlerini değiştirebilirsiniz, ancak data tipleri farkli ise
  3) Method Ismi + Parametreler = Method Signature
  Method Signature dişinda ne değiştireseniz degiştirin Java o methodu farklı kabule etmez

   */


    public static void main(String[] args) {
add(3,5);
  add(3,5.0);


    }

    public static  void  add(int a, int b){
        System.out.println(a + b);
}

    public static  void  add(int a, int b,int c){
        System.out.println(a + b + c);
    }
    public static  void  add(int a, double b){
        System.out.println(a + b);
    }
    public static  void  add(double a, int b){
        System.out.println(a + b);
    }
}
