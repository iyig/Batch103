package day24abstractionCollections;
/*
"abstract method" lar sadece ne yapilacağını söyler(what to do)
"concrete method"lar ne yapılacağı  ile birlikte nasıl yapılacağını(How to do) da söyler
"interface"ler bir yapılacaklar işler listesidir(to do List)

"multiple parent interface" kullandığınızda aynı method ismi ile birden fazla method olusturursanız bu methodların return
type'ları ayni olmalidir. aksi takdirde hata verir.,
"interface"lerde constructor olmadığı için interface'lerden object olusturulamaz.
"abstract class" larda class oldukları için constructor vardır.Ama constructor lar abstract class'larda
object olusturamazlar

Soru: "Abstract Class ile İnterface in farkları nelerdir?

1)Method
   "Abstract Class" hem abstract hem de concrete method lar icerebilir
   "İnterface"ler sadece abstract method'lar icerir
   Ama istersek interface'lar içinde de "default ve static keyword'ler kullanarak concrete method lar olusturabiliriz
2) Variable
    "Abstract Class"larda normal Class"lardaki gibi her türlü variable olusturulabilir
    "İnterface"lerde ise variable'lar public static ve final olmak zorundadir.

3)İnheritance
     "Abstractd Class"lar class oldukları icin multiple inheritance'a müsaade etmezler
     "Interface"ler ise multiple inheritance'i     desteklerler
4)Object Creation
      "Abstraction Class"larda constructor vardır ama object olusturmada kullanılmazlar
       "İnterface"lerde ise constructor olmadığından  object olusturulamaz.

       Soru: Object Oriented Programming Language prensipleri nelerdir?
       i)Inheritance  ii) Polymorphism   iii)Encapsulation  iv)Abstraction
 */
public class Civic implements Engine,Ac{


    @Override
    public void run() {
        System.out.println("Civic runs well");
    }




}
