package day10datatime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;

public class DateTime03 {

    public static void main(String[] args) {

        //Example1: Japonya ile Almanyadaki arasındaki zaman farkını saat olarak hesaplayan kodu yazınız
        LocalDateTime japan= LocalDateTime.now(ZoneId.of("Asia/Tokyo"));
        LocalDateTime germany= LocalDateTime.now(ZoneId.of("Europe/Berlin"));

      Long fark=  ChronoUnit.HOURS.between(germany,japan);
        System.out.println(fark);

        //Example 2: Sabit bir tarih olusturunuz

        LocalDate myDate= LocalDate.of(2011, Month.APRIL,13);
        System.out.println(myDate);//2011-04-13

        /*
        1)Java'da sabit dataları Gün isimleri,Ay isimleri,Amerikadaki eyalet isimleri etc.) depolamak ve gerektiğinde
        kullanmak için depolar olustururuz. Bu depolara "Enum" denir.
         */
   //Example3: USSA için Woow!, UK icin "Big", CANADA" için "Cold", TURKEY" için "Vatan", "GERMANY" için "Araba",
        //RWANDA" icin "Cay"

        Countries country= Countries.GERMANY;
        switch (country){
                case USA:
                System.out.println("Woow");
               break;
                case UK:
                System.out.println("big");
                break;
            case CANADA:
                System.out.println("Cold");
                break;
            case TURKEY:
                System.out.println("Vatan");
                break;
            case GERMANY:
                System.out.println("Araba");
                break;
            case RWANDA:
                System.out.println("Cay");
                break;
            default:
                System.out.println("Tanımlanmamış ülke");
        }

    }
}
