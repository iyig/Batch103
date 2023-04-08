package day25collections;

import java.util.Deque;
import java.util.LinkedList;

/*

Deque: Double Ended Queue mansindadir yani iki uclu Queue demektir

FİFO(First In First Out) ve LIFO(Last In First Out) beraber gerektiğinde kullanilir
 */
public class Deque01 {

    public static void main(String[] args) {
Deque<String> furnitureTruck =new LinkedList<>();


        furnitureTruck.add("Chair");
        furnitureTruck.add("Mirror");
        furnitureTruck.add("Sofa");
        furnitureTruck.add("Bed");
        furnitureTruck.add("Bed");
        furnitureTruck.add("Bed");
        furnitureTruck.add("Dining Table");
        System.out.println(furnitureTruck);//[Chair, Mirror, Sofa, Bed, Bed, Bed, Dining Table]

//push() addFirst() methodu gibi çalışır. İlk sıraya ekler
        furnitureTruck.push("Refrigeratur");
        System.out.println(furnitureTruck);//[Refrigeratur, Chair, Mirror, Sofa, Bed, Bed, Bed, Dining Table]
    }

}
