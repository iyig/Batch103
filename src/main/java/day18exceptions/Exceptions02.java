package day18exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Exceptions02 {
/*
1) FileInputStream fis= new FileInputStream("src\\main\\java\\day18exceptions\\File1.txt");
 new" den sonraki "FileInputStream" hata verir.Cünkü; biz Java'ya verilen adresteki dosya'ya git dedik.Java iki endişe'ye kapildi
 i)Ya adres yanlıssa
 ii)Ya verilen adreste dosya yoksa
 Biz method isminden" sonra, "throws FileNotFoundException" yazarak, Java'ya bu iki endise duyduğun durum oluşursa
 "Exception At" dedik.

 2)   while((k=fis.read())!=-1){} yazdığımızsa "read()" methodu hata verir.Cünkü biz Java dosyadaki karakterleri
 oku dedik. Java bir endişeye kapıldı
i)Ya okuması gereken karakterler Java'nin bilmediği karakterlerse
 Biz method isminden sonra "throws IOException" yazarak Java'ya bu durumla karşılastiğında "Exception At" dedik

 3) Method isminden sonra "throws IOException" yazarsanız java "throws FilNotFoundException"i siler .Cünkü;
 "IOException", "FileNOtFoundException" i kapsar."IOException", "FileNotFoundException" in parent'dir, onun yaptığı herşeyi
 yapabilir o yüzden "IOException" varken "FileNotFoundException"a gerek yoktur.

 "IOException", "Input Output Exception" demektir.

 4)Gördüğünüz gibi "IOException" ve FileNotException" biz kod yazarken daha "Run" butonuna basmadan ortaya çıktı
 Bu tarz Exceptionlara "Compile Time Exception" denir. Diğer adları "checked Exception"dir
 "Compile Time Exception"lar kesinlikle halledilmelidir(Exception Handling), halletmeden code yazmaya devam etmeyiniz

 */
    public static void main(String[] args) throws IOException {
        readTheTextFromTheFile();
        readTheText();


    }
// Bir text file'daki text'i okuyan kodu yaziniz
   // 1.Yol
    public static void readTheTextFromTheFile() throws IOException {
        FileInputStream fis= new FileInputStream("src\\main\\java\\day18exceptions\\File1.txt");
        int k=0;
        while((k=fis.read())!=-1){
            System.out.print((char) k);
        }
    }



    // 2.Yol
    public static void readTheText(){

        try {
            FileInputStream fis = new FileInputStream("src\\main\\java\\day18exceptions\\File1.txt");
            int k=0;
            while((k=fis.read())!=-1){
                System.out.print((char) k);}
             } catch (FileNotFoundException e) {
            System.out.println("Dosya'nin adresi veya varlığı ile ilgili bir problem var");
             } catch (IOException e) {
            System.out.println("Dosya'da okunamayan bir karakter var");
        }
    }






}
