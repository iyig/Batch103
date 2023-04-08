package day28scanner;

import java.util.Scanner;

public class Scanner01 {

// Scanner kullanicidan data almaya yarar,Scanner kullanici ile etkileşim kurmamızı saglar
    // Scanner bir Java Classıdır bu Classı kullanabilmek icin import etmek gerekir
    //Scanner Classı Java nin util kütüphanesidir
    public static void main(String[] args) {

       //Kullanicidan data almak için yapılması gerekenler
        //1.Adım: Scanner Classindan object olusturun
        Scanner input=new Scanner(System.in);

        //2.Kullanicidan ne yapacağını söyle
        System.out.println("Hey kullanici yasini gir");

        //3.Adım: Kullanician aldğınız datayı bir variable'e içine koyun
        byte age=input.nextByte();
        System.out.println("hey kullanıcı senin yasin" + age);
    }}
