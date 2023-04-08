package day17exceptions;

public class Exception04 {
    public static void main(String[] args) {

        int age =250;

    try{
        printAge(age);
    }catch (IllegalArgumentException e){
        System.out.println(e.getMessage());
    }




    }

    //Yaş'ı ekrana yazdiran bir method olusturunuz
    public static void printAge(int age) {
        if (age < 0 || age>200) {
            throw new IllegalArgumentException("yas negatif olamaz veya 200 den buyuk olamaz");

        }
            System.out.println(age);



    }
}