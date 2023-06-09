package day08arrayLists;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayList03 {
    public static void main(String[] args) {
        //Example 2: Kullanicidan bir harf alınız, harf sizdeki Liste'in icinde varsa o harfi "Bulundu" ya ceviriniz yoksa
        // o harfi List'e ekleyeniz
        // [A, K ,R ,S] ==> R ==>[A,K; Bulundu, S]
        // [A ,K ,R ,S] ==>X ==>[A,K; R,S,X]

        Scanner input = new Scanner(System.in);
        String harf = "";
        List<String> c = new ArrayList<>();
        c.add("A");
        c.add("K");
        c.add("R");
        c.add("S");
        do {
            System.out.println("Lütfen bir harf giriniz");
            harf = input.next().substring(0, 1);


            if (c.contains(harf)) {

                c.set(c.indexOf(harf), "Bulundu");
            } else if (!harf.equals("Q")) {
                c.add(harf);
            }

            System.out.println(c);
        }while (!harf.equals("Q"));


        }

    }
