import java.lang.reflect.*;

abstract class Check {
    public Check() {}
}

public class Test {
    public static void main(String[] args) {
        Constructor<?>[] constructors = Check.class.getDeclaredConstructors();

        for (Constructor<?> c : constructors) {
            System.out.println(c);
        }
    }
}
