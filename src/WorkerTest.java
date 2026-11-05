import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class WorkerTest {

    @Test
    public void regularPayTest() {

        Worker worker =
                new Worker("John",
                        "Smith",
                        "1",
                        "Mr.",
                        1990,
                        20);

        assertEquals(
                800,
                worker.calculateWeeklyPay(40));
    }

    @Test
    public void overtimePayTest() {

        Worker worker =
                new Worker("John",
                        "Smith",
                        "1",
                        "Mr.",
                        1990,
                        20);

        assertEquals(
                1100,
                worker.calculateWeeklyPay(50));
    }
}