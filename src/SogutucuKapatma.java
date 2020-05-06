public class SogutucuKapatma implements IIslem{
    private static SogutucuKapatma instance;

    private SogutucuKapatma(){

    }

    public static SogutucuKapatma getInstance(){
        if(instance==null){
            instance=new SogutucuKapatma();
        }
        return instance;
    }
    @Override
    public void islemYap() {
        System.out.println("Soğutucu Kapatılıyor..");
        System.out.println("Soğutucu: KAPALI");
    }
}
