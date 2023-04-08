package praticejava;

import java.util.ArrayList;
import java.util.List;

public class C014_Arrays {

/*
Size verilen ArrayList'ten 8 (inclusive-dahil) ve 8 den önceki tüm elemanlari 2 katina çıkarınız

 */
public static void main(String[] args) {
    List<Integer> nums=new ArrayList<>();
    nums.add(1);
    nums.add(2);
    nums.add(3);
    nums.add(4);
    nums.add(5);
    nums.add(6);
    nums.add(7);
    nums.add(8);
    nums.add(9);
    nums.add(10);

    System.out.println(nums);

    for (int i = 0; i <nums.size() ; i++) {


        if (nums.get(i)==8){
            nums.set(i,nums.get(i)*2);
            break;
        }
    nums.set(i,nums.get(i)*2);
    }

    System.out.println("değiştirilmiş hali " +nums);
}
}
