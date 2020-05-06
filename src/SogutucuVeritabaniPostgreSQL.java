import java.sql.*;

public class SogutucuVeritabaniPostgreSQL implements ISogutucuVeritabani{

    private static SogutucuVeritabaniPostgreSQL instance;
    private static String userName="postgres";
    private static String password="159753123ak";
    private static String dbUrl="jdbc:postgresql://localhost:5432/AkilliCihazUygulama";

    private SogutucuVeritabaniPostgreSQL(){

    }
    private Connection baglan(){

        Connection conn=null;

        try {
            conn = DriverManager.getConnection(dbUrl,userName,password);
            if (conn != null)
                System.out.println("Veritabanına bağlanıldı..!");
            else
                System.out.println("Bağlantı girişimi başarısız!");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return conn;
    }
    public static SogutucuVeritabaniPostgreSQL getInstance(){
        if(instance==null){
            instance=new SogutucuVeritabaniPostgreSQL();
        }
        return instance;
    }
    @Override
    public boolean kullaniciDogrula(String isim, String sifre){
        Connection conn=this.baglan();

        String sql= "SELECT \"kullaniciAdi\",\"sifre\" FROM \"Kullanici\" WHERE \"kullaniciAdi\"="+"'"+isim+"'"+"AND \"sifre\"="+"'"+sifre+"'";

        try {
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);

            conn.close();

            if(rs.next()==false){
                return false;
            }
            else{
                System.out.println("Kullanıcı doğrulama işlemi başarılı..!");
                return true;
            }

        }
        catch (Exception e){
            e.printStackTrace();
            return false;
        }

    }
}
