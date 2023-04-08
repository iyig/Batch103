package day15statickeywordencapsulation;

import day13inheritancepolymorphism.CatRunner;

public class Car {


     public static String make= "Honca";

    public String model="Accord";

    public int price= 20000;
    public static int counter=0;
   public Car(){
        counter++;
        price++;
}

}
