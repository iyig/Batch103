package praticejava;

import java.util.Arrays;
import java.util.Scanner;

public class C018_DemensionalArrays {

    /*
    Kullanicıdan alınan bir String'de gecen sesli harfleri console yazdırın
     */
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Lutfen String bir ifade giriniz");
        String str =input.nextLine();

        String arr[]=str.split("");//Cumleyi array'e dönüştürdük
        System.out.println(Arrays.toString(arr));

        for (int i = 0; i < arr.length; i++) {

            if(arr[i].equalsIgnoreCase("a")||
                    arr[i].equalsIgnoreCase("e")||
                    arr[i].equalsIgnoreCase("u")||
                    arr[i].equalsIgnoreCase("o")||
                    arr[i].equalsIgnoreCase("i")){
                System.out.println(arr[i]);
            }
        }
    }

}
