package day14inheritancepolymorphism;

public class Cat extends Mammal {
public void meow(){
    System.out.println("Cat meow");

}

    @Override //@Override annotation'ini kullanarak, Java'nın yaptığımız Override işlemini kontrol etmesini sağlarız
    public void eat() {
        System.out.println("Cats eat");
    }

    @Override
    public int add(int a, int b) {
        return a+b+1;
    }

    @Override
    public Integer multiply(int a, int b) {
        return a*b+1;
    }
// aşağıdaki method Overriding Method
    @Override
    public Animal create() {
return new Mammal();
    }





    /*
1)Override yaparken "method'un body" si degiştirilir
2)Override yaparken ASLA method signature'a (isim ve parametre) değiştirilemez
3) Override yaparken "inheritance" olmak zorundadir.
4)Override yaparken "access modifier"lar belli kurallara göre farklılaştırılabilirler
i)private methodlar override edilemezler
ii) Child Classdaki overrride edilen methodun access mofifier'i Parent classdaki metodun access mofier'i ile
ayni veya geniş olmalidir
iii) default methodlar ayni package icindeyese override edilebilirler
farklı package'den override edilemezler
5) Parent Class'daki methodun "return tpe" i void ise  "return type" değiştirilemez
6) Parent Class'daki methodun "return type" i primitiv ise "return type" degiştirilemez
7)Parent Class'daki methodun "return type'i Wrapper Class ise "return type değistirilemez
8)Parent Class'daki methodun "return typei Parent Class ise "return type child'lardan biri olabilir
Note: Child Classdaki return type Parent Class'dakinden geniş olamaz
Note:Aralarında Parent Child ilişkisi olmayan Classlar Overridingde Return type ilişkisis kullanılamazlar. Mesela "Short", "Integer"dan kücüktür
fakat aralarnda "Parent Child" ilişkisi olmadığından "Integer" yerine "Short" kullanamazsınız
Child daki methodun Return Type inden Paremt 'taki methodun Return Type'inin gidiste "IS-A Relationship olmalı
NOte: Aralarında "IS-A relationship olan Data Typlara "Covariant" denir
9)Child> Parent ==> IS-A(Her kedi hayvandir  ama her hayvan kedi deildir
                  HAS-A(Hayvanlar kedileri içerir ama kediler tüm hayvanları içermez
10)"final" methodlar Override edilemezler cünkü Overriding de method body değiştirilir fakat "final" method body
değiştirilmesine müsadde etmez

11) Polymorphism= Overloading + Overriding
12) Note: Polymorphism nedir? Overloading ve Overriding'i anlatin
13) Overloading ile Overriding arasindaki farklar nelerdir?
i) Overloading için "inheritance" gerekmez fakat Overriding için gerekir
ii) Private methodlar Overload edilebilir.Override edilemezler
iii)"final" methodlar Overload edilebilir, Override edilemezler
iv)Overloading static polymorphism olarak, Overriding " dynamic polymorphism" olarak adlandirilir
cünkü static methodlar Overload edilebilir, Override edilemezler.
V) "Overloading" de method signature değişir ama "Overriding" method signature a dokunulmaz

 */

}
