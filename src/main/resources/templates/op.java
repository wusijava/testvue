package templates;

public class op {
    private static op ourInstance = new op();

    public static op getInstance() {
        return ourInstance;
    }

    private op() {
    }
}
