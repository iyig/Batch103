package day02loops;

public class ForLoop01 {

    public static void main(String[] args) {
        // 3 den 6 a kadar tamsayıların toplamını bulan kodu yazıı
      int sum= 0;

        for (int i = 3; i <=6 ; i++) {

            sum=sum + i;

        }
       // system.out printlen(sum) loopun dişina yazılırsa sum'in sadece son degerini ekrana yazdırır
        //içine yazılırsa her bir loop için sum hangi dergerleri aldığını yazdırır
        System.out.println(sum);
   // 6 den 3 kadar tamsayıların carpımını bulan kodu yazınız

        int multiply=1;

        for (int i = 6; i >2 ; i--) {

            multiply=multiply * i;

        }
        System.out.println(multiply);


       // size verilen  bir tamsayının rakamları toplamını bulunuz
    //385= 3+8+5
      //  385%10=5
        //385/10=38.5-->38
        //38%10=8
        //38/10=3.8-->3
        //3%10=3
        //3/10=0.3-->0

        int num= 385;
   // int num=-385;
    num=Math.abs(num);// negatif sayıların çalışbilmesi için
      int sonuc=0;

        for (int i = num; i > 0; i=i/10) {

sonuc=sonuc+i%10;



        }

        System.out.println(sonuc);

       // size verilen bir Stringi ters ceviren kodu yazınız
        //"Kaba"-->"abak"

        String str="Kaba";

      String ters="";  // o olmaz.bu bir concatenation toplama değil
        for (int i = str.length()-1; i >=0 ; i--) {
     char c=str.charAt(i);
      ters=ters+c;
        }
        System.out.println(ters);

    }
}
