import java.util.Scanner;

public class AkilliCihaz {

    private IAgArayuzu agArayuzu;
    private ISogutucuVeritabani sogutucuVeritabani;

    private static AkilliCihaz instance;

    private static final String SOGUTUCU_AC="1";
    private static final String SOGUTUCU_KAPAT="2";
    private static final String SICAKLIK_OLC="3";
    private static final String CIKIS="4";

    private AkilliCihaz(ISogutucuVeritabani veritabani){
        agArayuzu=AgArayuzu.getInstance();
        sogutucuVeritabani=veritabani;
    }

    public static AkilliCihaz getInstance(ISogutucuVeritabani veritabani){
        if(instance==null){
            instance=new AkilliCihaz(veritabani);
        }
        return instance;
    }

    public void basla(){
        agArayuzu.mesajGoruntule("Cihaz başlatılıyor..");
        agArayuzu.mesajGoruntule("Kullanıcı adı ve şifre giriniz..");

        String kullaniciAdi;
        String sifre;

        agArayuzu.girdiMesajiGoruntule("Kullanıcı Adı:");
        kullaniciAdi=agArayuzu.isimAl();
        agArayuzu.girdiMesajiGoruntule("Şifre:");
        sifre=agArayuzu.soyisimAl();


        if(sogutucuVeritabani.kullaniciDogrula(kullaniciAdi,sifre)){

            this.islemSecimi();
        }
        else{
            agArayuzu.mesajGoruntule("Kullanıcı Doğrulanamadı..");
        }
    }
    private void islemSecimi(){
        String secim;
        do {
            secim=this.menuyuGoster();
            switch (secim){
                case SOGUTUCU_AC:
                        agArayuzu.istekGonder(SOGUTUCU_AC);
                    break;
                case SOGUTUCU_KAPAT:
                        agArayuzu.istekGonder(SOGUTUCU_KAPAT);
                    break;
                case SICAKLIK_OLC:
                        agArayuzu.sicaklikGonder();
                    break;
                case CIKIS:
                    System.out.println("Çıkış yapılıyor..");
                    break;
                default:
                    System.out.println("1-4 arasında değer girmelisiniz..");
                    break;
            }
        }while(!secim.equals("4"));
    }

    private String menuyuGoster(){

        agArayuzu.mesajGoruntule("*************");
        agArayuzu.mesajGoruntule("1-Soğutucu Aç");
        agArayuzu.mesajGoruntule("2-Soğutucu Kapat");
        agArayuzu.mesajGoruntule("3-Sıcaklık Görüntüle");
        agArayuzu.mesajGoruntule("4-Çıkış");
        agArayuzu.mesajGoruntule("*************");

        return agArayuzu.secimAl();
    }
}
