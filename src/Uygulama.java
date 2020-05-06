public class Uygulama {
    public static void main(String[] args) {

           AkilliCihaz akilliCihaz=AkilliCihaz.getInstance(SogutucuVeritabaniPostgreSQL.getInstance());
           akilliCihaz.basla();
    }
}
