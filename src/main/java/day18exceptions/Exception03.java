package day18exceptions;

public class Exception03 {

  /*

  1) Java Exception'lar olusturarak Developer'ların Java kurallarına uymalarını temin etmiştir
  2)Biz de application uretirken kendi Exceptionlarımızı olusturarak diğer developer'ların bizim ortaya koyduğumuz kurallara
  uymalarını temin ederiz
  3)Bizim ürettigimiz Exception'lara "Custom Exception" denir
  4)Custom Exceptionlar da "RunTimeException ve CompileTimeException olabilir
  5)Custom "RunTimeException" üretmek icin "extends RuntimeException" deriz
  6)Custom "CompileTimeException" üretmek icin "extends Compilehu7ıltimeException" deriz
   */

    public static void main(String[] args) throws IllegalGradeException {
        printGrades(120);
        checkedNameFormat("ali");

        // öğrenci notlarını yazdıran bir method olusturunuz


    }

    public static void printGrades(double grade) throws IllegalGradeException {

        if (grade < 0 || grade > 100) {
            throw new IllegalGradeException("Grade 0 dan az 100 den cok olamaz");
        } else {
            System.out.println(grade);
        }
//verilen ismin ilk harfinin buyuk harf olmamasi durumunda exception atan method yazınız


    }

    public static boolean checkedNameFormat(String name) {

        if (name.charAt(0) >='A' && name.charAt(0) <= 'Z') {
return true;
        } else {
            throw new IllegalNameException("Isimler buyuk harfle baslamalidir");
        }


    }
}
