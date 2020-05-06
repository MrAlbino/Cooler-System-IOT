import java.util.Random;
import java.util.Scanner;

public class AgArayuzu implements IAgArayuzu{

    private Scanner scan=new Scanner(System.in);
    private static AgArayuzu instance;
    private IMerkeziIslemBirimi merkeziIslemBirimi;

    private AgArayuzu(){
        merkeziIslemBirimi=new MerkeziIslemBirimi();
    }

    public static AgArayuzu getInstance(){
        if(instance==null){
            instance=new AgArayuzu();
        }
        return instance;
    }
    public String isimAl(){
        return scan.next();
    }
    public String soyisimAl(){
        return scan.next();
    }
    public void mesajGoruntule(String mesaj){
        System.out.println(mesaj);
    }
    public void girdiMesajiGoruntule(String mesaj){
        System.out.print(mesaj);
    }
    public String secimAl(){
        return scan.next();
    }

    @Override
    public void istekGonder(String secim) {
        merkeziIslemBirimi.eyleyiciyeGonder(secim);
    }
    @Override
    public void sicaklikGonder(){
        merkeziIslemBirimi.sicaklikAlgilayiciyaGonder();
    }

}
