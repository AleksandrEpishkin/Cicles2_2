import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;


public class BonusServiceTest {

    @ParameterizedTest
    @CsvFileSource(resources = {"/data.csv"})
    public void test(long amount, boolean isRegistred, int expected) {
        BonusService service = new BonusService();

        long actual = service.calculate(amount, isRegistred);

        Assertions.assertEquals(expected, actual);
    }

}