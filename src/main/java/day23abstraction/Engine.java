package day23abstraction;

public interface Engine {
/*
2.Interfacelerdeki tum methodlar abstract olduğu icin interface'lere fully abstraction denir
"Abstract Class" larda abstract method ve "concrete method" bir arada kullanildiği icin
"Abstract Class"lara "fully abstraction"denmez
 */

    //interface'lerde tum methodlar abstract olmak zorundadir
    //interfacelede abstract method olustururken "abstract" keyword kullanmaya gerek yoktur.
//cünkü Java o method'un abstract olduğunu bilir
    // interface'lerdeki tüm methodlar Java tarafından otomatik olarak "public" kabul edilir bu yüzden
    //o methodlar için "public" yazmaya gerek yoktur.

    // "public abstract void eco();" ile "void eco();" ayni anlama gelir

      void eco();
      void gas();
      void tsi();

      // default keyword kullanarak interface'lerin icinde body'si olan methodlar uretebilirsiniz
     //Aşağıdaki non-static method'dir

      public default int add(int a,int b){
          return a+b;
      }
//static keyword kullanarak interface'lerin icinde body'si olan methodlar uretebilirsiniz
//Aşağıdaki method"static method"dur
    public static String update(String str){
          return str + "!";
    }



}



