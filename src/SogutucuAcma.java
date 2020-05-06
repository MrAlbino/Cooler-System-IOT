public class SogutucuAcma implements IIslem {
    private static SogutucuAcma instance;

    private SogutucuAcma(){

    }

    public static SogutucuAcma getInstance(){
        if(instance==null){
            instance=new SogutucuAcma();
        }
        return instance;
    }
    @Override
    public void islemYap() {
        System.out.println("Soğutucu Açılıyor..");
    }
}
