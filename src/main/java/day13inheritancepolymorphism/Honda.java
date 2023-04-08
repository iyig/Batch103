package day13inheritancepolymorphism;

public class Honda extends Car{
public String color;

public Honda(){
super("White", 54000);// buraya geldi==>Car Stringli olan Constructora gidecek
    System.out.println("Honda Constructor");


}
public Honda(String color){
this.color=color;
}

}
