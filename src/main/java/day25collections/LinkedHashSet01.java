package day25collections;

import java.util.LinkedHashSet;
import java.util.LinkedList;

public class LinkedHashSet01 {
/*

LinkedHashSet'ler elemanları ekleme sirasina (Insertion order) göre yerleştırırler
LinkedHashSet elemanları siralamaları zaman harcadığı için HashSet'lere göre yavaş çalışır
 */
public static void main(String[] args) {
    LinkedHashSet<String>emails=new LinkedHashSet<>();
    emails.add("abc@gmail.com");
    emails.add("bca@gmail.com");
    emails.add("asc@gmail.com");
    emails.add("bde@gmail.com");
    emails.add("axy@gmail.com");
    System.out.println(emails);//[abc@gmail.com, bca@gmail.com, asc@gmail.com, bde@gmail.com, axy@gmail.com]
}
}
