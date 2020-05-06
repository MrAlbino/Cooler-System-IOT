public class Subscriber1 implements IObserver {

    @Override
    public void update(String message) {
        System.out.println("Abone1'e gelen mesaj = "+message);
    }
}
