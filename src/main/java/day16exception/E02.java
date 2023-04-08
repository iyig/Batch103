package day16exception;

public class E02 {
    public static void main(String[] args) {
        String arr[] = {"Ali", "Can", "Veli", "Han"};
        getElementFromArray(arr, 2);//Veli
        getElementFromArray(arr, 0);
        getElementFromArray(arr, 4);//ArrayIndexOutOfBoundsException


    }

    //Bir String Array'den İndex girerek eleman elde edebilmek için bir method olusturun
    public static void getElementFromArray(String arr[], int idx) {
        try {

            System.out.println(arr[idx]);
        } catch (ArrayIndexOutOfBoundsException e) {
            // Bu benim teknik olmayan acıklamam
            System.out.println("Array index te bir problem meydana geldi.");
//Exception ile ilgili detaylica teknik mesaj verir
             e.printStackTrace();
             //Hata mesajini diğer mesajlardan ayırmak için
             System.err.println("Array index te bir problem yaşandı");
        }
    }
}