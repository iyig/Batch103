package day15statickeywordencapsulation;

public class CarRunner {
    public static void main(String[] args) {
   Car car1=new Car();
        Car car2=new Car();
        Car car3=new Car();
        Car car4=new Car();


        //static variable'lara objeleri kullanarak ulaşmak mümkün ama tavsiye edilmez
        System.out.println(car1.counter);//4

        //Static variable'lara Class ismi kullanarak ulaşımalidir
        System.out.println(Car.counter);

        System.out.println(car1.price);//20001
// static demek Class'a bağlanmış Class elemanlarıdır

        System.out.println(Car.counter);//4
        System.out.println(car2.price);//20001

        System.out.println(Car.counter);//4
        System.out.println(car3.price);//20001

        System.out.println(Car.counter);//4
        System.out.println(car4.price);//20001
/*
    1. static demek Class'a bağlanmış Class elemanlarıdır
    2. static class elemanları bütün objelerin ortak elemanı(gökteki ay gibi)

    3. staticler üzerinde yapılan her değişiklik bütün objeleri etkiler bütün objeler tarafından görülür
  gökteki ayın üstüne bir çizik attığınızda tüm insanlık etkilenir ve görür
    4.Static Class elemanlarına Class üzerinden ulaşılır, objeler staticlere  ulaşmak için kullanılmaz
    5.Static methodların override edilemezler
 */

    }




}
