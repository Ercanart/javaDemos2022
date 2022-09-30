public class BaseKrediManager {
    public double hesapla(double tutar) {
        return tutar * 1.18;
    }

    /*public final double hesapla(double tutar) { //final keyword' ü ile override engellenir.
        return tutar * 1.18;
    }*/
}
