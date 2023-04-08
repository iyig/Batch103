package day04Loopsarrays;

import java.util.Arrays;

public class Arrays01 {

    public static void main(String[] args) {

        int stdAges[]=new int[7];//[0, 0,0,0,0, 0, 0]


        System.out.println(Arrays.toString(stdAges));

        // Array'lere elemanlar nsıl eklenir?

        stdAges[1]=11;
        stdAges[0]=12;
        stdAges[2]=13;
        stdAges[3]=14;
        stdAges[4]=10;
        stdAges[5]=12;
        stdAges[6]=12;
        System.out.println(Arrays.toString(stdAges));

        //Arraydeki herhangi bir elemani nasıl yazdırabiliriz?
        System.out.println(stdAges[4]);

        //Example 1:Arraydeki en kücük ve en büyük elemanı ekaranı yazdırınız

        Arrays.sort(stdAges);

        System.out.println(Arrays.toString(stdAges));

        int ilk= stdAges[0];
        // Not: "Length()" Strinlerde kullanılır, "length" Arraylerde kullanılır
        int son= stdAges[stdAges.length-1];
        System.out.println(ilk+son);//24

        // Example 2: stdAges Array'i icindeki tüm elemanların toplamını ekrana yazdıran kodu yazınız.
        int sum=0;

        for (int i = 0; i <stdAges.length ; i++) {


            sum= sum + stdAges[i];

        }
        System.out.println(sum);
  //2.yol

        int i=0;
        int toplam=0;

        while(i<stdAges.length){
            toplam= toplam+stdAges[i];

       i++;
        }
        System.out.println(toplam);


        //3.yol do while-loop
int k=0;
   int s=0;
        do {

            s=s+stdAges[k];

            k++;
        }while(k<stdAges.length);
        System.out.println(s);


        // 4.yol : for each loop Array'lerde ve Collections'larda kullanılır
int t=0;
        for (int w:stdAges) {
          t= t + w;
        }

        System.out.println(t);
       //Example3: String bir array olusturunuz
       //Bu Arraye 5 tane isim yerleştiriniz
       // bu isimlerdeki karakter sayilarını toplamını ekrana  yazdırınız


        String stdName[]=new String[5];

        stdName[0]= "Ali";
        stdName[1]= "Tom";
        stdName[2]= "Veli";
        stdName[3]= "Kemal";
        stdName[4]= "Cem";

        int karakterSayilariToplami=0;

        for(String w: stdName){
   karakterSayilariToplami= karakterSayilariToplami + w.length();

        }
        System.out.println(karakterSayilariToplami);//18

        //Example 4: Char br array olusturunuz
        // Bu arrayê 5 eleman ekleyiniz
        // Bu arraydeki sadece buyuk harfleri ekrana yazdırınız

        char ch[]= { 'A', 'c', 'D', 'k','m'};
        for( char w: ch){
            if (w>'A'&&   w<'Z'){
                System.out.println(w);
            }
        }
    }

}
