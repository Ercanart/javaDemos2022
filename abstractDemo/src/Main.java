public class Main {
    public static void main(String[] args) {
        CustomerManager customerManager = new CustomerManager();
        /* customerManager.getCustomers(); // Çalışmaz, çünkü newlen'mediği için örneği yoktur. */
        customerManager.databaseManager = new MySqlDatabaseManager();
        customerManager.getCustomers();
    }
}
        /*2- Open/Closed Principle
        Türkçe çevirisi “Açık/Kapalı” olan prensip, projede geliştirilen nesnelerin
        geliştirilmeye açık ama değişime kapalı olmaları gerektiğini ifade eder.
        Yani bir nesne davranışını değiştirmeden yeni özellikler kazabiliyor olmalıdır.
        Bu prensip, sürdürülebilir ve tekrar kullanılabilir yapıda kod yazmanın temelini oluşturur.*/

        /*SOLID prensipleri, bir yazılım geliştiricinin Nesne Yönelimli Programlama (OOP) ile yazılım geliştirirken,
        geliştirdiği yazılımın esnek ve geliştirilmeye uygun olması için uyması gereken kurallar bütünüdür.

          1. S-Single Responsibility Principle -- “Tek Sorumluluk”
          2. O-Open/Closed Principle -- “Açık/Kapalı”
          3. L-Liskov Substitution Principle -- “Yerine Geçme”
          4. I-Interface Segregation Principle -- “Arayüz Ayırımı”
          5. D-Dependency Inversion Principle -- “Bağımlılığın Ters Çevrilmesi”  */