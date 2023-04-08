package praticeadvance;

public class Q05_NestedLoop {
    public static void main(String[] args) {
        /*

        *
       * *
      * * *
     * * * *
    * * * * *
 */
   for (int satir=1; satir<6; satir++){
       for (int bosluk=6-satir;bosluk>1;bosluk--){
           System.out.print(" ");
       }
  for (int yildiz= 1; yildiz<=satir;yildiz++){
      System.out.print("* ");
  }
       System.out.println();
   }





    }

}
