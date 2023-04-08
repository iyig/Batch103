package day10datatime;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DataTime02 {
    public static void main(String[] args) {


        // Example1: Javadan aldığınız Date'i ay/gun/yil" olarak yaziniz

        LocalDate currentDate= LocalDate.now();
        System.out.println(currentDate);

        DateTimeFormatter dtf1= DateTimeFormatter.ofPattern("MM/dd/yyyy");//"MM" 10dan kücük ayları  01,02,03 etc. yazar
     String formattedDate1=  dtf1.format(currentDate);

        System.out.println(formattedDate1);//11/07/2022



        DateTimeFormatter dtf2= DateTimeFormatter.ofPattern("MMM/dd/yyyy");
        String formattedDate2=  dtf2.format(currentDate);

        System.out.println(formattedDate2);//Kas/07/2022


        DateTimeFormatter dtf3= DateTimeFormatter.ofPattern("MMMM/dd/yyyy");
        String formattedDate3=  dtf3.format(currentDate);

        System.out.println(formattedDate3);//Kasım/07/2022

        DateTimeFormatter dtf4= DateTimeFormatter.ofPattern("M/dd/yyyy");//"M"10dan kücük ayları 1,2,3,etc şeklinde yazar
        String formattedDate4=  dtf4.format(currentDate);

        System.out.println(formattedDate4);//11/07/2022

        DateTimeFormatter dtf5= DateTimeFormatter.ofPattern("MM/dd/yy");
        String formattedDate5=  dtf5.format(currentDate);

        System.out.println(formattedDate5);//11/07/22


        DateTimeFormatter dtf6= DateTimeFormatter.ofPattern("MM/d/yyyy");//"d" 10dan kücük ayları 1,2,3,etc şeklinde yazar 01,02 kullanılmaz
        String formattedDate6=  dtf6.format(currentDate);

        System.out.println(formattedDate6);//11/7/2022

        //Example 2: Java dan aldığınız time'in formatını değiştiriniz

        LocalTime myTime=LocalTime.of(4,23,54,2345);

        System.out.println(myTime);//16:23:54.000002345

        DateTimeFormatter dtf7= DateTimeFormatter.ofPattern("HH:mm");//"HH" 24 saat sistemini, hh 12 saat sistemini kullanir
        String formattedMyTime1=dtf7.format(myTime);
        System.out.println(formattedMyTime1);//04:23



        DateTimeFormatter dtf8= DateTimeFormatter.ofPattern("hh:mm a");//"HH" 24 saat sistemini, hh 12 saat sistemini kullanir
       String formattedMyTime2=dtf8.format(myTime);
        System.out.println(formattedMyTime2);//04:23
    }

}
