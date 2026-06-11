import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class FunctionalInterfacesDemo {
    public static void main(String[] args) {
        Predicate<Integer> isEven = number -> number % 2 == 0;
        Function<String, Integer> findLength = text -> text.length();
        Consumer<String> printMessage = message -> System.out.println("Message: " + message);
        Supplier<Double> randomNumber = () -> Math.random();

        System.out.println("Is 10 even? " + isEven.test(10));
        System.out.println("Length of Java: " + findLength.apply("Java"));
        printMessage.accept("Learning functional interfaces");
        System.out.println("Random number: " + randomNumber.get());
    }
}
