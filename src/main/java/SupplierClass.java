import java.util.function.DoubleSupplier;
import java.util.function.Supplier;

public class SupplierClass {

    public static void main(String args[]) {
        Supplier<Double> random1 = () -> Math.random();
        DoubleSupplier random2 = Math::random;

        System.out.println(random1.get());
        System.out.println(random2.getAsDouble());
    }
}
