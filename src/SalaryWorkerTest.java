import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SalaryWorkerTest {

    @Test
    public void salaryTest() {

        SalaryWorker sw =
                new SalaryWorker(
                        "Sarah",
                        "Wilson",
                        "1",
                        "Dr.",
                        1980,
                        52000);

        assertEquals(
                1000,
                sw.calculateWeeklyPay(50),
                .01);
    }
}