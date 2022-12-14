public class Main {
    public static void main(String[] args) {
        //referance type
        CustomerManager customerManager = new CustomerManager();  //Garbage Collector
        CustomerManager customerManager2 = new CustomerManager();
        customerManager = customerManager2;
        customerManager.Add();
        customerManager.Remove();
        customerManager.Update();

        /*
        CustomerManager customerManager = new CustomerManager();
        customerManager.Add();
        customerManager.Remove();
        customerManager.Update();
        */

        // value type - değer tipler sadece stack de çalışır.
        int sayi1 = 10;
        int sayi2 = 20;
        sayi2 = sayi1;
        sayi1 = 30;
        System.out.println(sayi2);  // sayi2 = 10 olur. value type

        int[] sayilar1 = new int[]{1,2,3};
        int[] sayilar2 = new int[]{4,5,6};
        sayilar2 = sayilar1;
        sayilar1[0]=10;
        System.out.println(sayilar2[0]);
        //new'ledik ve heap kısmında yer açtık.
        //referans tuttuğu için, referans tip gibi düşünülür ve sonuç 10 olur yine.

    }
}