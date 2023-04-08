package day19ifstatement;

public class IfStatement01 {
    public static void main(String[] args) {
        //İf it rains I will cancel the picnic

        //Example1: Sayi pozitif ise ekrana pozitif yazdırınız
int s=12;

        if (s>0) {
            System.out.println("positiv");
        }

//Example2: Verilen character büyk harf ise ekrana "Buyük Harf" yazdırın

        char ch='A';
        if (ch>='A' &&  ch<='Z'){
            System.out.println("Büyük Harf");


        }

// && islemi sadece boolean ile kullanilir

  //Example3: Verilen bir sayi uç basamakli ise ekrana Uc basamakli yazdırınız


        int n=-123;
        n=Math.abs(n);
        if (n>99 && n<1000){

            System.out.println("Uc basamakli");
        }
  // Example 4: Verilen bir sayi cift sayi ise ekrana cift sayi yazdırınız

        int p=-14;
p=Math.abs(p);


        // "=" işareti atama operatörüdür matematikteki eşittir anlamina gelmez.

       // 2+3 ==5
        if (p%2==0){
            System.out.println("Cift sayi");
        }

   //Example5: Verilen bir sayi 300 den kücük veya 1200 den büyük sie ekrana "Harika sayi" yazdırın
// || sembolu sadece bolean ile kullanilır
        int r= 250;
        if (r<300  || r>1200){

            System.out.println("Harika sayi");
        }


    }



}
