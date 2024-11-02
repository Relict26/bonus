import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class BonusServiceTest {

    @Test
    void shouldCalculateForRegisteredAndUnderLimit() {
        BonusService service = new BonusService();

        // данные:
        long amount = 1000;
        boolean registered = true;
        long expected = 30;

        // метод:
        long actual = service.calculate(amount, registered);

        // производим проверку
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldCalculateForRegisteredAndOverLimit() {
        BonusService service = new BonusService();

        // данные:
        long amount = 1_000_000;
        boolean registered = true;
        long expected = 500;

        // метод:
        long actual = service.calculate(amount, registered);

        // производим проверку
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldCalculateForUnregisteredAndUnderLimit() {
        BonusService service = new BonusService();

        // данные:
        long amount = 1000;
        boolean registered = false;
        long expected = 10; // 1% от 1000

        // метод:
        long actual = service.calculate(amount, registered);

        // производим проверку
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldCalculateForUnregisteredAndOverLimit() {
        BonusService service = new BonusService();

        // данные:
        long amount = 1_000_000;
        boolean registered = false;
        long expected = 500; // Лимит 500

        // метод:
        long actual = service.calculate(amount, registered);

        // производим проверку
        Assertions.assertEquals(expected, actual);
    }

}
