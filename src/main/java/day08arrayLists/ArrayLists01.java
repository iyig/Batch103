package day08arrayLists;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

public class ArrayLists01 {
    public static <Charakter> void main(String[] args) {
        List<String> names = new ArrayList<>();

        names.add("Tom");
        names.add("Thomas");
        names.add("Tahsin");
        names.add("Trump");
        names.add("Taceddin");
        System.out.println(names);//[Tom, Thomas, Tahsin, Trump, Taceddin]

        List<String> cities = new ArrayList<>();
        cities.add("Trump");
        cities.add("Tom");
        cities.add("Taceddin");

        names.removeAll(cities);//removeAll() kullandiğinizda sadece ilk list değişir parantezi icindeki list değişmez
        System.out.println(names);
        System.out.println(cities);


        List<String> myNames = new ArrayList<>();

        myNames.add("Thomas");
        myNames.add("Tahsin");


        boolean sonuc1 = names.containsAll(myNames);//Bir listenin icinde coklu elemanlrın var olup olmadığını kontrol eder
        // Hepsi varsa true,en az biri yoksa false veriri
        System.out.println(sonuc1);

        List<String> a = new ArrayList<>();

        a.add("Shoes");
        a.add("TV");
        a.add("Radio");
        a.add("Laptop");
        a.add("Shoes");
        a.add("Book");
        a.add("Shoes");
        System.out.println(a);//[Shoes, TV, Radio, Laptop, Shoes, Book, Shoes]

        //Example!: "a" listinde "Shoes" elemanin ilk görünümünü siliniz

        a.remove("Shoes");
        System.out.println(a);//[TV, Radio, Laptop, Shoes, Book, Shoes]

        //Example2: "a" listinde "Shoes" elemanin tum görünümünü siliniz

        List<String> silinecekler = new ArrayList<>();
        silinecekler.add("Shoes");

        a.removeAll(silinecekler);
        System.out.println(a);//[TV, Radio, Laptop, Book]

//Example3: Bir tane salary listi olusturun eger salary 10000den az ise ½20 10000 ve 10000'den cok ise %10 zam yapınız

        List<Double> salary = new ArrayList<>();
        salary.add(12345.0);
        salary.add(8674.50);
        salary.add(15000.00);
        salary.add(9500.00);
        salary.add(20500.00);


        for (Double w : salary) {

            if (w < 10000) {
                salary.set(salary.indexOf(w), w * 1.2);

            } else {
                salary.set(salary.indexOf(w), w * 1.1);
            }
        }
        System.out.println(salary);//[13579.500000000002, 10409.4, 16500.0, 11400.0, 22550.000000000004]

        //Example 4: İKi Array'in esit olup olmadığını kontrol eden kodu yazınız
        //Not:İki Arraylistin esit olabilmesi icin, elemanlar esit olmali ve ayni elemanlar ayni indexte olmali

        List<Character> m = new ArrayList<>();
        m.add('x');
        m.add('y');
        m.add('z');
        m.add('t');
        List<Character> n = new ArrayList<>();

        n.add('x');
        n.add('y');
        n.add('z');
        //1.yol
        int counter = 0;

        for (int i = 0; i < m.size(); i++) {

            if (m.size() != n.size()) {
                counter++;
                System.out.println("Listeler esit değildir");
                break;


            } else if (m.get(i) != n.get(i)) {


                System.out.println("Listeler esit değildir");
                break;
            }
        }
                if (counter == 0) {
                    System.out.println("Listeler esitti");

                }

          //2.yol
      boolean esitMi= m.equals(n);

                if(esitMi){
                    System.out.println("Listeler esittir");
                }else{
                    System.out.println("Listeler esit değildir");
                }

            }

        }





