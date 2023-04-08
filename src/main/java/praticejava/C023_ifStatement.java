package praticejava;

public class C023_ifStatement {

/*
Öprenci asağıdaki gibi notlar aldığında karşısındki degerleri yazdıran bir kod yazınız
not hesaplayıcı
90-100= A cok iyi
80-89= B iyi
70-79= C orta
60-69= D gecer
0-59= F zayıf
 */

    public static void main(String[] args) {
        int not = 50;
        if (not >= 90 && not <= 100) {
            System.out.println("Notunuz A Cok iyi");
        } if (not<90 && not>=80){
            System.out.println("Notunuz B cok iyi");
        }else if (not<80 && not>=70){
            System.out.println("Notunuz C Orta");
        }else if (not<70 && not>=60){
            System.out.println("Notunuz D gecer");

        }else{
            System.out.println("Notunuz F Zayıf");
        }

    }}