public class Main {
    public static void main(String[] args) {
        //Sadece kendisine ve 1 sayısına kalansız bölünebilen 1'den büyük tam sayılardır.
        //En küçük asal sayı 2'dir.1 sayısı günümüzde ne asal ne de
        // bileşik kabul edilir ve özel bir durumu vardır.
        //bug
        int number = 14;
        int remainder = number %2;  //remainder operatörü kalan sayıyı verir.
        /*System.out.println(remainder);*/
        boolean isPrime = true;

        if (number==1) {
            System.out.println("Sayı asal değildir ");
            return; //Bağlı bulunulan bgit add .loğu(metodu) bitirir.
        }
        if (number<1) {
            System.out.println("Geçersiz sayı");
        }

        for (int i=2; i<number; i++) {
            if (number % i ==0) {
                isPrime =false;
            }
        }

        if (isPrime) {
            System.out.println("Sayı asaldir.");
        }else {
            System.out.println("Sayı asal değildir.");
        }
    }
}