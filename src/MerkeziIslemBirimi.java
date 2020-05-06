import java.lang.reflect.Method;
import java.util.Random;
import java.util.concurrent.Callable;

public class MerkeziIslemBirimi implements IMerkeziIslemBirimi{

    private IEyleyici eyleyici;
    private IAgArayuzu agArayuzu;
    private ISicaklikAlgilayici sicaklikAlgilayici;
    public MerkeziIslemBirimi(){
        eyleyici= Eyleyici.getInstance();
        sicaklikAlgilayici=SicaklikAlgilayici.getInstance(new Publisher());
        sicaklikAlgilayici.aboneEkle(new Subscriber1());
        sicaklikAlgilayici.aboneEkle(new Subscriber2());
    }

    public void eyleyiciyeGonder(String secim){
        if(secim.equals("1")){
            eyleyici.sogutucuAc();
        }
        if(secim.equals("2")){
            eyleyici.sogutucuKapat();
        }
    }

    @Override
    public void sicaklikAlgilayiciyaGonder() {
        sicaklikAlgilayici.sicaklikOku();
    }
}
