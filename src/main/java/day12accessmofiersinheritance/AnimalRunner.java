package day12accessmofiersinheritance;

public class AnimalRunner {
/*
1) İnheritance sayesinde
i) Code tekrarlarındn kurtuluruz
ii) Code tamiri (maintenance) kolay olur
iii) Child classları daha atomic yapmiş oluruz


2) Bir class'i başka bir Class'ın Child class'ı yapmak için "extends" keyword kullanılır. İlk yazilan Class child
ikinci yazilan Class parent olur

3) Child Class objectleri Parent classdan method ve variableları kullanabilirler
4) Parent Class objectleri Child Class dan method ve variablelari kullanamazlar
5) Object Class her Class'in parent idir
Java da Object Class haric her Class'in parenti vardir
Java da parenti olmayan tek Çlass Object Classdır
6) "private" method ve variable'lar Child Classlar tarafından  kullanılamaz
7) protectedd  method ve variablelar Child classlar tarafından  kullanilabilir
8) "default" method ve variable'lar ayni package'deki  Child Classlar tarafından kullanılabilir
9) "public" method ve variable'lar Child Classlar tarafından kullanılabilir
Note: Child Class'lar tarafıdan kullanilabilir olmak "Inherit" edilebilir demektir


10)
 4 tip inheritance vardır

   İ)Multilevel Inheritance: Java bunu kabul eder
   İİ) Hierarchical İnheritance: Bir parent için coklu child Java bunu kabul eder
  iii) Multiple İnheritance : Bir Child'a coklu Parent,Java bunu destelemez.(Java does not support Multiple Inheritance
  iv) Single Inheritance: Bir Child Class için bir Parent Class demektir.Java bunu destekler
 */
    public static void main(String[] args) {

        Cat c1= new Cat();
        c1.eat();
        c1.drink();
        c1.meow();
Dog d1= new Dog();

    d1.bark();
    d1.drink();
    d1.eat();



    }
}
