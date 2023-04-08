package day23abstraction;

public abstract class Animal {

    //body'si olmayan methodu'lar "abstract method olarak adlandirilir
    //bir methodu abstracht yapmak için; i)Method body'i sil  ii) abstract" keyword kullan
    // abstract methodlar "abstract class" içinde olmalidir.

      public abstract void eat();

    //abstract class'larda hem abstract hem de concrete method kullanilabilir
    public void drink(){
    System.out.println("Animals drink...");

}
    //abstract "move" method olusturunuz
    public abstract void move();


}
