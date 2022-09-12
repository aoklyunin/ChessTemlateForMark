import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

public class Main {
    public static void main(String[] args) {
        ArrayList<Vector2> lst = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            Vector2 v = new Vector2();
            v.x = ThreadLocalRandom.current().nextDouble();
            v.y = ThreadLocalRandom.current().nextDouble();
            lst.add(v);
        }

        for (int i = 0; i < lst.size(); i++) {
            System.out.println(lst.get(i));
        }




        Vector2 v = new Vector2();
        v.x = 10;
        v.y = 15;
        System.out.println(v);
    }
}