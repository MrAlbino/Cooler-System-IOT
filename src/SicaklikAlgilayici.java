import java.util.Random;

public class SicaklikAlgilayici implements ISicaklikAlgilayici{
    private Random random=new Random();
    private static SicaklikAlgilayici instance;


    private SicaklikAlgilayici(){

    }

    public static SicaklikAlgilayici getInstance(){
        if(instance==null){
            instance=new SicaklikAlgilayici();
        }
        return instance;
    }
    @Override
    public void sicaklikOku() {
        System.out.println("Sıcaklık: "+Math.abs(random.nextInt()%100));

    }
}
