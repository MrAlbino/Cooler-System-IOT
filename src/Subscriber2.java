public class Subscriber2 implements IObserver {
    @Override
    public void update(String message) {
        System.out.println("Abone2'ye gelen mesaj = "+message);
    }
}
