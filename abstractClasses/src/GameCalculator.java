public abstract class GameCalculator {
    public abstract void hesapla(); //Kim inherit ediyorsa metodu kullanmak zorundadır fakat override etmelidir.

    public final void gameOver() {  //Bu class ı kim inherit ediyorsa, bu metodu kullanmak zorundadır.
        System.out.println("Oyun bitti");
    }
 }
 /*Bir sınıfın veya operasyonun abstract olabilmesi için abstract imzası ile kullanılması gerekiyor.
 * Abstract sınıflar asla new' lenemez */
