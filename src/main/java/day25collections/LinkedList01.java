package day25collections;

import java.util.LinkedList;

public class LinkedList01 {
    public static void main(String[] args) {


        LinkedList<String> names = new LinkedList<>();
        names.add("Chris");
        names.add("Alexandre");
        names.add("Mark");
        names.add("Tom");
        names.add("jeremy");
        names.add("Hans");
        System.out.println(names);//[Chris, Alexandre, Mark, Tom, jeremy, Hans]
/*

Retrieves, but does not remove, the head (first element) of this list.
Returns:the first element  of this list or "null" if this list is empty

ilk eleman alma
 */
        String firstEl = names.peek();
        System.out.println(firstEl);//Chris
        System.out.println(names);//[Chris, Alexandre, Mark, Tom, jeremy, Hans] Chris'i silmedi list 'ten
        LinkedList<String> myList = new LinkedList<>();
        String first = myList.peek();
        System.out.println(first);//null


        /*
        Retrieves and removes (first element) of this list.
         Returns:the head of this list, or null if this list is empty
 */
        String firstElement = names.poll();
        System.out.println(firstElement);//Chris
        System.out.println(names);//[Alexandre, Mark, Tom, jeremy, Hans]

        /*
        Retrieves, but does not remove,  first element of this list.
        Throws:NoSuchElementException – if this list is empty
       */
        String f = names.element();
        System.out.println(f);//Alexandre
        System.out.println(names);//[Alexandre, Mark, Tom, jeremy, Hans]


        /*
      Retrieves, but does not remove, the first element of this list, or returns null if this list is empty.
      Returns:the first element of this list, or null if this list is empty
  */
        names.peekFirst();

        //Example 1: "A" ile başlayan tüm isimlerin "*****"e ceviriniz
        LinkedList<String> students = new LinkedList<>();
        names.add("Chris");
        students.add("Alexandre");
        students.add("Mark");
        students.add("Tom");
        students.add("jeremy");
        students.add("Hans");

        for (String w : students) {
            if (w.startsWith("A")) {
                students.set(students.indexOf(w), "*****");
            }
        }
        System.out.println(students);

//Interview Sorusu:
        //Example 2: List'deki 4 harften cok harf içeren isimleri siliniz
// Eleman sayisini azaltacağımız için i ye ihtiyacımız var o yüzden for-each loop değil for loop kullanıyoruz

        for (int i = 0; i < students.size(); i++) {
            ;

            if (students.get(i).length() > 4) {
                students.remove(students.get(i));
                i--;
            }


        }


    }}