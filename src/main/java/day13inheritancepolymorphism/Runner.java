package day13inheritancepolymorphism;

public class Runner {
    public static void main(String[] args) {
//Inheritance'da variable'lar secilirken Java object'in data type'ina bakar
        //Öncelikli istediğiniz variable'i Object'in data type'i olan Class'da arar
        // o class'da bulamazsa Parent Class'lara bakar
        // Hiçbir Parent Class'da bulamazsa hata verir
        Cat cat1= new Cat();
        System.out.println(cat1.a);//14
        System.out.println(cat1.b);//34
        System.out.println(cat1.c);

        Mammal cat2=  new Cat();
        System.out.println(cat2.a);//13

        Animal cat3= new Cat();
        System.out.println(cat3.a);//12
        //Object olustururken Objectin data type'i Child Classlardan secilemez


        //Inheritance'da methodlar variable'lar seçilirken Java Constructor'a bakar
        //Öncelikle istediğiniz method'u Constructori kullanilan Class'dan alır
        //O class'da bulumazsa Parent Class'lara bakar
        // Hİcbir yerde o methodu bulamazsa hata verir
        Cat cat4=new Cat();
      cat4.eat();
        cat4.drink();
        Mammal cat5= new Mammal();
    cat5.eat();
        Animal cat6= new Animal();
        cat6.eat();//Animal eat
    }
}
