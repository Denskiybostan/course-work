public class CounterId {
    public static int COUNTED;
    private int id;
    public CounterId() {
        id = COUNTED;
    }
    public int getId() {
        return id;
    }
}
