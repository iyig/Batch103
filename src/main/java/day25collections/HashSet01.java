package day25collections;

import java.util.HashSet;

public class HashSet01 {
/*
Hash bir tekniktir,birbirine benzemeyen code'lar üretir bu code'lar  data'yi unique yapar
Setlere, coklu ama tekrarsiz data depolamak istediğimizde ihtiyac duyarız.(öğrenci numaralar gibi)

HashSet'ler eklenen elemanların siralamasi ile ugraşmaz.siralama ile alakali zaman harcamaz bu yüzden
cok hizli çalışır

HashSet'ler İndex kullanmazlar cünkü siralama rastgele yapıldığı için index manali olmaz

HashSetler:
1.Tekrarsiz elemanlarda
2.Sıralama önemli değilse
3.Hız cok önemliyse
4.Indexs kullanmazlar
 */

    public static void main(String[] args) {


        HashSet<String> emails = new HashSet<>();
        emails.add("Apple");
        emails.add("Mango");
        emails.add("Orange");
        emails.add("Apricot");
        emails.add("Fig");
        System.out.println(emails);//[Apple, Fig, Mango, Apricot, Orange]

       //Var olan elemani eklereniz hata vermez,son ekleneni var olan data'nin üstüne yazar(Overwrite)
        emails.add("Mango");
        System.out.println(emails);//[Apple, Fig, Mango, Apricot, Orange]

        emails.add(null);
        emails.add(null);
        emails.add(null);
        System.out.println(emails);//[null,Apple Fig Mango Apricot Orange]


    }
}