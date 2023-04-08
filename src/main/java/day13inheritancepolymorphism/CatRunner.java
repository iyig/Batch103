package day13inheritancepolymorphism;

public class CatRunner{
  /*
1) java da object olustururken Constructor'lar Parent'dan Child'a doğru calıştırılır
2) Java en üst parent constructor 'a çıkabilmek için "super()"kodunu kullanir
3)"super()" kodu her constructor'in ilk satirinda "gizli" olarak bulunur
4)"super()" kodunu isterseniz görünür şekilde de yazabilirisiniz
5)"super()" kodunu görünür şekilde yazarsanız sakin haaa ilk satır dışında bir satıra koymayaniz
 hata verir
 6)"super()" kodu Parent Class'dan constructor cagirmaya yarar
super();(görünmeyen) kodu javanın bu kodu gördüğünde parentê gitmesini sağlıyor.
 */

    public static void main(String[] args) {
        Cat cat1=new Cat();
    }
}


