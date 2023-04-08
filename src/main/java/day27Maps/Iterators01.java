package day27Maps;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Iterators01 {

    public static void main(String[] args) {
        List<String>myList=new ArrayList<>();

        myList.add("Z");
        myList.add("K");
        myList.add("A");
        myList.add("J");
        myList.add("M");

        //for each loop kullanarak her elemanın sonua "!" ekleyiniz
//Note: Loop'lar kendi başlarına "Collection" ları update edemezler bu yüzden Java "Iterator"ları olusturdu
        //Iteratro'lar Collection'ları update etmek için kullanilir
        for (String w: myList){
                w=w+"!";
        }

        System.out.println();

        ListIterator<String>itr= myList.listIterator();
        while (itr.hasNext()){
            String el=itr.next();
            itr.set(el + "!");
        }
        System.out.println(myList);
    }


}
