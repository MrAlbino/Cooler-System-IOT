public class Uygulama {
    public static void main(String[] args) {

           //Parametre olarak hangi veritabanını verirsek ona göre çalışmaya başlıyor.
            //Open/Closed ilkesine uygun kullanım
           AkilliCihaz akilliCihaz=AkilliCihaz.getInstance(SogutucuVeritabaniPostgreSQL.getInstance());
           akilliCihaz.basla();
    }
}
