public class Eyleyici implements IEyleyici{
    private static Eyleyici instance;
    private IIslem sogutucuAcma;
    private IIslem sogutucuKapatma;

    private Eyleyici(){
        sogutucuAcma=SogutucuAcma.getInstance();
        sogutucuKapatma=SogutucuKapatma.getInstance();
    }
    public static Eyleyici getInstance(){
        if(instance==null){
            instance=new Eyleyici();
        }
        return instance;
    }

    @Override
    public void sogutucuAc() {
        sogutucuAcma.islemYap();
    }

    @Override
    public void sogutucuKapat() {
        sogutucuKapatma.islemYap();
    }
}
