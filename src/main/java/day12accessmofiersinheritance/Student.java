package day12accessmofiersinheritance;

public class Student {

/*
Access Modifier
1)public       2)protected      3)default ( Access Modifier'i default yapmak için access modifier yazmayiz)    4)private,
Note: Access Modifierları genisden dara doğru sayınız
public> protected> default> private
Note: Access Modifierları birer birer acıklayınız
public olanlar her class'dan kullanılabilir
protected olanlar başka package'lerden kullanılamaz anacak başka package'de "child class icinden kullanilabilri
default olanlar başka package'den kullanilamazlar
private olanlar sadece oluşturuldukları Class icinde kullanilabilir
Note: "protected" ile "default un farkını söyleyiniz
protected olanlar başka package'lerden kullanilamaz ancak başka package'de "child class" içinden kullanilabilir
default olanlar başka package'den kullanilamazlar
Note: Classlar için hangi Access Modifier'lar kullanılabilir
public ve default kullanılır ama protected ve private kullanamaz

 */
public String stdName= "TomHanks";

// protected olanlar başka package'lerden kullanılamaz ancak başka package'de "child class" içinden kullanılabilir
protected String address = "Miami";

//default olanlar başka packageden kullanılamazlar

String email="th@gmail.com";

 //private olanlar sadece oluşturudukları Class icinde kullanilabilirler
 private String stdId="20206517004";
}
