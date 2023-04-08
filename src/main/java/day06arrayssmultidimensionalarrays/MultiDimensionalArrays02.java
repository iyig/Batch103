package day06arrayssmultidimensionalarrays;

import java.util.Arrays;

public class MultiDimensionalArrays02 {
/*
Array vey Collekciton var "for-ech-loop" kullanmak il tercininiz olsun
Array veya Collection var ama "index kullanmak zorundasinınız o zaman for each loop calışmaz,"for loop" veya while
loop" veya "do-while - loop" kullanmalısınız.
 */
    public static void main(String[] args) {

        //MultiDimensionalArray kısa yoldan nasil olusturulur

        char arr[][]={{'a','b'},{'C', 'D', 'E'},{'?'}};

        System.out.println(Arrays.deepToString(arr));//[[a, b], [C, D, E], [?]]
      //Bir String multidimensional array'de icinde "a" olan elemanları concole'a yazdırınız.,

        String brr[][]={{"learn","java","it"},{"is","easy"}};

        for(String[] w: brr){  // ["learsn", "java","it"]

            for(String k:w){

                if(k.contains("a")){



                }
            }
        }
    }
}
