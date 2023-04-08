package day24abstractionCollections;

import java.util.LinkedList;

public class LinkedList01 {

/*
Lİstlere coklu ve tekrarlı data depolamak istediğimizde ihtiyaz duyarız.bir okulda öğrenci isimleri gibi

Setlere coklu ama tekrarsiz data depolamak istedigiğimizde ihtiyac duyarız.Bir okuldaki öğrenci id.lerini depo-
lamak için Set
1) LinkedList'deki her eleman iki bolumunden oluşur. i) Data  ii) Pointer
2)LinkedList'deki her bir eleman "Node" olarak adlandırılır
3) LinkedList'ler eleman ekleme ve eleman silme islemlerinde cok başarılıdırlar
4)LinkedList'ler eleman arama işlemlernde başarısızdirlar
5)3. ve 4. maddelerden dolayı eleman ekleme ve eleman silme işlemlerinin cok yapılacağı durumlarda LinkedList
 kullanılmalidir
6)ArrayList'ler index kullanir LinkedList'ler index kullanmaz
7)Index kullanmak eleman bulma işlemlerinde cok başarılıdır.Bu yüzden eleman bulma işlemlerini cok yapcacaksınız
ArrayList kullanmalisiniz
 */

    public static void main(String[] args) {
        LinkedList<String>visitors= new LinkedList<>();
        visitors.add("Tom");
        visitors.add("Hanks");
        visitors.add("Tom Hanks");
        visitors.add("Brad");
        visitors.add("Pitt");
        visitors.add("Brad Pitt");
        visitors.add(2,"Angelina Julie");
        visitors.add("Brad Pitt");
        visitors.add("Tom Hanks");

        System.out.println(visitors);//[Tom, Hanks, Angelna Julie, Tom Hanks, Brad, Pitt, Brad Pitt, Brad Pitt, Tom Hanks]


//LinkedList'ler ekleme ve silme işlemlerinde cok başarılı olduklarından eklme ve silme ile alakali cok fazla method icerir
        visitors.addLast("Ajda Pekkan");
        visitors.addFirst("Cuneyt Arkin");
        System.out.println(visitors);//[Cuneyt Arkin, Tom, Hanks, Angelna Julie, Tom Hanks, Brad, Pitt, Brad Pitt, Brad Pitt, Tom Hanks, Ajda Pekkan]

        visitors.removeLast();//Ajda Pekkan ı sildi
        System.out.println(visitors);//[Cuneyt Arkin, Tom, Hanks, Angelna Julie, Tom Hanks, Brad, Pitt, Brad Pitt, Brad Pitt, Tom Hanks]

        visitors.removeFirst();// cüneyt Arkin ı sildi
        System.out.println(visitors);//[Tom, Hanks, Angelna Julie, Tom Hanks, Brad, Pitt, Brad Pitt, Brad Pitt, Tom Hanks]

        visitors.removeFirstOccurrence("Tom Hanks");
        System.out.println(visitors);//[Tom, Hanks, Angelna Julie, Brad, Pitt, Brad Pitt, Brad Pitt, Tom Hanks]

        visitors.removeLastOccurrence("Brad Pitt");
        System.out.println(visitors);//[Tom, Hanks, Angelna Julie, Brad, Pitt, Brad Pitt, Tom Hanks]
/*
   Removes and returns the first element of this list.
   This method is equivalent to removeFirst().
   Throws:
   NoSuchElementException – if this list is empty

 */
        String firstEl=visitors.pop();// cut+Paste ==>ctrl + x
        System.out.println(firstEl);//Tom

        System.out.println(visitors);//[Hanks, Angelna Julie, Brad, Pitt, Brad Pitt, Tom Hanks]

        LinkedList<String>myList= new LinkedList<>();
       // myList.pop();//NoSuchElementException atti cünkü LinkedList bos
    }
}
