import java.util.Random;

public class SicaklikOlcme implements IIslem {
    private Random random=new Random();
    private static SicaklikOlcme instance;

    private SicaklikOlcme(){

    }

    public static SicaklikOlcme getInstance(){
        if(instance==null){
            instance=new SicaklikOlcme();
        }
        return instance;
    }

    @Override
    public void islemYap() {
        System.out.print("Sıcaklık: ");
    }
}
