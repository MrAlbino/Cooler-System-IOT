import java.util.Random;

public class SicaklikAlgilayici implements ISicaklikAlgilayici{
    private int sicaklik;
    private Random random=new Random();
    private static SicaklikAlgilayici instance;
    private ISubject publisher;


    private SicaklikAlgilayici(ISubject publisher){
        this.publisher=publisher;
    }

    public static SicaklikAlgilayici getInstance(ISubject publisher){
        if(instance==null){
            instance=new SicaklikAlgilayici(publisher);
        }
        return instance;
    }
    public void aboneEkle(IObserver abone){
        publisher.attach(abone);
    }
    @Override
    public void sicaklikOku() {
        sicaklik=Math.abs(random.nextInt()%100);

        System.out.println("Sıcaklık: "+sicaklik);

        if(sicaklik>60){
            publisher.notify("Sıcaklık 60 derecenin üzerine çıktı, soğutucuyu açmanız tavsiye edilir..");
        }
    }
}
