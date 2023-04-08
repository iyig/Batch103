package day11stringbuilderstringbuffer;

public class StringBuildir01 {
  /*
 1. "StringBuildir Jav'da bir  Class'dir
  2."StringBuilder", String olusturmaya yarar
  3."String" Class varken nicin "StringBuilder" a ihtiyac duyarız?
  Cünkü "String" Class "Immutable Classdir, ama biz bazen Mutable" Stringlere ihtiyaç duyarız
  StringBuilder bize "Mutable" String verir
  4. "İmmutable class" larda varolan deger degistirilemez .Siz varolan bir değeri değiştirmek istediginizde
  i)Memory'de yeni bir variable yeni degerle olusturulur
  ii) Eski variable'in pointer'i yeni variable 'a döndürülür
  iii)Eger bir variable'i hicbir pointer göstermiyorsa o variable "Garbage Collekctor" tarafından silinir.
  "Mutable Class" larda var olan değer degiştirilebilir.Orjinal değer korunmaz
  5. String Class'ların immutable yapısı "security" için önemlidir.
  ayni değere sahip birden fazla String olduğunda, Java bir tane container ve ayni deger sahip String'lerin bu
  container'i kullanmasıni temin eder. Bu memory'i korumak için iyidir.ancak container'daki değeri bir variable icin değiş-
  tirdiğimizde tum variable'ların etkilenmesi tehlikesi vardır.Bu tehlikeden kurtulmak icin Java Stringleri "immutable(değişmez)"
  yapmiştir.Fakat herhangi bir variable'in değerini degiştirmek için Java bir yol bulmuştur.Değiştirmek istediğiniz variable için
  yeni bir container oluşturur ve variable'in pointer'ini bu yeni variable'a yönlerndirir. Böylelikle hem degişim
  sağlanmiş  hemde digerleri etkilenmemiş olur

   */







   public static void main(String[] args) {
String str="Java";
str="Super Java";
     //  System.out.println(str);
//StringBuilder nasil olusturulur?
     // 1.Yol

       StringBuilder strb1= new StringBuilder("java");
       System.out.println(strb1);
//2.Yol
  StringBuilder strb2= new StringBuilder();
 //yol a:
 
  strb2.append("Java");
     strb2.append(" is easy");
       strb2.append("!!!");
     System.out.println(strb2);
// b:
       
       strb2.append(" Learn").append(" Java earn").append(" money.");//Method chain
       System.out.println(strb2);
//StringBuilder larda character sayisi nasıl bulunur ==>length() methodu ile bulunur
       StringBuilder strb3=new StringBuilder();
        strb3.append("Cat");
strb3.append("xxxxxxxxxxxxxxx");
        int numOfChar= strb3.length();
       System.out.println(numOfChar);//3

// Capacity aşımlarında capacity var olanin iki katının iki fazlasına çıkar
       int capacity1= strb3.capacity();
       System.out.println(capacity1);//34

       strb3.append("mmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmm");
       int capacity2=strb3.capacity();
       System.out.println(capacity2);//70  34*2+2


// setCharAt(2,'r'); ==> İndex 2'deki characteri "r" ye çevir
       strb3.setCharAt(2,'r');
       System.out.println(strb3);//Carxxxxxxxxxxxxxxxmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmm


    // delete(3,18); ==>Index 3(dahil) den İndex 18 (haric) e kadar tum characterleri siler

       strb3.delete(3,18);
       System.out.println(strb3);//Carmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmm


       //deleteCharat(2);==> Index 2'deki characteri siler

       strb3.deleteCharAt(2);
       System.out.println(strb3);//Cammmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmm
//reverse() methodu stringBuilderi ters cevirir. Ali==>ilA
       //"mutable"larda sadece method kullanmak orjinal degeri değiştirmek için yeterlidir
       strb3.reverse();
       System.out.println(strb3);//mmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmaC

//İmmutable"larda orjinal değeri değiştirmek için methodu kullanmak yeterli olmaz bir de "atama işlemi" yapmalisin
       String abc= "Java";
      abc= abc.replace("a","i");
       System.out.println(abc);//Jivi


      //toString() methodu StringBuilder'ları Stringe cevirir
      String stringStrb3= strb3.toString();

       System.out.println(stringStrb3);
//String'den de StringBuilder'a aşağıdaki gibi dönebilirsiniz
StringBuilder strb4= new StringBuilder(stringStrb3);
       System.out.println(strb4);
//insert(3,"XXXX"; 3.character ten sonra "XXXX" leri koyar
       strb4.insert(3,"XXXX");
       System.out.println(strb4);//


// İnsert(3,KLMOPQRSTU", 5,8)==> 3.characterden sonra , KLMOPQRSTU" String'inin index 5,6,7 deki characterlerini yerleştirir
       strb4.insert(3,"KLMOPQRSTU",5,8);
       System.out.println(strb4);//mmmQRSXXXmmmmmmmmmmmmmmmmaC


      StringBuilder a= new StringBuilder("Kava");
      StringBuilder b= new StringBuilder("Java");
     // a.compareTo(b) methodu i)StringBuilder'lar tamamıyla ayni ise 0 verir.
       // ii) a alfabetik sirada 'den sonra gelirse pozitif olarak aradaki alfabetik siralama farkını gösterir
//iii) "a" alfabetik sirada b'den önce gelirse negatif olarak aradaki alfabetik siralama farkini gösterir

      int sonuc=a.compareTo(b);
       System.out.println(sonuc);
    }


}
