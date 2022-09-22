public class Main {
    public static void main(String[] args) {
        String mesaj = ("  Bugün hava çok güzel.  ");
        System.out.println(mesaj);

        /*System.out.println("Eleman Sayısı : "+mesaj.length());
        System.out.println("5. eleman : "+mesaj.charAt(4));
        System.out.println(mesaj.concat(" Yaşasın!"));  //Metinin sonuna yeni metin ekler.
        System.out.println(mesaj.startsWith("b")); //B ile başlıyor mu?  True / False
        System.out.println(mesaj.endsWith(".")); // Nokta ile bitiyor mu? Java büyük-küçük harf duyarlı bir dildir.

        char[] karakterler = new char[5];
        mesaj.getChars(0,5,karakterler,0);
        System.out.println(karakterler);

        System.out.println(mesaj.indexOf('a')); //karakterin kaçıncı sırada olduğunu gösterir.
        System.out.println(mesaj.lastIndexOf("a"));*/

        System.out.println(mesaj.replace(' ','-'));
        String yeniMesaj = mesaj.replace(' ','-');
        System.out.println(yeniMesaj);
        System.out.println(mesaj.substring(2,5));

        for (String kelime : mesaj.split(" ")) { //Sözcükleri alt alta sıraladı, destruct etti.
            System.out.println(kelime);
        }
        System.out.println(mesaj.toLowerCase());  //küçük harf
        System.out.println(mesaj.toUpperCase());  //Büyük harf
        System.out.println(mesaj.trim()); //Metnin sağında ve solunda, yukarıda bırakılan kadar boşluk bıraktı.


    }
}