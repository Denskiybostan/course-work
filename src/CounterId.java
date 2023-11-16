import java.util.concurrent.atomic.AtomicInteger;

public class CounterId {
    public static AtomicInteger COUNTE = new AtomicInteger(1);
    private int id;
    public CounterId() {
        id = COUNTE.getAndIncrement();
    }
    public int getId() {
        return id;
    }
}
