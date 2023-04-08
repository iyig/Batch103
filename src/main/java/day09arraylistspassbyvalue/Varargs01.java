package day09arraylistspassbyvalue;

public class Varargs01 {
   /*
   Farkli sayilardaki parametrrelerle çalışabilen bir method olulsturmak isterseniz "varargs" kullanmalisiniz
   2. "varargs"  arka tarafta "array" kullanir, bu yüzden "varargs" larla calışirken "Array lerle calisiyormuş gibi
   davranabilirsiniz
   3."varargs" olusturmak için "<data type>... <varargs ismi>"
   4. Bir method'da "varargs in yanında başka bir parametre kullanabilirmi
"varargs" en sonda olmak şarti ile kullanilir
5.Bir method da birden fazla "varargs" kullanılabilir mi?
"varargs" en sonda olmak zorunda olduğundan birden fazla kullanirsaniz en az biri en sonda olmayacaktır.Bu da 4.kural ile
çelişir
    */


    public static void main(String[] args) {
int r1= add(2,3);
System.out.println(r1);//5


        int r2= add(2,3,4);
        System.out.println(r2);//9



        int r3= add(2,3,4,5,6,7,8);
        System.out.println(r3);
    }
// iki sayinin toplamınınn return eden bir method olusturunuz

   // public static int add(int a, int b) {
     //   return a + b;
   // }

    // Uc sayinin toplamınınn return eden bir method olusturunuz
  //  public static int add(int a, int b, int c) {
  //      return a + b + c;
  //  }
// Dört sayinin toplamınınn return eden bir method olusturunuz


 //  public static int add(int a, int b, int c, int d) {
   //     return a + b + c + d;
   // }

    // İstediğimiz kadar sayiyi topolayabileceğimiz bir metod olusturalim
    public static int add(int... a) {

        int sum = 0;

        for (int w : a) {
            sum = sum + w;
        }
        return sum;

    }
}