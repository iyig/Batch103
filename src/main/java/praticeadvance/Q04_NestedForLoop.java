package praticeadvance;

public class Q04_NestedForLoop {

    public static void main(String[] args) {
        int arr[][]={{1,2},{3},{4,5,6}};
        int x=0;
        for (int[] w: arr){
            for (int z:w){
                x=x+z;
            }
        }
        System.out.println(x);//21

    }


}
