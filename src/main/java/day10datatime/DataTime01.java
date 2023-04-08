package day10datatime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;
import java.util.Locale;

public class DataTime01 {

    public static void main(String[] args) {
        //Example 1: "Anlik tarihi" (Current Date) ekrana yazdıran kodu yazınız

        LocalDate currentDate = LocalDate.now();
        System.out.println(currentDate);//2022-11-06

        //Example 2: "Anlik zaman" (Current Time) ekrana yazdıran kodu yazınız
        LocalTime currentTime = LocalTime.now();


        System.out.println(currentTime);//23:47:06.263918800

        //Example 3: "Anlik tarihi" (Current Date) ve "Anlik zamanı"(Current Time) ekrana yazdıran kodu yazınız
        LocalDateTime currentDateTime = LocalDateTime.now();
        System.out.println(currentDateTime);

        //Example 4: Japonya'daki Anlik tarihi(Current Date)  ve Anlik zamani(Current Time)  ekrana yazdırınız
        LocalDateTime currentDateTimeInJapan = LocalDateTime.now(ZoneId.of("Asia/Tokyo"));
        System.out.println(currentDateTimeInJapan);//2022-11-07T05:54:56.687985300

        LocalDateTime currentDateTimeInGermany = LocalDateTime.now(ZoneId.of("Europe/Berlin"));
        System.out.println(currentDateTimeInGermany);//2022-11-06T22:02:58.078583900

        // Example 6: Bugünden 789 gün sonra emekli olacağınız göre, emekli tarihini hesaplayın

        LocalDate countDate = LocalDate.of(2022, 11, 7);
        LocalDate retireDate = countDate.plusDays(789);
        System.out.println(retireDate);

        //Example 7: İki cocuğunuzun doğum tarihleri arasındaki farki gün olarak hesaplayin

        LocalDate dobVeli = LocalDate.of(2000, 12, 20);
        LocalDate dobAli = LocalDate.of(2007, 6, 18);

        // between (dobAli,dobVEli) methodu kullanildığınında dah eski olan tarih önce yazılmalidir
        Long diff = ChronoUnit.DAYS.between(dobVeli, dobAli);
        System.out.println(diff);

        //Example 8: İstanbul'un Fethi ile ,Cumhuriyet'in kurulması arasında kaç ay olduğunu gösteren kodu yazınız
        //29 Mayis 1453==> İstanbulun Fethi     29Ekim 1923  ==> Cumhuriyetin kuruluşu

        LocalDate istanbulunFethi = LocalDate.of(1453, 5, 29);
        LocalDate cumhuriyetKuruluş = LocalDate.of(1923, 10, 29);
        Long aySayisi = ChronoUnit.MONTHS.between(istanbulunFethi, cumhuriyetKuruluş);
        System.out.println(aySayisi);

        //    Example 9: Verilen tarih'in hangi burcta olduğunu gösteren kodu yazınız

        LocalDate myDate = LocalDate.of(1989, 4, 13);

        int day = myDate.getDayOfMonth();
        int month = myDate.getMonthValue();
        System.out.println(day + " -" + month);

        if (day >= 21 && month == 3) {
            System.out.println("Koc");
        } else if (day <= 20 && month == 4) {
            System.out.println("Koc");
        } else if (day >= 21 && month == 4) {
            System.out.println("Boğa");
        } else if (day <= 20 && month == 5) {
            System.out.println("Boğa");
        }
  //2.Yol
        if((day>=21 && month==3) || (day<=20 && month==4)){
            System.out.println("Koc");

        }else if((day >= 21 && month == 4 ) || (day <= 20 && month == 5)){
            System.out.println("Boğa");

    }

    }
}