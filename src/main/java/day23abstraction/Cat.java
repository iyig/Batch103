package day23abstraction;

public class Cat extends Mammal{
/*
Bir method parent class" da "abstract method" ise
Child Class o method'u "override" edip kullanmak zorundadir.
Bu yüzden her hangi bir fonsisyonu Child Class için mecburi yapmak isterseniz o methodu abstract yapmalisiniz
 */
    @Override
    public void move() {
        System.out.println("Cats move");
    }

    @Override
    public void eat() {
        System.out.println("Cats eat");
    }
}
