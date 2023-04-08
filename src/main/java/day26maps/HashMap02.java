package day26maps;

import java.util.HashMap;

public class HashMap02 {
/*

1)Siz Hash<String,Double>salaries=new HashMap<>();" kodu yazdığınızda Java memory'de 16 kutu(buket) iceren bir yapi oluşturur
bu yapıdaki herbir kutuya index verir. Indexler 0 dan 15 kadardir
2) Siz "salaries.put("QA ",110000.00); kodunu yazdığınızda Java, key icin bir HashCode olusturur bu HashCode'u 15'e böler
ve kalani index olarak kullanir.
ve bu elemani o index'e yerleştırir.
3)Yerleştirirken 4'lu bir yapi olusturur,bu yapinin ilk bölümüne "HashCode" u, ikinci bölümüne "Key" i ucuncü bülümüne "Value
ve dördüncü bolümüne "pointer"i koyar. Bu cok bolümlü yapi LinkedList'lerdeki "Node" dur.Yani HashMap bucket'lari koydugu
data'yi LinkedList olarak depolar
4)Java "null" icin hep HashCode olarak "zero" üretir, o yüzden key null olduğunda eleman ilk bucket'a yerleştirilir
Bundan dolayı keys'si null olan elemanlar Map'in içinde genellikle ilk sirada gözükürler
5)Java normalde HashCode'ları unique yapar ama bazen trafik kazasi gibi farkli iki eleman icin
ayni HashCode uretilebilir.Buna "Hash Collision" denir .Hash Collesion meshur bir Java Development problemidir.
Bu problemle karşılasildiğinda developerlar bu problemi cözmek için kodlar yazarlar ama bu Core Java nin konusu değildir
 */

    public static void main(String[] args) {
        HashMap<String,Double>salaries=new HashMap<>();

        salaries.put("QA", 110000.00);
    }
}
