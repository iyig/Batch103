package day23abstraction;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
/*

       "throw ile "throws" arasındaki farklar nelerdir?
1) "throw" methodun body'si icinde kullanilir."throws" ise methodun isminden sonra kullanilir
2) "throw" dan sonra object olusturulur."throws" sonra ise sadece Exception class'ın ismi yazilir
3) "throw" methodun icinde istediğimiz yerde Exception uretmek (atmak) icin kullanilir."throws" ise var olan checked Exception'i
(compileTime) atmak için  kullanilir
4)"throw" dan sonra sadece bir tane Exception olabilir
"throws"dan sonra 1 den fazla Exception olabilir
 */
public class ReadFileLineByLine {

    public static void main(String[] args){
  readFileLineByLine();
    }



     public static void readFileLineByLine(){

    try {
        BufferedReader br= new BufferedReader(new FileReader("src\\main\\java\\day18exceptions\\File1.txt"));

 String line= br.readLine();
  while (line!=null){
      System.out.println(line);
      line=br.readLine();

  }

    } catch (FileNotFoundException e){
    System.out.println("Ya path yanlış  yada dosya silinimiş - " + e.getMessage());
    } catch (IOException e) {

        System.out.println("okunamayacak character veya characterler var-" + e.getMessage());
    }
}
}
