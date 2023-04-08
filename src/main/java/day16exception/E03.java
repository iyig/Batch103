package day16exception;

public class E03 {
    public static void main(String[] args) {
        String str = "Ali";
        getNumOfChars(str);//3


        String s = "";
        getNumOfChars(s);//0

        String t = null;
        getNumOfChars(t);//NullPointerException
        //eger length() methodunda null kullanırsanız bu exception i alırsınız
    }

    //Bir String te bulunan karakterlerin sayisini bulabilmek için bir method olusturunuz
    public static void getNumOfChars(String str) {

        try {
            System.out.println(str.length());
        } catch (NullPointerException e) {
            System.out.println("Length() methodunda bir problem oluştu");

            e.printStackTrace();
// bu methodu kullandığınız zaman System.out.println() kullanmınıza gerek yok
        }
    }
}