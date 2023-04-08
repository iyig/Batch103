package day02loops;

public class DoWhileLoop01 {
    public static void main(String[] args) {

// while loop için loop bodysi icindeki kodun hic calıştırılmama ihtimali vardır.
        // zero execution mumkündür
        int i = 1;
        while (i < 1) {

            System.out.println("While loop");// while loop bazı durumlarda hic calışmayabilir yani while loop iicn zero executoion mümkndür

            i++;
        }
// en az bir kere çalışır

        int k = 1;
        do {
            System.out.println("do-while loop");
            k++;

        } while (k < 1);



        // Example 2: Bir ondalik sayının ondalik kısmındaki rakamlarını toplamını bulunuz

        //24.5673 ==> 5+6+7+3=23

        double num = 24.5673;
        System.out.println(num);
        // String.valuof() methodu parantezin icine konulan data nin tipini String yapar
        String str = String.valueOf(num);
        System.out.println(str);//24.5673

        // Regex icin nokta kullandığınızda onune "\\" koyunuz. Yani nokta "\\" şeklinde kullanılır
        String decimalPart = str.split("\\.")[1];
        System.out.println(decimalPart);// 5673

        int decimalInt = Integer.valueOf(decimalPart);
        System.out.println(decimalInt);//5673
int sum =0;

do {
    sum= sum + decimalInt%10;  // 3     7    6    5

    decimalInt=decimalInt/10;// 567   56   5
}while (decimalInt>0);
        System.out.println(sum);
    }
}