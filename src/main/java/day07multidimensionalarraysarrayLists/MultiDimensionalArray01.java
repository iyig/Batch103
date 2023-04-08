package day07multidimensionalarraysarrayLists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MultiDimensionalArray01 {
    public static void main(String[] args) {


        //Bir tane integer multidimensional array olusturunuz
        //Bu arraydeki tüm sayiları toplamını veren kddu yaziniz

        int arr[][] = {{2, 5, 1}, {32, 75}, {13, 21, 43, 56}};

        int sum = 0;

        for (int[] w : arr) {

            for(int k: w){

                sum =sum + k;
            }

        }
        System.out.println(sum);

        //Bir multidimensional arrayi normal arraye ceviren kodu yazıız
//{{2, 5, 1}, {32, 75}}==> {2,5,1,32,75

        int brr[][]={{2,5,1}, {32,75}};
        int toplam=0;
        for(int[] w: brr){
            toplam= toplam+w.length;
        }
        System.out.println(toplam);
        int idx=0;
        int crr[]=new int[toplam];
        for(int[] w:brr){

            for(int k:w){

                crr[idx]=k;

                idx++;
            }
        }

        System.out.println(Arrays.toString(crr));
    }

    public static class ArrayLists01 {

            /*
             ArrayList'ler ayni data tipine sahip birden fazla data'yi depolamak icin kullanilir
             Array ile ArrayList'in farki nedir?
             1) Array olustururken Array'in icine kac tane eleman koyamayız gerektiğini söylemeliyiz, söyledimiz eleman
             sayisindan fazla eleman koyamayız.
             Array'ler eleman sayisinda"fixed" dirler.
             ArrayListleri olustururken eleman sayisi söylemeye gerek yok cünkü ArrayListler eleman sayisinda "flexible"(esnek) dirler
             2)Array'lerin icine "primitive" ve "reference"lar konabilir.
             ArrayListlerin  icine ise sadece "non- primitive" ler konulur.
             3) Array'lar super fast,cok hizli.Arrayler memory i cok az kullanir.
             Not: Eleman sayisi kesin belli olan coklu dataları doplamak için Array kullanırız, ama eleman sayisi değişken olan coklu datalar
             icin Array kullanma riskini almayin

             */
            public static void main(String[] args) {
                //ArrayList nasil olusturulur
                  //1.yol
                ArrayList<Integer> ages=new ArrayList<Integer>();

                 //2.yol
                ArrayList<Integer>heights=new ArrayList<>();

                  //3.yol
                List<Integer> nums=new ArrayList<Integer>();

                // ArrayListler nasil yazdırılır?
                System.out.println(nums);// []

                // ArrayListlere nasıl eleman eklenir

                nums.add(21);
                nums.add(18);
                nums.add(20);
                System.out.println(nums);//[21,18,20]

                nums.add(1,50);
                System.out.println(nums);//[21, 50, 18, 20]

                List<Integer>prices=new ArrayList<>();
              prices.add(23);
              prices.add(185);
                nums.addAll(prices);
                System.out.println(nums);//[21, 50, 18, 20, 23, 185]
                System.out.println(prices);//[23, 185]

                nums.addAll(2,prices);
                System.out.println(nums);//[21, 50, 23, 185, 18, 20, 23, 185]


                //ArrayListlerin eleman sayisi nasil bulunur?
                int elemanSayisi=nums.size();
                System.out.println(elemanSayisi);//8

                // ArrayListlerde herhangi bir eleman nasıl secilir
                //get() methodu istenen bir index'teki elemani verir
                int el1= nums.get(3);
                System.out.println(el1);//185

                // ArayyListerin boş olup olmadığını nasıl anlarız?

                boolean bos1= nums.isEmpty();
                System.out.println(bos1);//false
               boolean bos2= ages.isEmpty();
                System.out.println(bos2);//true

                //ArrayList'de bir eleman nasil değiştirilir'
                nums.set(3,200);
                System.out.println(nums); //[21, 50, 23, 200, 18, 20, 23, 185]

                //Example 1: nums Arraylist'indeki tüm tek sayıları 11 artırdıktan sonra ekrana yazdırınız.

                for(int w :nums) {
                    if (w % 2 != 0) {
    nums.set(nums.indexOf(w), w+11);
                    }

                    }
                System.out.println(nums);


    // remove() methodunu içine tamsayi koyarsanız Java onu index olarak kabul eder
             //Example 2: ArrayList'den 200 elemani ilk görünümünü siliniz
       // Note: Tüm tamsayılar Java icin aksi söylenmedikce primitivedir.yani "int"dir
                //Note 2: "primitiveler ArrayListlerin elemani olamazlar
                //NOte 3: "primitive" i "Wrapper Class"a cevririrseniz, non primitive olur ve non-primitiveler Arraylistlerin elemani olur.idex olamaz
                Integer sayi=200;
                nums.remove(sayi);
                System.out.println(nums);
             //   nums.remove(200);
                }
            }
}