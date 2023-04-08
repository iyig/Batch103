package praticejava;

public class C011_DoWhileLoop {
/*

Adada yalnız bir maymun var
Her gün 4 muz yemesi gerekiyor
o adada sadece 165 muz var
Aşağıdaki değişkenleri olusturun ve maymun un kac gün hayatta kalabileceğini hesaplayan kodu yazınız
int MuzSayısı=165 hayatta kalmaDays=0;
boolean maymunAlive=true;

 */

    public static void main(String[] args) {
        int muzSayisi=165;
        boolean maymunAlive=true;
        int survivalDays=1;

        do{
muzSayisi-=4;// her gün 4 muz eksiltir
survivalDays++;
if (muzSayisi<4){
    maymunAlive=false;
    System.out.println("bugün  " + (survivalDays+1) + "gun yaşayamadı muz kalmadi.Maymun oldu");
}else System.out.println("bugun" + survivalDays+ "gun yaşadı Muz bitmedi.Maymun hayatta");


        }while(maymunAlive);
        System.out.println("toplam maymunun yaşadığı gün sayisi"+ (survivalDays-1));
    }
}
