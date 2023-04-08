package day13inheritancepolymorphism;

public class Car extends Vehicle{

public String color;
int km;
public Car(){

}
public Car(String color,int km){
    super("Car");//parente git Stringli olana
    this.color=color;
     this.km=km;
    System.out.println("Car Constructor");
}
}
