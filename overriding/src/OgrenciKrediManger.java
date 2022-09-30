public class OgrenciKrediManger extends BaseKrediManager{
    public double hesapla(double tutar) { //override
        return tutar * 1.10;
    }
}
