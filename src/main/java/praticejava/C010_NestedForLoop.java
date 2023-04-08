package praticejava;

import java.util.Scanner;

public class C010_NestedForLoop {
/*
Dikey olarak bolunen bir agac sekli cizini ağacın tac uzunluğunu kullanicıdan aliniz
Not gövde sabit sayi =5 olsun



Tac uzunluğu-> 6 iken
^
^^
^^^
^^^^
^^^^^
^^^^^^
|||
|||

 */

    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("Lutfen agacın tac uzunluğunu girniz");
        int tacUzunlugu=input.nextInt();

        String yaprak="";
        for (int i = 0; i <tacUzunlugu ; i++) {
            yaprak+="*";
            System.out.println(yaprak);
        }
   for(int i=0; i<6; i++){
            System.out.println("|||");
        }

    }


}
