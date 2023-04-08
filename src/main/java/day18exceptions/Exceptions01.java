package day18exceptions;

public class Exceptions01 {

    public static void main(String[] args) {

        double r1 = compareNumOfCharacters("Java", "xy");
        System.out.println(r1);
        double r2 = compareNumOfCharacters(null, "xy");
        System.out.println(r2);
        double r3 = compareNumOfCharacters("Selenium", "");
        System.out.println(r3);

    }
// Verilen iki String'den birinin karakter sayisinin diğerinin kac kat olduğunu veren method olusturunuz

    public static double compareNumOfCharacters(String s, String t) {


        double result = 0;


        try {
            result = s.length() / t.length();

        } catch (NullPointerException e) {
            System.out.println("length() methodu null ile kullanılmaz");
        }catch (ArithmeticException e){
            System.out.println("herhangi bir sayi sifir ile bölünemez");
        }finally {
            System.out.println("Database ile connection kesildi");
        }
return result;



    }

/*

"final", "finally", "finalize" açıklayınız.

1) "final" bir keyword'dur. Variable, Class ve Method'lar için kullanilir
"final" keyword
i)Variable'larda kullanılabilir
public final int age =12;
a)Atanan değer değiştirilemez
b)Değer atamasi yapılmak zorundadir

İİ)Method'larda kullanilabilir
public final int add(){
return a+b
a) Bir method olusturulurken "final" olarak olusturulmuş ise o methodun body'si asla değiştirilemez. Dolaysiyla
o method override edilemez

iii)Class'larda kullanilabilir
Bir Class'i "final1 yaparsanız o Class'i kısırlaştırmış olursunuz
Bir Class "final" ise o Class 'a extend edilemez
"final" Class Child olabilir

2)"finally" bir code block dur
try-catch veya sadece "try" ile kullanilir
"finally" code block icine yazilan code'lar her halukarda caliştirilir
Mesela Database ile connection'i kesmek herhalukarda yapılması gereken bir fiildir. Bunu "finally" ile yapabilir
3."finalize" bir methoddur.Bu method Java tarafından datalar imha edilmeden önce cağrılır.bu method dataları
imha edilecek hale getirir ve daha sonra "Garbage Collector" bu data'ları imha eder


"finalize" methodunu Java Developer'lar da cağırabilir ama Java kendi bildiğini yapar
 */
}
