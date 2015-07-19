/**
 * Created by Misha on 19.07.2015.
 */
public class Singl {
    private static Singl ourInstance = new Singl();

    private Singl() {
    }

    public static Singl getInstance() {
        return ourInstance;
    }
}
