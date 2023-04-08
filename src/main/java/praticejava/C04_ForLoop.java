package praticejava;

import java.util.Scanner;

public class C04_ForLoop {

/*
 Kullanicıdan bir kelime isteyin
 alinan kelimenin karakter dizisinin her harfi ve
 bu harfin karakter dizisi içindeki index'ini birer satıra yazıdırn
 Karakter               Index
 i                     0
 s                     1
 t                     3
 a                     4
 b                     5
 u                     6
 l                     7
 */
public static void main(String[] args) {
    Scanner input =new Scanner(System.in);
    System.out.println("Lütfen bir kelime giriniz");
    String kelime=input.nextLine();
int index=0;

    System.out.println("\tKarakter" + "\t Index");

    for (int i = 0; i <kelime.length() ; i++) {
        System.out.println("");
        System.out.print("\t\t"+ kelime.charAt(i)+ "\t\t" +index);
        index++;

    }

}
}
