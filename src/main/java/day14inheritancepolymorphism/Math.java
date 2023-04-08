package day14inheritancepolymorphism;

public class Math extends Courses{

    public void pratice(){
        System.out.println("Solve questions");
    }
public Math(){
        super("X");
    System.out.println("Constructor 1");
}
public Math(int a){
        this();// Ayni Class'ın içinde diger Constructor'i kullan
    System.out.println("Constructor 2");
}


}
