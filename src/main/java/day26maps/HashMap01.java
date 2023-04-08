package day26maps;

import day20ifstatement.İfStatement01;

import java.util.*;

/*

1)Map'ler key-value structure kullanır
2)Key'ler unique'dir
3)Value'lar tekrarli data icerebilir
4)Maplerde eleman değil EntrySet kullanırız
5)Key'ler null  tekrarsiz olarak kullanılır
6)Value'lar null kabul eder
7)HashMap'ler EntrySet'leri herhangi bir siralamaya tabi tutmaz,rastgele siralar
8)Siralama ile vakit kaybetmediği icin HashMap'ler cok hizli calışırlar
 */
public class HashMap01 {
    public static void main(String[] args) {
        HashMap<String, Integer> studentAges = new HashMap<>();
        studentAges.put("Ali", 13);
        studentAges.put("Tom", 21);
        studentAges.put("Brad", 12);
        studentAges.put("Ajda", 76);
        studentAges.put("Cuneyt", 75);
        studentAges.put("Ali", 88);//Ayni key degerini tekrar kullandığınızda hata vermez "overwrite yapar
        studentAges.put(null, 55);
        studentAges.put(null, 66);
        studentAges.put("Ayhan Isık", null);
        studentAges.put("Sadri Alişik", null);
        System.out.println(studentAges);//{null=66, Tom=21, Ayhan Isık=null, Sadri Alişik=null, Ajda=76, Brad=12, Cuneyt=75, Ali=88}

        //Map'den sadece Key'ler nasıl alınır

        Set<String> keys = studentAges.keySet();
        System.out.println(keys);//[null, Tom, Ayhan Isık, Sadri Alişik, Ajda, Brad, Cuneyt, Ali]

        //Map'ten sadece value'lar nasıl alınır
        Collection<Integer> values = studentAges.values();
        System.out.println(values);//[66, 21, null, null, 76, 12, 75, 88]

        //Belli bir key'e ait value nasil alinir
        Integer cuneytAge = studentAges.get("Cuneyt");
        System.out.println(cuneytAge);//75

        //Example 1: Tüm integer yaşların ortalamasini hesaplayan kodu yazınız
        Collection<Integer> ages = studentAges.values();
        Integer sum = 0;
        int counter = 0;
        for (Integer w : ages) {

            if (w != null) {
                sum = sum + w;
                counter++;
            }
        }
        System.out.println("Ortalama yas:" + sum / counter);//56


        //Example 2: A ile başlamayan isimlerin icerdiği toplam karakter sayisini bulan kodu yazınız
        //[null,Ayhan Işık, Sadri Alişik,Tom,Ajda, Brad,Cuneyt,Ali]

        Set<String> names = studentAges.keySet();
        int sum1 = 0;
        for (String w : names) {

            if (w != null && !w.startsWith("A")) {
                sum1 = sum1 + w.length();
            }
        }
        System.out.println(sum1);

        // remove("Ajda",76) keys'si Ajda ve value'su 76 olan EntrySet i siler ve size boolean return eder
        boolean result = studentAges.remove("Ajda", 76);
        System.out.println(result);//true

        Integer result1 = studentAges.remove(null);
        System.out.println(result1);//66


        //Key varsa value'u ver, key yoksa sizin istediğiniz değeri verir

        Integer result2 = studentAges.getOrDefault("Brad", 0);
        System.out.println(result2);//12

        // Value null ise ekleme yapar value null değilse ekleme yapmaz
        Integer result3 = studentAges.putIfAbsent("Brad", 100);
        System.out.println(result3);

        Integer result4 = studentAges.putIfAbsent("Ayhan Isik", 100);
        System.out.println(result4);
        System.out.println(studentAges);

        //Key yoksa ekleme yapar
        Integer result5 = studentAges.putIfAbsent("Acun Ilıcali", 200);
        System.out.println(result5);
        System.out.println(studentAges);


        //replace()methodu value'lari key'e bakarak değiştirmek için kullanilir

        studentAges.replace("Acun Ilıcali", 49);
        System.out.println(studentAges);

        //replace() methodu value'lari key ve value'yu kontrol ettikten sonra değiştirdi
        studentAges.replace("Acun Ilıcali", 49, 53);
        System.out.println(studentAges);


        //Example 3 : Map'deki herbir entry'i ekrana farkli bir satirda olacak şekilde yazdiriniz
        //entrySet() methodu Map'deki elemanları bir Set'in icine koyarak size verir
        Set<Map.Entry<String, Integer>> entries = studentAges.entrySet();

        for (Map.Entry<String, Integer> w : entries) {
            System.out.println(w);
        }
    }
}