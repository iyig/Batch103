package day15statickeywordencapsulation;

/*
/Encapsulation: Data Hiding (Gizlemek) demektir.
    //Data'yi nicin  gizlerseniz? Data'yi diş etkenlerden korumak için
    //Data'yi nasil gizlersin? Access Modifier'ini "private" yaparak gizlerim
    // Data'yi gizlediketen sonra başka Class'lardan okumak istersen ne yaparsin?
    //"get" (getter) methodlar olusturarak gizlediğimiz data'ları okunur hale getriebilirz
    //Data'yi gizledikten sonra başka Class'lardan değiştirmek  istersen ne yaparsin?
    // "set" metholar olusturarak gizlediğimiz  datalari değiştirebiliriz

   Variable'in data Type" i ile get methodun "return type" i ayni olmalidir
   get methodları isimlendirirken "get+ variable name" ancak variable'in data type'i boolean is "is +variable name"
 */

public class Student {

    public String stdName="Tom Hanks";
    private String sdtId="TH202201";
    private double gpa=3.8;
    private boolean retired=false;


    public String getSdtId() {
        return sdtId;
    }

    public double getGpa() {
        return gpa;
    }

    public boolean isRetired() {
        return retired;
    }

    public void setSdtId(String sdtId) {
        this.sdtId = sdtId;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public void setRetired(boolean retired) {
        this.retired = retired;
    }
}
