package day21nestedifswitch;

public class NestedIf {

    public static void main(String[] args) {
        /*

        Password'un ilk harfi buyuk harf ise
        'A' olursa gecerli password aksi halde gecersiz password
        Passwordun ilk harfi kücük harf ise
        'z' olusa gecerli password aksi halde gecersiz password
         */
   String pwd="6xy12!";

char ilkHarf=pwd.charAt(0);

   if (ilkHarf>='A' && ilkHarf<='Z'){

if (ilkHarf=='A'){
    System.out.println("Gecerli Password");

}else{
    System.out.println("Gecersiz password");
}
   }else if (ilkHarf>='a'&& ilkHarf<='z'){
       if (ilkHarf=='z'){
           System.out.println("Gecerli Password");
       }else {
           System.out.println("Gecersiz Password");
       }

   }else{
       System.out.println("Ilk Karakter harf olmalidir");
   }
    }

}
