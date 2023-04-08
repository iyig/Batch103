package day24abstractionCollections;

public interface Engine extends Vehicle {
    //     Child       Parent
    //     Class ---->İnterface    ==>implements
    //     Class------> Class     ==> extends
    // İnterface ---->Interface   ==>extends
    // Interface ---->Class       ==> mumkün degil

    //interface'lerdeki tum variable'lar otomatik olarak(default) "public" dir
    //interface'lerdeki tum variable'lar otomatik olarak(default) "final" dir
    //    interface'lerdeki tum variable'lar otomatik olarak(default) "static" dir
   public final static int price=2000;

    double weight=23.5;


    void run();



}
